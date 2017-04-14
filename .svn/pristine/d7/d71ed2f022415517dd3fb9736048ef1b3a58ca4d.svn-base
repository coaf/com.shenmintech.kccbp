package com.shenmintech.cbp.biz.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shenmintech.cbp.biz.IHomeworkBiz;
import com.shenmintech.cbp.biz.vo.res.HomeWorkTypesVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetHomeworkTypeVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetHomeworkVo;
import com.shenmintech.cbp.biz.vo.res.Son4GetHomeworkTypeVo;
import com.shenmintech.cbp.biz.vo.res.Son4GetHomeworkVo;
import com.shenmintech.cbp.config.HttpErrorMsg;
import com.shenmintech.cbp.controller.bean.req.Req4DelHomeworkBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetHomeworkBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostHomeworkBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4DelHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetHomeworkTypeBean;
import com.shenmintech.cbp.controller.bean.res.Res4HomeWorkTypeBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Son4GetHomeworkBean;
import com.shenmintech.cbp.exception.ApplicationException;
import com.shenmintech.cbp.service.IHomeWorkService;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.DateUtil;
import com.shenmintech.common.util.StringUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class HomeworkBizImpl implements IHomeworkBiz {

  @Autowired
  IHomeWorkService iHomeWorkService;

  @Autowired
  HttpErrorMsg httpErrorMsg;

  @Override
  public Res4GetHomeworkTypeBean selectTKcHomeworkType() {
    Res4GetHomeworkTypeBean resBean = new Res4GetHomeworkTypeBean();
    Res4GetHomeworkTypeVo res4GetHomeworkTypeVo = iHomeWorkService.selectHomeworkType();
    Iterator<Son4GetHomeworkTypeVo> it = res4GetHomeworkTypeVo.getHomeworkTypeVos().iterator();
    List<Res4HomeWorkTypeBean> homeworkTypeList = new ArrayList<>();
    while (it.hasNext()) {
      Res4HomeWorkTypeBean res4HomeWorkTypeBean = new Res4HomeWorkTypeBean();
      Son4GetHomeworkTypeVo son4GetHomeworkTypeVo = it.next();
      res4HomeWorkTypeBean.setHomeworkTypeId(son4GetHomeworkTypeVo.getHomeWorkTypeId());
      res4HomeWorkTypeBean.setHomeworkTypeName(son4GetHomeworkTypeVo.getTypeName());
      homeworkTypeList.add(res4HomeWorkTypeBean);
    }
    resBean.setHomeworkTypeList(homeworkTypeList);
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public Res4PostHomeworkBean addTKcHomework(Req4PostHomeworkBean req4PostHomeworkBean) {
    Res4PostHomeworkBean resBean = new Res4PostHomeworkBean();

    String teacherId = req4PostHomeworkBean.getTeacherId();
    String workName = req4PostHomeworkBean.getWorkName();
    String typeId = req4PostHomeworkBean.getTypeId();
    String describe = req4PostHomeworkBean.getRemark();
    if (StringUtil.checkBlank(teacherId, workName, typeId, describe)) {
      log.error("teacherId,workName,typeId,remark不能为空");
      resBean.setError(httpErrorMsg.getPostTKcHomework().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostTKcHomework().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    try {
      iHomeWorkService.add(teacherId, workName, typeId, describe);
    } catch (ApplicationException e) {
      log.error("context", e);
      resBean.setError(httpErrorMsg.getPostTKcHomework().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostTKcHomework().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public Res4GetHomeworkBean selectTKcHomeworkByTeacherId(Req4GetHomeworkBean req4GetHomeworkBean) {
    Res4GetHomeworkBean resBean = new Res4GetHomeworkBean();

    String teacherId = req4GetHomeworkBean.getTeacherId();
    if (StringUtil.isBlank(teacherId)) {
      log.error("teacherId不能为空");
      resBean.setError(httpErrorMsg.getGetTKcHomework().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetTKcHomework().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    int ipageNo = 1;
    int pageNo = -1 == req4GetHomeworkBean.getPageNo() ? 1 : req4GetHomeworkBean.getPageNo();
    int rowsPerPage =
        -1 == req4GetHomeworkBean.getPageNo() ? 99999 : req4GetHomeworkBean.getRowsPerPage();
    Res4GetHomeworkVo res4GetHomeworkVo =
        iHomeWorkService.selectByTeacherIdPages(teacherId, ipageNo, rowsPerPage);
    int recordCount = res4GetHomeworkVo.getRecordCount();
    List<Son4GetHomeworkVo> son4GetHomeworkVos = res4GetHomeworkVo.getHomeworkTypeVos();
    if (null == son4GetHomeworkVos || 0 == son4GetHomeworkVos.size()) {
      log.error("该老师未创建课后任务，请先创建");
      resBean.setError(httpErrorMsg.getGetTKcHomework().processExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetTKcHomework().processExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    List<String> typeIdList =
        son4GetHomeworkVos.stream().map(n -> n.getHomeworkTypeId()).collect(Collectors.toList());
    List<HomeWorkTypesVo> workTypesVos = iHomeWorkService.getHomeWorkTypesByIds(typeIdList);
    Iterator<Son4GetHomeworkVo> it = son4GetHomeworkVos.iterator();
    List<Son4GetHomeworkBean> son4GetHomeworkBeans = new ArrayList<>();
    while (it.hasNext()) {
      Son4GetHomeworkVo son4GetHomeworkVo = it.next();
      String homeworkId = son4GetHomeworkVo.getHomeworkId();
      String homeworkName = son4GetHomeworkVo.getHomeworkName();
      String describe = son4GetHomeworkVo.getDescribe();
      Date createDate = son4GetHomeworkVo.getCreateTime();
      String createDateStr = DateUtil.format(createDate, DateUtil.DATETYPE_4);
      String homeworkTypeId = son4GetHomeworkVo.getHomeworkTypeId();
      Integer status = son4GetHomeworkVo.getStatus();
      String homeworkTypeName = Constants.BLANKSTR;
      for (HomeWorkTypesVo vo : workTypesVos)
        if (vo.getId().equals(homeworkTypeId)) homeworkTypeName = vo.getTypeName();
      Son4GetHomeworkBean son4GetHomeworkBean = new Son4GetHomeworkBean();
      son4GetHomeworkBean.setHomeworkId(homeworkId);
      son4GetHomeworkBean.setHomeworkName(homeworkName);
      son4GetHomeworkBean.setDescribe(describe);
      son4GetHomeworkBean.setCreateTime(createDateStr);
      son4GetHomeworkBean.setHomeworkTypeId(homeworkTypeId);
      son4GetHomeworkBean.setHomeworkType(homeworkTypeName);
      son4GetHomeworkBean
          .setHomeworkStatus(null == status ? Constants.BLANKSTR : String.valueOf(status));
      son4GetHomeworkBeans.add(son4GetHomeworkBean);
    }
    resBean.setList(son4GetHomeworkBeans);
    resBean.setPageNo(pageNo);
    resBean.setRecordCount(recordCount);
    resBean.setPageSumCount((recordCount + rowsPerPage - 1) / rowsPerPage);
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public Res4DelHomeworkBean delTKcHomework(Req4DelHomeworkBean req4DelHomeworkBean) {
    Res4DelHomeworkBean resBean = new Res4DelHomeworkBean();
    String workId = req4DelHomeworkBean.getWorkId();
    if (StringUtil.isBlank(workId)) {
      log.error("workId不能为空");
      resBean.setError(httpErrorMsg.getDeleteTKcHomework().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getDeleteTKcHomework().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    try {
      iHomeWorkService.deleteById(workId);
    } catch (ApplicationException e) {
      log.error("context", e);
      resBean.setError(httpErrorMsg.getDeleteTKcHomework().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getDeleteTKcHomework().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public Res4PutHomeworkBean updateTKcHomework(Req4PutHomeworkBean req4PutHomeworkBean) {
    Res4PutHomeworkBean resBean = new Res4PutHomeworkBean();
    String workId = req4PutHomeworkBean.getWorkId();
    String workName = req4PutHomeworkBean.getWorkName();
    String typeId = req4PutHomeworkBean.getTypeId();
    String describe = req4PutHomeworkBean.getHomeDescribe();
    if (StringUtil.checkBlank(workId, workName, typeId, describe)) {
      log.error("workId,workName,typeId,describe不能为空");
      resBean.setError(httpErrorMsg.getPutTKcHomework().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPutTKcHomework().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    try {
      iHomeWorkService.updateById(workId, workName, typeId, describe);
    } catch (ApplicationException e) {
      log.error("context", e);
      resBean.setError(httpErrorMsg.getPutTKcHomework().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPutTKcHomework().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

}
