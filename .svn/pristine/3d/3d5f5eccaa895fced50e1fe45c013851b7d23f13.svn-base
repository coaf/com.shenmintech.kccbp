package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("用户端查询用户信息出参")
public class Res4AppGetUserInfoBean extends BaseRetBean {

  @ApiModelProperty(value = "用户ID", required = true)
  public String userId;

  @ApiModelProperty(value = "用户昵称", required = true)
  public String userNickname;

  @ApiModelProperty(value = "用户头像ID", required = true)
  public String userAvatarId;

  @ApiModelProperty(value = "用户所在公司", required = true)
  public String userCompany;

  @ApiModelProperty(value = "用户所在的班级|小组", required = true)
  public List<String> groupList;

}
