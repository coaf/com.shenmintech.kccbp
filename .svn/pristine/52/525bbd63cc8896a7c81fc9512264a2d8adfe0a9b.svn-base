package com.shenmintech.cbp.biz.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shenmintech.cbp.biz.IEmployeeBiz;
import com.shenmintech.cbp.biz.vo.res.CompanyVo;
import com.shenmintech.cbp.biz.vo.res.NtesDataVo;
import com.shenmintech.cbp.biz.vo.res.Res4AddUserVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetEmployeeVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetGroupVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetUserVo;
import com.shenmintech.cbp.biz.vo.res.Son4GetEmployeeVo;
import com.shenmintech.cbp.biz.vo.res.Son4GetGroupVo;
import com.shenmintech.cbp.biz.vo.res.StudentVo;
import com.shenmintech.cbp.config.HttpErrorMsg;
import com.shenmintech.cbp.controller.bean.req.Req4GetEmployeeBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetUserNtesBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostEmployeeBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostUEStudentBean;
import com.shenmintech.cbp.controller.bean.res.Reas4PostUEStudentBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetEmployeeBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetUserNtesBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostEmployeeBean;
import com.shenmintech.cbp.controller.bean.res.Son4GetEmployeeBean;
import com.shenmintech.cbp.controller.bean.res.Son4GetGroup1Bean;
import com.shenmintech.cbp.exception.ApplicationException;
import com.shenmintech.cbp.service.ICourseService;
import com.shenmintech.cbp.service.IEmpolyeeService;
import com.shenmintech.cbp.service.IGroupService;
import com.shenmintech.cbp.service.IStudentService;
import com.shenmintech.cbp.service.IUserService;
import com.shenmintech.cbp.service.model.EmpAndNtesModel;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.DateUtil;
import com.shenmintech.common.util.StringUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EmployeeBizImpl implements IEmployeeBiz {

  @Autowired
  IEmpolyeeService iEmpolyeeService;

  @Autowired
  IGroupService iGroupService;

  @Autowired
  IStudentService iStudentService;

  @Autowired
  IUserService iUserService;

  @Autowired
  ICourseService iCourseService;

  @Autowired
  HttpErrorMsg httpErrorMsg;

  @Override
  public Res4GetEmployeeBean getByComIdAndCouIdPages(Req4GetEmployeeBean req4GetEmployeeBean) {
    Res4GetEmployeeBean resBean = new Res4GetEmployeeBean();

    String courseId = req4GetEmployeeBean.getCourseId();
    if (StringUtil.checkBlank(courseId)) {
      log.error("courseId不能为空");
      resBean.setError(httpErrorMsg.getGetTKcEmployee().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetTKcEmployee().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    int pageNo = -1 == req4GetEmployeeBean.getPageNo() ? 1 : req4GetEmployeeBean.getPageNo();
    int rowsPerPage =
        -1 == req4GetEmployeeBean.getPageNo() ? 99999 : req4GetEmployeeBean.getRowsPerPage();
    String keywords = req4GetEmployeeBean.getKeywords();// 关键字
    String groupId = req4GetEmployeeBean.getGroupId();// 小组Id
    // String weightRelated = req4GetEmployeeBean.getWeightRelated();//重量相关
    // String muscleRelated = req4GetEmployeeBean.getMuscleRelated();//肌肉相关
    // String waterRelated = req4GetEmployeeBean.getWaterRelated();//水分相关

    Res4GetGroupVo res4GetGroupVo = new Res4GetGroupVo();// 获取当前课程的所有小组
    try {
      res4GetGroupVo = iGroupService.selectByIdPages(courseId, 1, 99999);
    } catch (ApplicationException e) {
      log.error("context", e);
      resBean.setError(httpErrorMsg.getGetTKcEmployee().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetTKcEmployee().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    List<Son4GetGroupVo> son4GetGroupVos = res4GetGroupVo.getGroupVos();
    List<Son4GetGroup1Bean> son4GetGroup1Beans = new ArrayList<>();
    Iterator<Son4GetGroupVo> it = son4GetGroupVos.iterator();
    while (it.hasNext()) {
      Son4GetGroup1Bean son4GetGroup1Bean = new Son4GetGroup1Bean();
      Son4GetGroupVo son4GetGroupVo = it.next();
      BeanUtils.copyProperties(son4GetGroupVo, son4GetGroup1Bean);
      son4GetGroup1Beans.add(son4GetGroup1Bean);
    }

    List<String> groupIds = iGroupService.getGroupIdsByCourseId(courseId);
    if (null == groupIds || 0 == groupIds.size()) {
      log.error("请先添加该课程的小组归类，再进入员工列表进行划分小组");
      resBean.setError(httpErrorMsg.getGetTKcEmployee().processExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetTKcEmployee().processExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }

    Res4GetEmployeeVo res4GetEmployeeVo = new Res4GetEmployeeVo();// 获取当前课程对应公司的所有雇员
    try {
      res4GetEmployeeVo =
          iEmpolyeeService.selectByCompanyId(pageNo, rowsPerPage, courseId, keywords, groupId);
    } catch (ApplicationException e) {
      log.error("context", e);
      resBean.setError(httpErrorMsg.getGetTKcEmployee().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetTKcEmployee().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    int recordCount = res4GetEmployeeVo.getRecordCount();
    List<Son4GetEmployeeVo> son4GetEmployeeVos = res4GetEmployeeVo.getList();
    Iterator<Son4GetEmployeeVo> iterator = son4GetEmployeeVos.iterator();
    List<Son4GetEmployeeBean> employeeList = new ArrayList<>();// 组织雇员列表
    while (iterator.hasNext()) {
      Son4GetEmployeeBean son4GetEmployeeBean = new Son4GetEmployeeBean();
      Son4GetEmployeeVo son4GetEmployeeVo = iterator.next();
      String employeeId = son4GetEmployeeVo.getEmployeeId();
      son4GetEmployeeBean.setEmployeeId(employeeId);
      StudentVo studentVo = new StudentVo();
      try {
        studentVo = iStudentService.searchByEmployeeIdAndGroupIds(employeeId, groupIds);
      } catch (ApplicationException e) {
        log.error("context", e);
        resBean.setError(httpErrorMsg.getGetTKcEmployee().sysInnerExc.getCodeFail());
        resBean.setMsg(httpErrorMsg.getGetTKcEmployee().sysInnerExc.getMsgFail());
        resBean.setSuccess(false);
        return resBean;
      }
      son4GetEmployeeBean.setStudentId(studentVo.getStudentId());
      son4GetEmployeeBean.setGroupId(studentVo.getGroupId());
      son4GetEmployeeBean.setWeightLossTotal(Constants.BLANKSTR);
      son4GetEmployeeBean.setDietaryRecord(Constants.BLANKSTR);
      son4GetEmployeeBean.setDailyBudget(Constants.BLANKSTR);
      son4GetEmployeeBean.setWeightLossPercentage(Constants.BLANKSTR);
      son4GetEmployeeBean.setWeightLossWeek(Constants.BLANKSTR);
      son4GetEmployeeBean.setBMI(Constants.BLANKSTR);
      son4GetEmployeeBean.setFollowRecord(Constants.BLANKSTR);
      String userId = son4GetEmployeeVo.getUserId();
      Res4GetUserVo res4GetUserVo = new Res4GetUserVo();
      try {
        res4GetUserVo = iUserService.selectByUserId(userId);
      } catch (ApplicationException e) {
        log.error(e.msg);
        resBean.setError(httpErrorMsg.getGetTKcEmployee().moduleTransExc.getCodeFail());
        resBean.setMsg(httpErrorMsg.getGetTKcEmployee().moduleTransExc.getMsgFail());
        resBean.setSuccess(false);
        return resBean;
      }
      son4GetEmployeeBean.setUserId(userId);

      String realName = son4GetEmployeeVo.getRealName();
      son4GetEmployeeBean.setUserName(null == realName ? Constants.BLANKSTR : realName);

      String mobile = res4GetUserVo.getUserMobile();
      son4GetEmployeeBean.setMobile(null == mobile ? Constants.BLANKSTR : mobile);

      Date registerDate = res4GetUserVo.getRegisterDate();
      String registerDateStr = Constants.BLANKSTR;
      if (null != registerDate) {
        registerDateStr = DateUtil.format(registerDate, DateUtil.DATETYPE_4);
      } else {
        registerDateStr = "--";
      }
      son4GetEmployeeBean.setRegisterDate(registerDateStr);

      employeeList.add(son4GetEmployeeBean);
    }
    resBean.setEmployeeList(employeeList);
    resBean.setGroupList(son4GetGroup1Beans);
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    resBean.setPageNo(pageNo);
    resBean.setRecordCount(recordCount);
    resBean.setPageSumCount((recordCount + rowsPerPage - 1) / rowsPerPage);
    return resBean;
  }

  @Override
  public Res4PostEmployeeBean addEmployee(Req4PostEmployeeBean req4PostEmployeeBean) {// 用户扫描二维码，并将自己的真实姓名和员工号录入至员工表中
    Res4PostEmployeeBean resBean = new Res4PostEmployeeBean();

    String userId = req4PostEmployeeBean.getUserId();
    String companyId = req4PostEmployeeBean.getCompanyId();
    String realName = req4PostEmployeeBean.getRealName();
    String employeeNo = req4PostEmployeeBean.getEmployeeNo();
    if (StringUtil.checkBlank(userId, companyId)) {
      log.error("userId,companyId不能为空");
      resBean.setError(httpErrorMsg.getPostTKcEmployee().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostTKcEmployee().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    EmpAndNtesModel model = new EmpAndNtesModel();
    try {
      model = iEmpolyeeService.addEmpolyee(userId, companyId, realName, employeeNo);
    } catch (ApplicationException e) {
      log.error("context", e);
      if (Constants.META_STATUS_CODE_D2.equals(e.code)) {
        resBean.setError(httpErrorMsg.getPostTKcEmployee().thirdApiExc.getCodeFail());
        resBean.setMsg(httpErrorMsg.getPostTKcEmployee().thirdApiExc.getMsgFail());
        resBean.setSuccess(false);
        return resBean;
      }else if(Constants.META_STATUS_CODE_D3.equals(e.code)){
        resBean.setError(httpErrorMsg.getPostTKcEmployee().alreadyExists.getCodeFail());
        resBean.setMsg(httpErrorMsg.getPostTKcEmployee().alreadyExists.getMsgFail());
        resBean.setSuccess(false);
        return resBean;
      }
      resBean.setError(httpErrorMsg.getPostTKcEmployee().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostTKcEmployee().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    resBean.setEmployeeId(model.getEmployeeId());
    resBean.setNtesAccId(model.getNtesAccId());
    resBean.setNtesToken(model.getNtesToken());
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public Reas4PostUEStudentBean addUserEmployeeStudent(
      Req4PostUEStudentBean req4PostUEStudentBean) {// 教师直接添加一个吃不胖用户，并且将这个用户拉倒自己的一个小组之中
    Reas4PostUEStudentBean resBean = new Reas4PostUEStudentBean();
    String userName = req4PostUEStudentBean.getUserName();
    String mobile = req4PostUEStudentBean.getMobile();
    String sex = req4PostUEStudentBean.getSex();
    String weight = req4PostUEStudentBean.getWeight();
    String height = req4PostUEStudentBean.getHeight();
    String birthday = req4PostUEStudentBean.getBirthday();
    String courseId = req4PostUEStudentBean.getCourseId();
    String groupId = req4PostUEStudentBean.getGroupId();
    String calUnit = req4PostUEStudentBean.getCalUnit();
    String email = req4PostUEStudentBean.getEmail();
    String employeeNo = req4PostUEStudentBean.getEmployeeNo();
    if (StringUtil.checkBlank(userName, mobile, sex, weight, height, birthday, courseId, groupId,
        calUnit)) {
      log.error("userName,mobile,sex,weight,height,birthday,courseId,groupId,calUnit不能为空");
      resBean.setError(httpErrorMsg.getPostUserEmployeeStudent().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostUserEmployeeStudent().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    if ((!StringUtil.isMobile(mobile)) || (!"0".equals(sex) && !"1".equals(sex))
        || (!"0".equals(calUnit) && !"1".equals(calUnit))
        || (StringUtil.isNotBlank(email) && !StringUtil.isEmail(email))) {
      log.error("mobile必须为手机号：" + mobile + "sex必须为0女/1男：" + sex + "calUnit必须为0轻币/1大卡：" + calUnit
          + "email格式必须合法：" + email);
      resBean.setError(httpErrorMsg.getPostUserEmployeeStudent().variIllegal.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostUserEmployeeStudent().variIllegal.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }

    Res4AddUserVo vo = iUserService.addUser(birthday, // 生日
        email, // 邮箱
        calUnit, // 热量单位
        Integer.parseInt(height), // 身高
        "0", // 是否辅食1是 2否
        "0", // 是否哺乳1是 2否
        mobile, // 手机号
        userName, // 昵称（暂时用真是姓名当做昵称）
        Integer.parseInt(sex), // 性别1男 2女
        Double.parseDouble(weight)// 体重
    );
    if ("-1".equals(vo.getFlag())) {
      log.error("添加用户失败（调用用户模块）");
      resBean.setError(httpErrorMsg.getPostUserEmployeeStudent().moduleTransExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostUserEmployeeStudent().moduleTransExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }

    String userId = vo.getUserId();
    CompanyVo companyVo = iCourseService.selectCompanyBelongByCourseId(courseId);
    String companyId = companyVo.getCompanyId();
    try {
      iStudentService.addEmployeeAndStudent(userId, companyId, groupId, userName, employeeNo);
    } catch (ApplicationException e) {
      log.info("本地员工表/学生表添加员工数据/学生数据失败，但是调用用户模块添加用户已经成功，请用户使用扫码方式进行添加员工，并让导师进行分组");
      if (Constants.META_STATUS_CODE_D1.equals(e.code)) {
        resBean.setError(httpErrorMsg.getPostUserEmployeeStudent().sysInnerExc.getCodeFail());
        resBean.setMsg(httpErrorMsg.getPostUserEmployeeStudent().sysInnerExc.getMsgFail());
        resBean.setSuccess(false);
      } else if(Constants.META_STATUS_CODE_D3.equals(e.code)){
        resBean.setError(httpErrorMsg.getPostUserEmployeeStudent().alreadyExists.getCodeFail());
        resBean.setMsg(httpErrorMsg.getPostUserEmployeeStudent().alreadyExists.getMsgFail());
        resBean.setSuccess(false);
      }else {
        resBean.setError(httpErrorMsg.getPostUserEmployeeStudent().thirdApiExc.getCodeFail());
        resBean.setMsg(httpErrorMsg.getPostUserEmployeeStudent().thirdApiExc.getMsgFail());
        resBean.setSuccess(false);
      }
      return resBean;
    }

    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public Res4GetUserNtesBean getNtesDataByUserId(Req4GetUserNtesBean req4GetUserNtesBean) {
    Res4GetUserNtesBean resBean = new Res4GetUserNtesBean();
    String userId = req4GetUserNtesBean.getUserId();
    if (StringUtil.checkBlank(userId)) {
      log.error("userId不能为空");
      resBean.setError(httpErrorMsg.getGetUserNtesData().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetUserNtesData().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    NtesDataVo vo = new NtesDataVo();
    try {
      vo = iEmpolyeeService.selectNtesdataByUserId(userId);
    } catch (ApplicationException e) {
      log.error(e.msg);
      resBean.setError(httpErrorMsg.getGetUserNtesData().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetUserNtesData().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    } catch (Exception e) {
      log.error(e.getMessage());
      resBean.setError(httpErrorMsg.getGetUserNtesData().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetUserNtesData().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    resBean.setNtesAccId(vo.getNtesAccId());
    resBean.setNtesToken(vo.getNtesToken());
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

}
