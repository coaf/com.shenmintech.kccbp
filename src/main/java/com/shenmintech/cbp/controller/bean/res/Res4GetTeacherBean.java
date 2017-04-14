package com.shenmintech.cbp.controller.bean.res;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("用户登录出参")
@Getter
@Setter
public class Res4GetTeacherBean extends BaseRetBean {

  @ApiModelProperty(value = "用户ID", required = true)
  String userId;

  @ApiModelProperty(value = "教师ID", required = true)
  String teacherId;

  @ApiModelProperty(value = "昵称", required = true)
  String nickname;

  @ApiModelProperty(value = "网易第三方accid", required = true)
  String ntesAccid;

  @ApiModelProperty(value = "网易第三方token", required = true)
  String ntesToken;

  @ApiModelProperty(value = "用户头像", required = true)
  String pictureId;

  @ApiModelProperty(value = "sessionid", required = true)
  String sessionid;
}
