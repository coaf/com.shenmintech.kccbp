package com.shenmintech.cbp.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shenmintech.base.template.IdWorkerTemplate;
import com.shenmintech.cbp.biz.vo.HomeworkType;
import com.shenmintech.cbp.biz.vo.WeekFlag;
import com.shenmintech.cbp.biz.vo.ques.Req4PostPushHomeworkVo;
import com.shenmintech.cbp.biz.vo.res.PushHomeworkVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetPushHomeworksVo;
import com.shenmintech.cbp.biz.vo.res.Son4GetPushHomeworksVo;
import com.shenmintech.cbp.entity.PagingExample;
import com.shenmintech.cbp.entity.TKcCourseTable;
import com.shenmintech.cbp.entity.TKcCourseTableExample;
import com.shenmintech.cbp.entity.TKcCourseTableGroupRelation;
import com.shenmintech.cbp.entity.TKcCourseTableGroupRelationExample;
import com.shenmintech.cbp.entity.TKcGroup;
import com.shenmintech.cbp.entity.TKcGroupExample;
import com.shenmintech.cbp.entity.TKcHomework;
import com.shenmintech.cbp.entity.TKcHomeworkPicTxt;
import com.shenmintech.cbp.entity.TKcHomeworkSignCard;
import com.shenmintech.cbp.entity.TKcHomeworkStudentRelation;
import com.shenmintech.cbp.entity.TKcHomeworkStudentRelationExample;
import com.shenmintech.cbp.entity.TKcHomeworkTask;
import com.shenmintech.cbp.entity.TKcHomeworkTaskExample;
import com.shenmintech.cbp.entity.TKcHomeworkWorkCard;
import com.shenmintech.cbp.entity.TKcStudent;
import com.shenmintech.cbp.entity.TKcStudentExample;
import com.shenmintech.cbp.exception.ApplicationException;
import com.shenmintech.cbp.mapper.TKcCourseTableGroupRelationMapper;
import com.shenmintech.cbp.mapper.TKcCourseTableMapper;
import com.shenmintech.cbp.mapper.TKcGroupMapper;
import com.shenmintech.cbp.mapper.TKcHomeworkMapper;
import com.shenmintech.cbp.mapper.TKcHomeworkPicTxtMapper;
import com.shenmintech.cbp.mapper.TKcHomeworkSignCardMapper;
import com.shenmintech.cbp.mapper.TKcHomeworkStudentRelationMapper;
import com.shenmintech.cbp.mapper.TKcHomeworkTaskMapper;
import com.shenmintech.cbp.mapper.TKcHomeworkWorkCardMapper;
import com.shenmintech.cbp.mapper.TKcStudentMapper;
import com.shenmintech.cbp.service.IHomeworkPushService;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.DateUtil;
import com.shenmintech.common.util.GsonUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class HomeworkPushServiceImpl implements IHomeworkPushService {

  @Autowired
  IdWorkerTemplate idWorkerTemplate;

  @Autowired
  TKcCourseTableMapper tKcCourseTableMapper;

  @Autowired
  TKcGroupMapper tKcGroupMapper;

  @Autowired
  TKcHomeworkMapper tKcHomeworkMapper;

  @Autowired
  TKcCourseTableGroupRelationMapper tKcCourseTableGroupRelationMapper;

  @Autowired
  TKcHomeworkStudentRelationMapper tKcHomeworkStudentRelationMapper;

  @Autowired
  TKcHomeworkPicTxtMapper tKcHomeworkPicTxtMapper;

  @Autowired
  TKcHomeworkSignCardMapper tKcHomeworkSignCardMapper;

  @Autowired
  TKcHomeworkWorkCardMapper tKcHomeworkWorkCardMapper;

  @Autowired
  TKcHomeworkTaskMapper tKcHomeworkTaskMapper;

  @Autowired
  TKcStudentMapper tKcStudentMapper;

  @Override
  public void checkAddPushHomework(String homeworkId, String clazzId, List<String> groupIds,
      String pushFlag) {
    // 校验推送的课后任务和小组是不是归属于同一个课程内
    TKcCourseTable courseTable = tKcCourseTableMapper.selectByPrimaryKey(clazzId);
    String courseFid = courseTable.getCourseFid();

    TKcGroupExample example = new TKcGroupExample();
    example.or().andStatusNotEqualTo(-1).andIdIn(groupIds);
    List<TKcGroup> groups = tKcGroupMapper.selectByExample(example);
    if (!groups.stream().allMatch(n -> n.getCourseFid().equals(courseFid)))
      throw new ApplicationException(Constants.META_STATUS_CODE_D1, "存在不属于同一课程下的小组，不能添加！",
          Constants.BLANKSTR);

    // 需要校验绑定的课程对所要推送的小组是否都已经设定上课时间
    TKcCourseTableGroupRelationExample courseTableGroupRelationExample =
        new TKcCourseTableGroupRelationExample();
    courseTableGroupRelationExample.or().andStatusNotEqualTo(-1).andCourseTableFidEqualTo(clazzId)
        .andGroupFidIn(groupIds);
    int count = tKcCourseTableGroupRelationMapper.countByExample(courseTableGroupRelationExample);
    if (count != groupIds.size()) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
        "小组针对课程没有都制定上课时间，故添加推送任务失败", Constants.BLANKSTR);
  }

  @Override
  public void addPushHomework(Req4PostPushHomeworkVo req4PostPushHomeworkVo) {// 添加推送表数据
    String homeworkId = req4PostPushHomeworkVo.getHomeworkId();
    String clazzId = req4PostPushHomeworkVo.getClazzId();
    List<String> groupIds = req4PostPushHomeworkVo.getGroupIds();
    String teacherId = req4PostPushHomeworkVo.getTeacherId();
    String companyId = req4PostPushHomeworkVo.getCompanyId();
    String courseId = req4PostPushHomeworkVo.getCourseId();
    String pushFlag = req4PostPushHomeworkVo.getPushFlag();
    String remark = req4PostPushHomeworkVo.getRemark();

    // 业务校验
    TKcHomework homework = tKcHomeworkMapper.selectByPrimaryKey(homeworkId);
    String homeworkTypeId = homework.getWorkTypeFid();
    if (HomeworkType.SIGN_CARD.getCode().equals(homeworkTypeId) && StringUtils.isBlank(clazzId))
      throw new ApplicationException(Constants.META_STATUS_CODE_D1, "打卡类型的任务必须指定某个课的课时实例",
          Constants.BLANKSTR);

    TKcHomework tKcHomework = new TKcHomework();
    tKcHomework.setId(homeworkId);
    tKcHomework.setStatus(1);
    tKcHomeworkMapper.updateByPrimaryKeySelective(tKcHomework);

    // 组织表内业务数据
    int size = groupIds.size();
    String groupFids = Constants.ALL;
    if (1 == size) groupFids = groupIds.get(0);
    String pushId = idWorkerTemplate.generateId();

    // 录入推送任务
    TKcHomeworkTask tKcHomeworkTask = new TKcHomeworkTask();
    tKcHomeworkTask.setId(pushId);
    tKcHomeworkTask.setTeacherId(teacherId);
    tKcHomeworkTask.setHomeworkFid(homeworkId);
    tKcHomeworkTask.setCompanyFid(companyId);
    tKcHomeworkTask.setCourseFid(courseId);
    tKcHomeworkTask.setGroupFids(groupFids);
    tKcHomeworkTask.setClazzFid(clazzId);
    tKcHomeworkTask.setPushTimeTypeFid(pushFlag);
    if (Constants.META_STATUS_CODE_0.equals(pushFlag))
      tKcHomeworkTask.setStatus(1);
    else
      tKcHomeworkTask.setStatus(0);
    tKcHomeworkTask.setRemark(remark);
    tKcHomeworkTaskMapper.insertSelective(tKcHomeworkTask);

    // 从小组id查出所有的学生id
    List<String> gList = new ArrayList<>();
    if (Constants.ALL.equals(groupFids)) {
      TKcGroupExample groupExample = new TKcGroupExample();
      groupExample.or().andStatusNotEqualTo(-1).andCourseFidEqualTo(courseId);
      List<TKcGroup> groups = tKcGroupMapper.selectByExample(groupExample);
      if (null == groups || 0 == groups.size())
        throw new ApplicationException(Constants.META_STATUS_CODE_D1, "当前课程没有规划任何小组",
            Constants.BLANKSTR);
      gList = groups.stream().map(n -> n.getId()).collect(Collectors.toList());
    } else
      gList.addAll(groupIds);

    TKcStudentExample kcStudentExample = new TKcStudentExample();
    kcStudentExample.or().andStatusNotEqualTo(-1).andGroupFidIn(gList);
    List<TKcStudent> students = tKcStudentMapper.selectByExample(kcStudentExample);
    List<String> studentIds = students.stream().map(n -> n.getId()).collect(Collectors.toList());

    if (Constants.META_STATUS_CODE_0.equals(pushFlag)) {// 即时推送，马上添加课后任务实例
      try {
        this.insertRelations(studentIds, pushId, homeworkId, courseId, clazzId);
      } catch (ApplicationException e) {
        throw e;
      }

    } else {// 定时推送

    }
  }

  @Override
  public Res4GetPushHomeworksVo selectByTeacherIdPages(String teacherId, int pageNo,
      int rowsPerPage) {
    Res4GetPushHomeworksVo res4GetPushHomeworksVo = new Res4GetPushHomeworksVo();
    TKcHomeworkTaskExample example = new TKcHomeworkTaskExample();
    example.or().andStatusNotEqualTo(-1).andTeacherIdEqualTo(teacherId);
    int recordCount = tKcHomeworkTaskMapper.countByExample(example);
    PagingExample pagingExample = new PagingExample(pageNo, rowsPerPage);
    example.setPagingExample(pagingExample);
    List<TKcHomeworkTask> homeworkTasks = tKcHomeworkTaskMapper.selectByExample(example);
    Iterator<TKcHomeworkTask> it = homeworkTasks.iterator();
    List<Son4GetPushHomeworksVo> list = new ArrayList<>();
    while (it.hasNext()) {
      Son4GetPushHomeworksVo vo = new Son4GetPushHomeworksVo();
      TKcHomeworkTask homeworkTask = it.next();
      BeanUtils.copyProperties(homeworkTask, vo);
      list.add(vo);
    }
    res4GetPushHomeworksVo.setList(list);
    res4GetPushHomeworksVo.setRecordCount(recordCount);
    return res4GetPushHomeworksVo;
  }

  @Override
  public PushHomeworkVo selectById(String id) {
    TKcHomeworkTask pushHomework = tKcHomeworkTaskMapper.selectByPrimaryKey(id);
    if (null == pushHomework || 0 != pushHomework.getStatus())
      throw new ApplicationException(Constants.META_STATUS_CODE_D1, "未查到可修改的id为" + id + "的推送记录",
          Constants.BLANKSTR);
    PushHomeworkVo vo = new PushHomeworkVo();
    BeanUtils.copyProperties(pushHomework, vo);
    return vo;
  }

  @Override
  public void updateByIdSelective(PushHomeworkVo vo) {
    int status = vo.getStatus();
    if (0 != status) throw new ApplicationException(Constants.META_STATUS_CODE_D1, "课后推送任务处于不能更新状态",
        Constants.BLANKSTR);
    TKcHomeworkTask homeworkTask = new TKcHomeworkTask();
    BeanUtils.copyProperties(vo, homeworkTask);
    TKcHomeworkTaskExample example = new TKcHomeworkTaskExample();
    example.or().andIdEqualTo(vo.getId()).andStatusEqualTo(0);
    tKcHomeworkTaskMapper.updateByExampleSelective(homeworkTask, example);
    if ("0".equals(vo.getPushTimeTypeFid())) {// 如果被改成了即时推送

    }
  }

  @Override
  public void insertRelations(List<String> studentIds, String pushId, String homeworkId,
      String courseId, String clazzId) {// *这里的clazzId为课程模板的id，没有上课时间概念
    log.info("将要初始化任务给学生ID为：" + GsonUtil.gson.toJson(studentIds) + "的学生");
    int studentNum = studentIds.size();
    if (studentNum == 0) throw new ApplicationException(Constants.META_STATUS_CODE_D1, "请先在组内添加学员",
        Constants.BLANKSTR);
    List<TKcHomeworkStudentRelation> list = new ArrayList<>();
    String[] idStr = idWorkerTemplate.generateIds(studentNum);
    for (int i = 0; i < idStr.length; i++) {
      TKcHomeworkStudentRelation homeworkStudentRelation = new TKcHomeworkStudentRelation();
      String studentFid = studentIds.get(i);
      homeworkStudentRelation.setId(idStr[i]);
      homeworkStudentRelation.setTaskFid(pushId);
      homeworkStudentRelation.setStudentFid(studentFid);
      homeworkStudentRelation.setHomeworkFid(homeworkId);
      homeworkStudentRelation.setStatus(1);
      list.add(homeworkStudentRelation);
    }
    tKcHomeworkStudentRelationMapper.insertList(list);

    TKcHomework homework = tKcHomeworkMapper.selectByPrimaryKey(homeworkId);
    String workTypeId = homework.getWorkTypeFid();
    if ("1".equals(workTypeId)) {// 图文任务：一节课发一次，针对某个课的实例
      String[] ptIdStr = idWorkerTemplate.generateIds(studentNum);
      List<TKcHomeworkPicTxt> picTxts = new ArrayList<>();
      for (int i = 0; i < ptIdStr.length; i++) {
        TKcHomeworkPicTxt tKcHomeworkPicTxt = new TKcHomeworkPicTxt();
        tKcHomeworkPicTxt.setId(ptIdStr[i]);
        tKcHomeworkPicTxt.setHomeworkStudentRelationFid(idStr[i]);
        tKcHomeworkPicTxt.setContent("#" + homework.getWorkName() + "#");
        tKcHomeworkPicTxt.setStatus(0);
        picTxts.add(tKcHomeworkPicTxt);
      }
      tKcHomeworkPicTxtMapper.insertList(picTxts);
    } else if ("2".equals(workTypeId)) {// 打卡任务：一节课发一次，针对某个课的实例
      List<TKcHomeworkSignCard> signCardList = new ArrayList<>();
      Iterator<String> it = studentIds.iterator();
      while (it.hasNext()) {
        String StudentId = it.next();
        TKcStudent student = tKcStudentMapper.selectByPrimaryKey(StudentId);
        String groupId = student.getGroupFid();// 当前学生所属小组
        TKcCourseTableGroupRelationExample example = new TKcCourseTableGroupRelationExample();
        TKcCourseTableGroupRelationExample.Criteria criteria = example.createCriteria();
        criteria.andStatusNotEqualTo(-1).andGroupFidEqualTo(groupId);
        example.setOrderByClause("pre_start_time");
        List<TKcCourseTableGroupRelation> ctgRelations =
            tKcCourseTableGroupRelationMapper.selectByExample(example);// 当前小组的所有课程
        if (null == ctgRelations || ctgRelations.size() == 0)
          throw new ApplicationException(Constants.META_STATUS_CODE_D1,
              "小组groupId=" + groupId + "还未设置课程表，请先设定课程表，再制定打卡任务", Constants.BLANKSTR);
        criteria.andCourseTableFidEqualTo(clazzId);
        List<TKcCourseTableGroupRelation> curRelations =
            tKcCourseTableGroupRelationMapper.selectByExample(example);// 当前小组的指定课程
        if (null == curRelations || curRelations.size() == 0)
          throw new ApplicationException(Constants.META_STATUS_CODE_D1,
              "小组groupId=" + groupId + ",course_table_fid=" + clazzId + "未设定上课时间",
              Constants.BLANKSTR);
        TKcCourseTableGroupRelation tKcCourseTableGroupRelation = curRelations.get(0);
        Date prestartTime = tKcCourseTableGroupRelation.getPreStartTime();
        TKcCourseTableGroupRelationExample example2 = new TKcCourseTableGroupRelationExample();
        example2.or().andStatusNotEqualTo(-1).andGroupFidEqualTo(groupId)
            .andPreStartTimeGreaterThan(prestartTime);// 当前小组指定课程之后的所有课程
        List<TKcCourseTableGroupRelation> afterCurRelations =
            tKcCourseTableGroupRelationMapper.selectByExample(example2);
        Date nextPrestartTime = new Date();
        int deltaDate = 15;// 两节课程之间的天数，默认15天为最高上限
        if (null != afterCurRelations && 0 < afterCurRelations.size()) {
          nextPrestartTime = afterCurRelations.get(0).getPreStartTime();
          DateTime dateTime1 = new DateTime(prestartTime);
          DateTime dateTime2 = new DateTime(nextPrestartTime);
          deltaDate = Days.daysBetween(dateTime1, dateTime2).getDays();
        }
        TKcHomeworkStudentRelationExample example4 = new TKcHomeworkStudentRelationExample();
        example4.or().andStatusNotEqualTo(-1).andTaskFidEqualTo(pushId)
            .andHomeworkFidEqualTo(homeworkId).andStudentFidEqualTo(StudentId);
        List<TKcHomeworkStudentRelation> homeworkStudentRelations =
            tKcHomeworkStudentRelationMapper.selectByExample(example4);// 锁定到任务主表
        if (null == homeworkStudentRelations || 1 != homeworkStudentRelations.size()) {
          if (null != homeworkStudentRelations) {
            log.info("homeworkStudentRelations================"
                + GsonUtil.gson.toJson(homeworkStudentRelations));
          }
          throw new ApplicationException(Constants.META_STATUS_CODE_D1, "推送给学生的课程实例数不等于1",
              Constants.BLANKSTR);
        }
        String homeworkStudentRelationFid = homeworkStudentRelations.get(0).getId();
        for (int j = 0; j < deltaDate; j++) {
          TKcHomeworkSignCard tKcHomeworkSignCard = new TKcHomeworkSignCard();
          tKcHomeworkSignCard.setId(idWorkerTemplate.generateId());
          tKcHomeworkSignCard.setHomeworkStudentRelationFid(homeworkStudentRelationFid);
          DateTime dateTime = new DateTime(prestartTime).plusDays(j + 1);
          String markDate = dateTime.toString("MM-dd");
          String week = dateTime.toString("EEEE");
          String zhou =
              week.equals(WeekFlag.MONDAY.getEnglisg())
                  ? WeekFlag.MONDAY.getChina()
                  : week.equals(WeekFlag.TUESDAY.getEnglisg())
                      ? WeekFlag.TUESDAY.getChina()
                      : week.equals(WeekFlag.WEDNESDAY.getEnglisg())
                          ? WeekFlag.WEDNESDAY.getChina()
                          : week.equals(WeekFlag.THURSDAY.getEnglisg())
                              ? WeekFlag.THURSDAY.getChina()
                              : week.equals(WeekFlag.FRIDAY.getEnglisg())
                                  ? WeekFlag.FRIDAY.getChina()
                                  : week.equals(WeekFlag.SATURDAY.getEnglisg())
                                      ? WeekFlag.SATURDAY.getChina()
                                      : week.equals(WeekFlag.SUNDAY.getEnglisg())
                                          ? WeekFlag.SUNDAY.getChina()
                                          : Constants.BLANKSTR;
          tKcHomeworkSignCard.setMarkDate(markDate + " " + zhou);
          tKcHomeworkSignCard.setStatus(0);
          signCardList.add(tKcHomeworkSignCard);
        }
      }
      if (null != signCardList && 0 < signCardList.size()) {
        log.info("开始添加打卡子表");
        tKcHomeworkSignCardMapper.insertList(signCardList);
      }
    } else if ("3".equals(workTypeId)) {// 选项卡任务：整个课程发一次，针对课程
      TKcCourseTableExample example = new TKcCourseTableExample();
      example.or().andStatusNotEqualTo(-1).andCourseFidEqualTo(courseId);
      List<TKcCourseTable> courseTables = tKcCourseTableMapper.selectByExample(example);
      int count = courseTables.size();
      if (0 == count) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
          "请先对课程添加课程表模型，再添加推送任务", Constants.BLANKSTR);
      String[] ptIdStr = idWorkerTemplate.generateIds(studentNum * count);
      List<TKcHomeworkWorkCard> workCards = new ArrayList<>();
      for (int i = 0; i < studentIds.size(); i++) {
        int k = 1;
        String studentId = studentIds.get(i);
        TKcStudent student = tKcStudentMapper.selectByPrimaryKey(studentId);
        String groupId = student.getGroupFid();
        for (int j = 0; j < count; j++) {
          TKcCourseTable courseTable = courseTables.get(j);
          String courseTableId = courseTable.getId();
          TKcCourseTableGroupRelationExample relationExample =
              new TKcCourseTableGroupRelationExample();
          relationExample.or().andGroupFidEqualTo(groupId).andCourseTableFidEqualTo(courseTableId);
          List<TKcCourseTableGroupRelation> courseTableGroupRelations =
              tKcCourseTableGroupRelationMapper.selectByExample(relationExample);
          if (null == courseTableGroupRelations || 0 == courseTableGroupRelations.size())
            throw new ApplicationException(Constants.META_STATUS_CODE_D1, "请先对课程添加课程的时间表，再添加推送任务",
                Constants.BLANKSTR);
          Date preDoneTime = courseTableGroupRelations.get(0).getPreStartTime();
          TKcHomeworkWorkCard tKcHomeworkWorkCard = new TKcHomeworkWorkCard();
          tKcHomeworkWorkCard.setId(ptIdStr[j + i * count]);
          tKcHomeworkWorkCard.setHomeworkStudentRelationFid(idStr[i]);
          tKcHomeworkWorkCard.setWeekNo(k);
          tKcHomeworkWorkCard.setStatus(0);
          if (null == preDoneTime) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
              "请先对课程添加课程的开始时间，再添加推送任务", Constants.BLANKSTR);
          tKcHomeworkWorkCard.setRemark1(DateUtil.format(preDoneTime, DateUtil.DATETYPE_1));
          workCards.add(tKcHomeworkWorkCard);
          k++;
        }
      }
      log.info("开始添加课后任务卡子表");
      tKcHomeworkWorkCardMapper.insertList(workCards);
    }

  }

  /*
   * 初始化特定一个学生针对某个小组所有任务，供内部调用
   * 
   */
  @Override
  public void initHomework(String studentId, String groupId) {
    TKcGroup group = tKcGroupMapper.selectByPrimaryKey(groupId);
    String courseId = group.getCourseFid();// 当前小组所属课程
    TKcHomeworkTaskExample example = new TKcHomeworkTaskExample();
    example.or().andStatusNotEqualTo(-1).andGroupFidsEqualTo(groupId);
    example.or().andStatusNotEqualTo(-1).andCourseFidEqualTo(courseId)
        .andGroupFidsEqualTo(Constants.ALL);
    List<TKcHomeworkTask> tasks = tKcHomeworkTaskMapper.selectByExample(example);// 所有的推送任务
    log.info("要初始化的所有推送任务：" + GsonUtil.gson.toJson(tasks));
    if (null == tasks || 0 == tasks.size()) return;
    List<String> studentIds = new ArrayList<>();
    studentIds.add(studentId);
    Iterator<TKcHomeworkTask> it = tasks.iterator();
    while (it.hasNext()) {
      TKcHomeworkTask task = it.next();
      String pushId = task.getId();
      String homeworkId = task.getHomeworkFid();
      String clazzId = task.getClazzFid();
      try {
        this.insertRelations(studentIds, pushId, homeworkId, courseId, clazzId);
      } catch (ApplicationException e) {
        throw e;
      } catch (Exception e) {
        throw e;
      }
    }
    return;
  }

  @Override
  public void cleanHomework(String studentId) {
    TKcHomeworkStudentRelationExample example = new TKcHomeworkStudentRelationExample();
    example.or().andStatusNotEqualTo(-1).andStudentFidEqualTo(studentId);
    TKcHomeworkStudentRelation record = new TKcHomeworkStudentRelation();
    record.setStatus(-1);
    tKcHomeworkStudentRelationMapper.updateByExampleSelective(record, example);
  }

  @Override
  public void cleanAndInit(String studentId, String groupId) {
    try {
      this.cleanHomework(studentId);
      this.initHomework(studentId, groupId);
    } catch (ApplicationException e) {
      throw e;
    } catch (Exception e) {
      throw e;
    }
  }

}
