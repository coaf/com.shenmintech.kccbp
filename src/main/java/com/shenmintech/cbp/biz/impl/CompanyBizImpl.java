package com.shenmintech.cbp.biz.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shenmintech.base.template.IdWorkerTemplate;
import com.shenmintech.cbp.biz.ICompanyBiz;
import com.shenmintech.cbp.biz.vo.ques.Req4PostCompanyVo;
import com.shenmintech.cbp.biz.vo.ques.Req4PutComVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetComVo;
import com.shenmintech.cbp.biz.vo.res.Sons4GetComVo;
import com.shenmintech.cbp.config.HttpErrorMsg;
import com.shenmintech.cbp.controller.bean.req.Req4GetComBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetSingleComBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostCompanyBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutComBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetComBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetSingleComBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostCompanyBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutComBean;
import com.shenmintech.cbp.controller.bean.res.Sons4GetComBean;
import com.shenmintech.cbp.entity.TKcCompany;
import com.shenmintech.cbp.entity.TKcEmployeeExample;
import com.shenmintech.cbp.exception.ApplicationException;
import com.shenmintech.cbp.mapper.TKcCompanyMapper;
import com.shenmintech.cbp.mapper.TKcEmployeeMapper;
import com.shenmintech.cbp.service.ICompanyService;
import com.shenmintech.cbp.service.ICourseService;
import com.shenmintech.cbp.service.IEmpolyeeService;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.DateUtil;
import com.shenmintech.common.util.StringUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@SuppressWarnings("static-access")
public class CompanyBizImpl implements ICompanyBiz {

  @Autowired
  ICompanyService iCompanyService;

  @Autowired
  ICourseService iCourseService;

  @Autowired
  IdWorkerTemplate idWorkerTemplate;

  @Autowired
  IEmpolyeeService iEmpolyeeService;

  @Autowired
  TKcCompanyMapper tKcCompanyMapper;

  @Autowired
  TKcEmployeeMapper tKcEmployeeMapper;

  @Autowired
  HttpErrorMsg httpErrorMsg;

