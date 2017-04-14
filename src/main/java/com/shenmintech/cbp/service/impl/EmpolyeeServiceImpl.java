package com.shenmintech.cbp.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shenmintech.base.template.HttpRestTemplate;
import com.shenmintech.base.template.IdWorkerTemplate;
import com.shenmintech.base.template.SpringRedisTemplate;
import com.shenmintech.cbp.biz.IRoomAndVideoBiz;
import com.shenmintech.cbp.biz.vo.res.NtesDataVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetEmployeeVo;
import com.shenmintech.cbp.biz.vo.res.Son4GetEmployeeVo;
import com.shenmintech.cbp.controller.bean.res.NetEasyUserResponse;
import com.shenmintech.cbp.entity.PagingExample;
import com.shenmintech.cbp.entity.TKcCompany;
import com.shenmintech.cbp.entity.TKcCourse;
import com.shenmintech.cbp.entity.TKcEmployee;
import com.shenmintech.cbp.entity.TKcEmployeeExample;
import com.shenmintech.cbp.entity.TKcStudent;
import com.shenmintech.cbp.entity.TKcStudentExample;
import com.shenmintech.cbp.entity.TKcTeacher;
import com.shenmintech.cbp.entity.TKcTeacherExample;
import com.shenmintech.cbp.exception.ApplicationException;
import com.shenmintech.cbp.mapper.TKcCompanyMapper;
import com.shenmintech.cbp.mapper.TKcCourseMapper;
import com.shenmintech.cbp.mapper.TKcEmployeeMapper;
import com.shenmintech.cbp.mapper.TKcGroupMapper;
import com.shenmintech.cbp.mapper.TKcStudentMapper;
import com.shenmintech.cbp.mapper.TKcTeacherMapper;
import com.shenmintech.cbp.service.IEmpolyeeService;
import com.shenmintech.cbp.service.IUserService;
import com.shenmintech.cbp.service.model.EmpAndNtesModel;
import com.shenmintech.cbp.service.model.TUser4List;
import com.shenmintech.cbp.service.model.UserListModel;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.GsonUtil;
import com.shenmintech.common.util.StringUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RefreshScope
@Transactional
public class EmpolyeeServiceImpl implements IEmpolyeeService {

  @Autowired
  TKcCompanyMapper tKcCompanyMapper;

  @Autowired
  TKcEmployeeMapper tKcEmployeeMapper;

  @Autowired
  TKcStudentMapper tKcStudentMapper;

  @Autowired
  TKcGroupMapper tKcGroupMapper;

  @Autowired
  TKcCourseMapper tKcCourseMapper;

  @Autowired
  IdWorkerTemplate idWorkerTemplate;

  @Autowired
  IRoomAndVideoBiz iRoomAndVideoBiz;

  @Autowired
  IUserService iUserService;

  @Autowired
  SpringRedisTemplate springRedisTemplate;

  @Autowired
  HttpRestTemplate httpRestTemplate;

  @Autowired
  TKcTeacherMapper tKcTeacherMapper;

  // 查询用户列表
  @Value("${shenmin-authority.authority.queryUsers}")
  private String queryUsersURL;

