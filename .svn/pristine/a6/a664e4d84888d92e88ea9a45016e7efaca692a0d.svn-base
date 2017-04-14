package com.shenmintech.cbp.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shenmintech.base.template.IdWorkerTemplate;
import com.shenmintech.cbp.biz.vo.ques.Req4PostGroupVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetGroupVo;
import com.shenmintech.cbp.biz.vo.res.Son4GetGroupVo;
import com.shenmintech.cbp.entity.PagingExample;
import com.shenmintech.cbp.entity.TKcCourse;
import com.shenmintech.cbp.entity.TKcCourseTable;
import com.shenmintech.cbp.entity.TKcCourseTableExample;
import com.shenmintech.cbp.entity.TKcCourseTableGroupRelation;
import com.shenmintech.cbp.entity.TKcCourseTableGroupRelationExample;
import com.shenmintech.cbp.entity.TKcGroup;
import com.shenmintech.cbp.entity.TKcGroupExample;
import com.shenmintech.cbp.entity.TKcStudentExample;
import com.shenmintech.cbp.exception.ApplicationException;
import com.shenmintech.cbp.mapper.TKcCourseMapper;
import com.shenmintech.cbp.mapper.TKcCourseTableGroupRelationMapper;
import com.shenmintech.cbp.mapper.TKcCourseTableMapper;
import com.shenmintech.cbp.mapper.TKcCourseTypeMapper;
import com.shenmintech.cbp.mapper.TKcGroupMapper;
import com.shenmintech.cbp.mapper.TKcStudentMapper;
import com.shenmintech.cbp.service.IGroupService;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.StringUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class GroupServiceImpl implements IGroupService {

  @Autowired
  TKcCourseMapper tKcCourseMapper;

  @Autowired
  TKcGroupMapper tKcGroupMapper;

  @Autowired
  TKcStudentMapper tKcStudentMapper;

  @Autowired
  TKcCourseTypeMapper tKcCourseTypeMapper;

  @Autowired
  TKcCourseTableMapper tKcCourseTableMapper;

  @Autowired
  IdWorkerTemplate idWorkerTemplate;

  @Autowired
  TKcCourseTableGroupRelationMapper tKcCourseTableGroupRelationMapper;

  @Override
  public void add(List<Req4PostGroupVo> list) {
    Iterator<Req4PostGroupVo> it = list.iterator();
    String courseId = null;
    int k = 1;
    while (it.hasNext()) {
      Req4PostGroupVo groupVo = it.next();
      TKcGroup group = new TKcGroup();
      String id = idWorkerTemplate.generateId();
      group.setId(id);
      String courseFid = groupVo.getCourseFid();

      // 添加课程操作流程控制编号，当前编号将置为2
      if (k == 1) {
        courseId = courseFid;
        k++;
      }

      TKcCourse course = tKcCourseMapper.selectByPrimaryKey(courseFid);
      Integer status = course.getStatus();
      if (-1 == status) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
          "添加小组失败:t_kc_course中id为" + courseFid + "的课程记录已经被删除，不能给其下挂小组", Constants.BLANKSTR);
      group.setCourseFid(courseFid);
      String groupName = groupVo.getGroupName();
      group.setGroupName(null == groupName ? Constants.BLANKSTR : groupName);
      group.setStatus(0);
      try {
        tKcGroupMapper.insertSelective(group);
      } catch (Exception e) {
        log.error("context", e);
        throw new ApplicationException(Constants.META_STATUS_CODE_D1, "添加小组失败", Constants.BLANKSTR);
      }
      TKcCourseTableExample example = new TKcCourseTableExample();
      example.or().andStatusNotEqualTo(-1).andCourseFidEqualTo(courseFid);
      List<TKcCourseTable> courseTables = tKcCourseTableMapper.selectByExample(example);
      if (null == courseTables || 0 == courseTables.size())
        throw new ApplicationException(Constants.META_STATUS_CODE_D1, "添加小组失败:必须先给课程设置上课模板",
            Constants.BLANKSTR);
      List<TKcCourseTableGroupRelation> courseTableGroupRelations = new ArrayList<>();
      String[] ids = idWorkerTemplate.generateIds(courseTables.size());
      Iterator<TKcCourseTable> ita = courseTables.iterator();
      int i = 0;
      while (ita.hasNext()) {
        TKcCourseTableGroupRelation courseTableGroupRelation = new TKcCourseTableGroupRelation();
        TKcCourseTable courseTable = ita.next();
        courseTableGroupRelation.setId(ids[i]);
        courseTableGroupRelation.setGroupFid(id);
        courseTableGroupRelation.setCourseTableFid(courseTable.getId());
        courseTableGroupRelation.setStatus(0);
        courseTableGroupRelations.add(courseTableGroupRelation);
        i++;
      }
      tKcCourseTableGroupRelationMapper.insertList(courseTableGroupRelations);
    }
    if (StringUtil.isNotBlank(courseId)) {
      TKcCourse course = new TKcCourse();
      course.setId(courseId);
      course.setStatus(2);
      tKcCourseMapper.updateByPrimaryKeySelective(course);
    }

  }

  @Override
  public void updateById(String groupId, String groupName) {
    TKcGroup group = new TKcGroup();
    group.setId(groupId);
    group.setGroupName(groupName);
    try {
      tKcGroupMapper.updateByPrimaryKeySelective(group);
    } catch (Exception e) {
      log.error("context", e);
      throw new ApplicationException(Constants.META_STATUS_CODE_D1, "更新小组名字失败", Constants.BLANKSTR);
    }
  }

  @Override
  public Res4GetGroupVo selectByIdPages(String courseId, int pageNo, int rowsPerPage) {
    Res4GetGroupVo res4GetGroupVo = new Res4GetGroupVo();

    TKcCourseTableExample tKcCourseTableExample = new TKcCourseTableExample();
    tKcCourseTableExample.or().andStatusNotEqualTo(-1).andCourseFidEqualTo(courseId);
    List<TKcCourseTable> tKcCourseTables =
        tKcCourseTableMapper.selectByExample(tKcCourseTableExample);
    List<String> courseTableIds =
        tKcCourseTables.stream().map(n -> n.getId()).collect(Collectors.toList());

    TKcGroupExample example = new TKcGroupExample();
    example.or().andStatusNotEqualTo(-1).andCourseFidEqualTo(courseId);
    int recordCount = tKcGroupMapper.countByExample(example);
    PagingExample pagingExample = new PagingExample(pageNo, rowsPerPage);
    example.setPagingExample(pagingExample);
    List<TKcGroup> groups = tKcGroupMapper.selectByExample(example);
    Iterator<TKcGroup> it = groups.iterator();
    List<Son4GetGroupVo> list = new ArrayList<>();
    while (it.hasNext()) {
      Son4GetGroupVo son4GetGroupVo = new Son4GetGroupVo();
      TKcGroup group = it.next();
      String groupName = group.getGroupName();
      son4GetGroupVo.setGroupName(null == groupName ? Constants.BLANKSTR : groupName);

      String groupId = group.getId();
      son4GetGroupVo.setGroupId(null == groupId ? Constants.BLANKSTR : groupId);

      Date date = group.getCreateTime();
      son4GetGroupVo.setCreateDate(date);

      Iterator<String> ita = courseTableIds.iterator();
      String status = "1";
      while (ita.hasNext()) {
        String courseTableId = ita.next();
        TKcCourseTableGroupRelationExample tKcCourseTableGroupRelationExample =
            new TKcCourseTableGroupRelationExample();
        tKcCourseTableGroupRelationExample.or().andStatusNotEqualTo(-1).andGroupFidEqualTo(groupId)
            .andCourseTableFidEqualTo(courseTableId);
        List<TKcCourseTableGroupRelation> tKcCourseTableGroupRelations =
            tKcCourseTableGroupRelationMapper.selectByExample(tKcCourseTableGroupRelationExample);
        if (null == tKcCourseTableGroupRelations || 1 != tKcCourseTableGroupRelations.size())
          throw new ApplicationException(Constants.META_STATUS_CODE_D1,
              "groupId=" + groupId + "在courseTableId=" + courseTableId + "下不存在或者不唯一",
              Constants.BLANKSTR);
        Date preStartTime = tKcCourseTableGroupRelations.get(0).getPreStartTime();
        if (null == preStartTime) {// 一旦当前小组中有一个课没有设置时间，则返回给外部接口0，标识当前小组的课程没有全部设置时间
          status = "0";
          break;
        }
      }
      son4GetGroupVo.setCourseGroupStatus(status);

      list.add(son4GetGroupVo);
    }
    res4GetGroupVo.setGroupVos(list);
    res4GetGroupVo.setRecordCount(recordCount);
    return res4GetGroupVo;
  }

  @Override
  public int countByGroupId(String groupId) {
    TKcStudentExample studentExample = new TKcStudentExample();
    studentExample.or().andStatusNotEqualTo(-1).andGroupFidEqualTo(groupId);
    return tKcStudentMapper.countByExample(studentExample);
  }

  @Override
  public int countByCourseId(String courseId) {
    TKcGroupExample example = new TKcGroupExample();
    example.or().andStatusNotEqualTo(-1).andCourseFidEqualTo(courseId);
    return tKcGroupMapper.countByExample(example);
  }

  @Override
  public List<String> getGroupIdsByCourseId(String courseId) {
    TKcGroupExample example = new TKcGroupExample();
    example.or().andStatusNotEqualTo(-1).andCourseFidEqualTo(courseId);
    List<TKcGroup> groups = tKcGroupMapper.selectByExample(example);
    List<String> groupIds = new ArrayList<>();
    if (groups.size() > 0)
      groupIds = groups.stream().map(n -> n.getId()).collect(Collectors.toList());
    return groupIds;
  }

  @Override
  public String selelctNameById(String id) {
    TKcGroup group = tKcGroupMapper.selectByPrimaryKey(id);
    if (null == group) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
        "t_kc_group中不存在id=" + id + "的小组", Constants.BLANKSTR);
    return group.getGroupName();
  }

}
