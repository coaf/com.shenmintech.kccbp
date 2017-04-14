package com.shenmintech.cbp.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shenmintech.base.template.HttpRestTemplate;
import com.shenmintech.cbp.biz.vo.res.Res4AddUserVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetUserVo;
import com.shenmintech.cbp.client.model.QueryUsersResp;
import com.shenmintech.cbp.exception.ApplicationException;
import com.shenmintech.cbp.service.IUserService;
import com.shenmintech.cbp.service.model.Res4AddUserModel;
import com.shenmintech.cbp.service.model.TUser;
import com.shenmintech.cbp.service.model.UserModel;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.GsonUtil;

@Service
@RefreshScope
@Transactional
public class UserServiceImpl implements IUserService {

  @Autowired
  HttpRestTemplate httpRestTemplate;

  // 通过id查询用户
  @Value("${shenmin-authority.authority.queryUserById}")
  private String queryUserByIdURL;

  //
  @Value("${shenmin-authority.account.saveCRMUserDetailForPang}")
  private String saveCRMUserDetailForPangURL;

  @Override
  public Res4GetUserVo selectByUserId(String userId) {
    Res4GetUserVo res4GetUserVo = new Res4GetUserVo();
    QueryUsersResp resp = new QueryUsersResp(userId);
    String reqStr = GsonUtil.gson.toJson(resp);
    String resStr = httpRestTemplate.postForObject(queryUserByIdURL, reqStr);
    UserModel userModel = GsonUtil.gson.fromJson(resStr, UserModel.class);
    if (0 == userModel.getError()) {
      TUser tUser = userModel.getUser();
      if (null != tUser) {
        String mobile = tUser.getMobile();
        res4GetUserVo.setUserMobile(mobile);
        String createDate = tUser.getCreateDate();
        Date registerDate = new Date(Long.parseLong(createDate));
        res4GetUserVo.setRegisterDate(registerDate);
        return res4GetUserVo;
      } else {
        res4GetUserVo.setUserMobile("--");
        return res4GetUserVo;
      }
    } else {
      throw new ApplicationException(Constants.META_STATUS_CODE_D1, "用户模块调用失败", Constants.BLANKSTR);
    }

  }

  @Override
  public Res4AddUserVo addUser(String birthday, String email, String heatUnit, double height,
      String isFoodSupplement, String isLactation, String mobile, String nickname, int sex,
      double weight) {
    Res4AddUserVo vo = new Res4AddUserVo();
    Map<String, Object> map = new HashMap<>();
    map.put("age", 0);
    map.put("birthday", birthday);
    map.put("email", email);
    map.put("heatUnit", heatUnit);
    map.put("height", height);
    map.put("isFoodSupplement", isFoodSupplement);
    map.put("isLactation", isLactation);
    map.put("mobile", mobile);
    map.put("nickname", nickname);
    map.put("sex", sex);
    map.put("weight", weight);
    String jsonBodyStr = GsonUtil.gson.toJson(map);
    String result = httpRestTemplate.postForObject(saveCRMUserDetailForPangURL, jsonBodyStr);
    Res4AddUserModel res4AddUserModel = GsonUtil.gson.fromJson(result, Res4AddUserModel.class);
    if (0 == res4AddUserModel.getError()) {// 新注册
      vo.setFlag("0");
      vo.setUserId(res4AddUserModel.getUserId());
      return vo;
    } else if (2 == res4AddUserModel.getError()) {// 已存在
      vo.setFlag("0");
      vo.setUserId(res4AddUserModel.getUserId());
      return vo;
    }
    vo.setFlag("-1");
    vo.setUserId("");
    return vo;
  }

}