  /*
   * 供内调用，添加公司的员工，并到网易申请第三方身份
   * 
   */
  @Override
  public EmpAndNtesModel addEmpolyee(String userId, String companyId, String realName,
      String employeeNo) {
    TKcCompany company = tKcCompanyMapper.selectByPrimaryKey(companyId);
    if (null == company) {
      throw new ApplicationException(Constants.META_STATUS_CODE_D1,
          "t_kc_company中未查到id为" + companyId + "的记录", Constants.BLANKSTR);
    } else {
      log.info("t_kc_company中id为" + companyId + "的公司记录存在，已验证");
    }
    TKcEmployeeExample employeeExample = new TKcEmployeeExample();
    employeeExample.or().andStatusNotEqualTo(-1).andUserIdEqualTo(userId);
    List<TKcEmployee> employeee = tKcEmployeeMapper.selectByExample(employeeExample);
    if (null != employeee && employeee.size() > 0) {
      log.error("t_kc_empolyee中已经存在userId为" + userId + "的员工记录,直接返回");
      TKcEmployee tKcEmployee = employeee.get(0);
      EmpAndNtesModel model = new EmpAndNtesModel();
      model.setEmployeeId(tKcEmployee.getId());
      model.setNtesAccId(tKcEmployee.getNtesAccId());
      model.setNtesToken(tKcEmployee.getNtesToken());
      return model;
    }
    TKcEmployee employee = new TKcEmployee();
    String id = idWorkerTemplate.generateId();
    employee.setId(id);
    employee.setUserId(userId);
    employee.setCompanyFid(companyId);
    employee.setStatus(0);
    employee.setRealName(realName);
    employee.setEmployeeNo(employeeNo);
    try {
      tKcEmployeeMapper.insertSelective(employee);
    } catch (Exception e) {
      log.error("context", e);
      throw new ApplicationException(Constants.META_STATUS_CODE_D1, "添加员工失败", Constants.BLANKSTR);
    }
    // 申请用户在网易的第三方ID，用来进入房间看直播视频
    NetEasyUserResponse res = new NetEasyUserResponse();
    try {
      res = iRoomAndVideoBiz.createAccoutAndAccid(userId, realName);
    } catch (Exception e) {
      throw new ApplicationException(Constants.META_STATUS_CODE_D2, "生成用户在网易的第三方用户ID接口报错",
          Constants.BLANKSTR);
    }
    log.info("初始化学员的时候到网易申请第三方用户返回==============" + GsonUtil.gson.toJson(res));
    String accId = Constants.BLANKSTR;
    String token = Constants.BLANKSTR;
    String beforeStr = "ntes_app1_";// redis-key-前缀
    if (200 != res.getCode()) {
      if (414 == res.getCode() && "already register".equals(res.getDesc())) {
        accId = userId;
        token = springRedisTemplate.get(beforeStr + userId);
        if (StringUtil.checkBlank(token)) {
          log.info("查看当前用户有没有成为过老师：");
          TKcTeacherExample tKcTeacherExample = new TKcTeacherExample();
          tKcTeacherExample.or().andUserIdEqualTo(userId);
          List<TKcTeacher> teachers = tKcTeacherMapper.selectByExample(tKcTeacherExample);
          if (null != teachers && 1 <= teachers.size()) {
            log.error("该用户ID:" + userId + "已经注册为老师，在网易已经通过userId生成过身份了");
            throw new ApplicationException(Constants.META_STATUS_CODE_D3,
                "该用户ID已经注册为老师，在网易已经通过userId生成过身份了", Constants.BLANKSTR);
          }
          log.error("生成用户在网易的第三方用户ID重复，并且redis中未保存");
          throw new ApplicationException(Constants.META_STATUS_CODE_D2,
              "生成用户在网易的第三方用户ID重复，并且redis中未保存", Constants.BLANKSTR);
        }
      } else {
        log.info("生成用户在网易的第三方用户ID接口失败");
        throw new ApplicationException(Constants.META_STATUS_CODE_D2, "生成用户在网易的第三方用户ID接口失败",
            Constants.BLANKSTR);
      }
    } else {
      accId = res.getInfo().getAccid();
      token = res.getInfo().getToken();
      springRedisTemplate.save(beforeStr + accId, token);
    }
    TKcEmployee curEmp = new TKcEmployee();
    curEmp.setId(id);
    curEmp.setNtesAccId(accId);
    curEmp.setNtesToken(token);
    try {
      tKcEmployeeMapper.updateByPrimaryKeySelective(curEmp);
    } catch (Exception e) {
      log.error("context", e);
      throw new ApplicationException(Constants.META_STATUS_CODE_D1, "更新网易用户第三方信息至员工表失败",
          Constants.BLANKSTR);
    }
    EmpAndNtesModel model = new EmpAndNtesModel();
    BeanUtils.copyProperties(curEmp, model);
    model.setEmployeeId(id);
    return model;
  }

  @Override
  public Res4GetEmployeeVo selectByCompanyId(int pageNo, int rowsPerPage, String courseId,
      String keywords, String groupId) {
    Res4GetEmployeeVo res4GetEmployeeVo = new Res4GetEmployeeVo();

    TKcCourse course = tKcCourseMapper.selectByPrimaryKey(courseId);
    if (null == course) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
        "t_kc_course表中不存在id为" + courseId + "的记录", Constants.BLANKSTR);
    String companyId = course.getCompanyFid();
    TKcEmployeeExample employeeExample = new TKcEmployeeExample();

