package com.shenmintech.cbp.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import com.shenmintech.base.template.HttpRestTemplate;
import com.shenmintech.cbp.biz.IAuthBiz;
import com.shenmintech.cbp.client.model.LoginWithPasswordReq;
import com.shenmintech.cbp.config.HttpErrorMsg;
import com.shenmintech.cbp.controller.bean.req.Req4GetTeacherBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetTeacherBean;
import com.shenmintech.cbp.entity.TKcTeacher;
import com.shenmintech.cbp.entity.TKcTeacherExample;
import com.shenmintech.cbp.mapper.TKcTeacherMapper;
import com.shenmintech.cbp.service.model.LoginWithPasswordResp;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.GsonUtil;
import com.shenmintech.common.util.StringUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RefreshScope
@SuppressWarnings("static-access")
public class AuthBizImpl implements IAuthBiz {

  @Autowired
  HttpRestTemplate httpRestTemplate;

  @Autowired
  TKcTeacherMapper tKcTeacherMapper;

  @Autowired
  HttpErrorMsg httpErrorMsg;

  // 调用权限模块进行登录验证
  @Value("${shenmin-authority.authority.loginWithPassword}")
  private String loginWithPasswordURL;

  @Override
  public Res4GetTeacherBean loginTeacher(Req4GetTeacherBean req4GetTeacherBean) {
    Res4GetTeacherBean resBean = new Res4GetTeacherBean();
    String loginName = req4GetTeacherBean.getLoginName();
    String passWord = req4GetTeacherBean.getPassWord();
    String platformCode = req4GetTeacherBean.getPlatformCode();
    if (StringUtil.checkBlank(loginName, passWord)) {
      log.error("loginName,passWord不能为空");
      resBean.setError(httpErrorMsg.getLogin().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getLogin().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }

    LoginWithPasswordReq loginWithPasswordReq =
        new LoginWithPasswordReq().builder().loginName(loginName).password(passWord)
            .platformCode(platformCode).realPlatformCode(platformCode).build();
    String reqStr = GsonUtil.gson.toJson(loginWithPasswordReq);
    String resStr = httpRestTemplate.postForObject(loginWithPasswordURL, reqStr);
    LoginWithPasswordResp loginWithPasswordResp =
        GsonUtil.gson.fromJson(resStr, LoginWithPasswordResp.class);
    int error = loginWithPasswordResp.getError();
    if (1 == error) {
      log.error("系统异常");
      resBean.setError(httpErrorMsg.getLogin().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getLogin().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    } else if (2 == error) {
      log.error("没有该平台登录权限");
      resBean.setError(httpErrorMsg.getLogin().permissioDenied.getCodeFail());
      resBean.setMsg(httpErrorMsg.getLogin().permissioDenied.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    } else if (102009003 == error) {
      log.error("无效的用户名或密码");
      resBean.setError(httpErrorMsg.getLogin().unameOrPwordExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getLogin().unameOrPwordExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    } else if (0 != error) {
      log.error("模块调用异常");
      resBean.setError(httpErrorMsg.getLogin().moduleTransExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getLogin().moduleTransExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }

    String userId = loginWithPasswordResp.getUserId();
    String picId = loginWithPasswordResp.getPictureId();
    String sessionId = loginWithPasswordResp.getSessionid();

    TKcTeacherExample example = new TKcTeacherExample();
    example.or().andStatusNotEqualTo(-1).andUserIdEqualTo(userId);
    List<TKcTeacher> list = tKcTeacherMapper.selectByExample(example);
    if (0 == list.size()) {
      log.error("用户未注册为老师");
      resBean.setError(httpErrorMsg.getLogin().processExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getLogin().processExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    } else if (1 < list.size()) {
      log.error("注册老师的数量不唯一，脏数据");
      resBean.setError(httpErrorMsg.getLogin().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getLogin().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    TKcTeacher teacher = list.get(0);

    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    resBean.setUserId(userId);
    resBean.setTeacherId(teacher.getId());
    resBean.setNickname(teacher.getNickName());
    resBean.setNtesAccid(teacher.getNtesAccid());
    resBean.setNtesToken(teacher.getNtesToken());
    resBean.setPictureId(picId);
    resBean.setSessionid(sessionId);
    return resBean;
  }

}