  @Override
  public Res4PostCompanyBean addCompany(Req4PostCompanyBean req4PostCompanyBean) {
    Res4PostCompanyBean resBean = new Res4PostCompanyBean();
    /* bean结构校验 */
    String companyName = req4PostCompanyBean.getCompanyName();
    String estimatedStudentsNum = req4PostCompanyBean.getEstimatedStudentsNum();
    if (StringUtil.checkBlank(companyName, estimatedStudentsNum)) {
      log.error("companyName,estimatedStudentsNum不能为空");
      resBean.setError(httpErrorMsg.getAddCompany().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getAddCompany().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    int estimatedStudentsNumber = 0;
    try {
      estimatedStudentsNumber = Integer.parseInt(estimatedStudentsNum);
    } catch (Exception e) {
      log.error("context", e);
      resBean.setError(httpErrorMsg.getAddCompany().variIllegal.getCodeFail());
      resBean.setMsg(httpErrorMsg.getAddCompany().variIllegal.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    String id = idWorkerTemplate.generateId();// 主键生成
    Req4PostCompanyVo companyVo = new Req4PostCompanyVo().builder().id(id).companyName(companyName)
        .estimatedStudentsNum(estimatedStudentsNumber).build();
    List<Req4PostCompanyVo> list = new ArrayList<>();
    list.add(companyVo);
    try {
      iCompanyService.add(list);
    } catch (ApplicationException e) {
      resBean.setError(httpErrorMsg.getAddCompany().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getAddCompany().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public Res4PutComBean updateCompany(Req4PutComBean req4PutComBean) {
    Res4PutComBean resBean = new Res4PutComBean();
    String companyId = req4PutComBean.getId();
    if (StringUtil.isBlank(companyId)) {
      log.error("companyId不能为空");
      resBean.setError(httpErrorMsg.getPutTKcCompany().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPutTKcCompany().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    String companyName = req4PutComBean.getCompanyName();
    String esStudentNum = req4PutComBean.getEstimatedStudentsNum();
    Integer esStudentNumber = null;
    if (null != esStudentNum) {
      try {
        esStudentNumber = Integer.parseInt(esStudentNum);
      } catch (Exception e) {
        log.error("context", e);
        resBean.setError(httpErrorMsg.getPutTKcCompany().variIllegal.getCodeFail());
        resBean.setMsg(httpErrorMsg.getPutTKcCompany().variIllegal.getMsgFail());
        resBean.setSuccess(false);
        return resBean;
      }
    }
    Req4PutComVo putComVo = new Req4PutComVo().builder().id(companyId).companyName(companyName)
        .estimatedStudentsNum(esStudentNumber).build();
    try {
      iCompanyService.update(putComVo);;
    } catch (ApplicationException e) {
      log.error("context", e);
      resBean.setError(httpErrorMsg.getPutTKcCompany().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPutTKcCompany().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public Res4GetComBean selectCompany(Req4GetComBean req4GetComBean) {
    Res4GetComBean resBean = new Res4GetComBean();
    int pageNo = -1 == req4GetComBean.getPageNo() ? 1 : req4GetComBean.getPageNo();
    int rowsPerPage = -1 == req4GetComBean.getPageNo() ? 99999 : req4GetComBean.getRowsPerPage();
    Res4GetComVo res4GetComVo = new Res4GetComVo();
    try {
      res4GetComVo = iCompanyService.select(pageNo, rowsPerPage);
    } catch (ApplicationException e) {
      log.error("context", e);
      resBean.setError(httpErrorMsg.getGetTKcCompany().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetTKcCompany().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }

    List<Sons4GetComVo> sons4GetComVos = res4GetComVo.getList();
    Iterator<Sons4GetComVo> it = sons4GetComVos.iterator();
    List<Sons4GetComBean> list = new ArrayList<>();
    while (it.hasNext()) {
      Sons4GetComBean sons4GetComBean = new Sons4GetComBean();
      Sons4GetComVo sons4GetComVo = it.next();
      String id = sons4GetComVo.getId();
      sons4GetComBean.setCompanyId(id);
      String companyName = sons4GetComVo.getCompanyName();
      sons4GetComBean.setCompanyName(companyName);
      Date createTime = sons4GetComVo.getCreateTime();
      String createTimeStr = DateUtil.format(createTime, DateUtil.DATETYPE_4);
      sons4GetComBean.setCreateTime(createTimeStr);
      int count = iCourseService.countByCompanyId(id);
      sons4GetComBean.setCourseNum(String.valueOf(count));
      int estimatedStudentsNum = sons4GetComVo.getEstimatedStudentsNum();
      sons4GetComBean.setEstimatedStudentsNum(String.valueOf(estimatedStudentsNum));
      int employeeNum = iEmpolyeeService.countByCompanyId(id);
      sons4GetComBean.setCurStudentsNum(String.valueOf(employeeNum));
      list.add(sons4GetComBean);
    }
    int recordCount = res4GetComVo.getRecordCount();
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    resBean.setPageNo(pageNo);
    resBean.setRecordCount(recordCount);
    resBean.setPageSumCount((recordCount + rowsPerPage - 1) / rowsPerPage);
    resBean.setList(list);
    return resBean;
  }

  @Override
  public Res4GetSingleComBean selectCompanyById(Req4GetSingleComBean Req4GetSingleComBean) {
    Res4GetSingleComBean resBean = new Res4GetSingleComBean();

    String companyId = Req4GetSingleComBean.getCompanyId();
    if (StringUtil.isBlank(companyId)) {
      log.error("companyId不能为空");
      resBean.setError(httpErrorMsg.getGetSingleCompany().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetSingleCompany().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }

    TKcCompany company = tKcCompanyMapper.selectByPrimaryKey(companyId);
    if (null == company) {
      resBean.setError(-1);
      resBean.setMsg("未查到ID为" + companyId);
      resBean.setSuccess(false);
      return resBean;
    }

    String userId = Req4GetSingleComBean.getOperatorUserId();
    TKcEmployeeExample employeeExample = new TKcEmployeeExample();
    employeeExample.or().andStatusNotEqualTo(-1).andCompanyFidEqualTo(companyId)
        .andUserIdEqualTo(userId);
    int i = tKcEmployeeMapper.countByExample(employeeExample);
    if (1 == i) {
      log.error("userId=" + userId + "的用戶已經加入了companyId=" + companyId + "公司");
      resBean.setError(httpErrorMsg.getGetSingleCompany().hasBeenAdded.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetSingleCompany().hasBeenAdded.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }

    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    resBean.setCompanyId(companyId);
    resBean.setCompanyName(company.getCompanyName());
    resBean.setComPicId(Constants.BLANKSTR);
    return resBean;
  }

}
