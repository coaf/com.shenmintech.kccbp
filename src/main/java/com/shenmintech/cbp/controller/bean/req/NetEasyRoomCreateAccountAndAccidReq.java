package com.shenmintech.cbp.controller.bean.req;

import com.shenmintech.base.bean.BaseReqBean;

import io.swagger.annotations.ApiModelProperty;

public class NetEasyRoomCreateAccountAndAccidReq extends BaseReqBean {

  @ApiModelProperty(value = "用户名称", required = true)
  private String userName;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }



}