    TKcEmployeeExample.Criteria criteria1 = employeeExample.createCriteria();
    TKcEmployeeExample.Criteria criteria2 = employeeExample.createCriteria();
    criteria1.andStatusNotEqualTo(-1).andCompanyFidEqualTo(companyId);
    criteria2.andStatusNotEqualTo(-1).andCompanyFidEqualTo(companyId);
    if (StringUtil.isNotBlank(keywords)) {// 手机号或者用户名关键字
      Map<String, String> map = new HashMap<>();
      map.put("mobile", keywords);
      String reqStr = GsonUtil.gson.toJson(map);
      String resStr = httpRestTemplate.postForObject(queryUsersURL, reqStr);
      UserListModel model = GsonUtil.gson.fromJson(resStr, UserListModel.class);
      List<TUser4List> list = model.getUsers();
      if (null != list && 0 < list.size()) {
        List<String> userIdList = list.stream().map(n -> n.getId()).collect(Collectors.toList());
        criteria1.andUserIdIn(userIdList);
      } else {
        criteria1.andIdIsNull();
      }
      criteria2.andRealNameLike("%" + keywords + "%");
    }

    if (StringUtil.isNotBlank(groupId)) {
      TKcStudentExample kcStudentExample = new TKcStudentExample();
      kcStudentExample.or().andStatusNotEqualTo(-1).andGroupFidEqualTo(groupId);
      List<TKcStudent> tkcStudents = tKcStudentMapper.selectByExample(kcStudentExample);
      List<String> employeeIds =
          tkcStudents.stream().map(n -> n.getEmployeeFid()).collect(Collectors.toList());
      if (null != employeeIds && 0 < employeeIds.size()) {
        criteria1.andIdIn(employeeIds);
        criteria2.andIdIn(employeeIds);
      } else {
        criteria1.andIdIsNull();
        criteria2.andIdIsNull();
      }

    }
    employeeExample.or(criteria2);
    int recordCount = tKcEmployeeMapper.countByExample(employeeExample);
    PagingExample pagingExample = new PagingExample(pageNo, rowsPerPage);
    employeeExample.setOrderByClause("create_time desc");
    employeeExample.setPagingExample(pagingExample);
    List<TKcEmployee> employeee = tKcEmployeeMapper.selectByExample(employeeExample);

    Iterator<TKcEmployee> it = employeee.iterator();
    List<Son4GetEmployeeVo> list = new ArrayList<>();
    while (it.hasNext()) {
      Son4GetEmployeeVo son4GetEmployeeVo = new Son4GetEmployeeVo();
      TKcEmployee employee = it.next();
      String employeeId = employee.getId();
      son4GetEmployeeVo.setEmployeeId(null == employeeId ? Constants.BLANKSTR : employeeId);
      String userId = employee.getUserId();
      son4GetEmployeeVo.setUserId(null == userId ? Constants.BLANKSTR : userId);
      String realName = employee.getRealName();
      son4GetEmployeeVo.setRealName(realName);
      list.add(son4GetEmployeeVo);
    }
    res4GetEmployeeVo.setRecordCount(recordCount);
    res4GetEmployeeVo.setList(list);
    return res4GetEmployeeVo;
  }

  @Override
  public String selectByUserId(String userId) {
    TKcEmployeeExample example = new TKcEmployeeExample();
    example.or().andStatusNotEqualTo(-1).andUserIdEqualTo(userId);
    List<TKcEmployee> employees = tKcEmployeeMapper.selectByExample(example);
    if (1 < employees.size()) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
        "userId=" + userId + "在表t_kc_employee中找到两条数据，一个用户之内能入职一家公司，故为脏数据", Constants.BLANKSTR);
    if (0 == employees.size()) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
        "userId=" + userId + "在表t_kc_employee中未找到该用户的雇员信息，请先扫码加入公司", Constants.BLANKSTR);
    return employees.get(0).getId();
  }

  @Override
  public int countByCompanyId(String companyId) {
    TKcEmployeeExample example = new TKcEmployeeExample();
    example.or().andStatusNotEqualTo(-1).andCompanyFidEqualTo(companyId);
    return tKcEmployeeMapper.countByExample(example);
  }

  @Override
  public NtesDataVo selectNtesdataByUserId(String userId) {
    NtesDataVo vo = new NtesDataVo();
    TKcEmployeeExample example = new TKcEmployeeExample();
    example.or().andStatusNotEqualTo(-1).andUserIdEqualTo(userId);
    List<TKcEmployee> employees = tKcEmployeeMapper.selectByExample(example);
    if (1 < employees.size()) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
        "userId=" + userId + "在表t_kc_employee中找到两条数据，一个用户之内能入职一家公司，故为脏数据", Constants.BLANKSTR);
    if (0 == employees.size()) {
      vo.setNtesAccId(Constants.BLANKSTR);
      vo.setNtesToken(Constants.BLANKSTR);
      return vo;
    }
    vo.setNtesAccId(employees.get(0).getNtesAccId());
    vo.setNtesToken(employees.get(0).getNtesToken());
    return vo;
  }
}
