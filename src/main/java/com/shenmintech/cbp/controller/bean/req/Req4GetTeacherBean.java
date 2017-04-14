package com.shenmintech.cbp.controller.bean.req;

import com.shenmintech.base.bean.BaseReqBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel
public class Req4GetTeacherBean extends BaseReqBean {

  @ApiModelProperty(value = "用户登陆ID", required = true, example = "13900000100")
  String loginName;

  @ApiModelProperty(value = "用户登陆密码", required = true, example = "123456")
  String passWord;

}
