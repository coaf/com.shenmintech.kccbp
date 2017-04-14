package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class NetEasyRoomGetTokenResBean {

  @ApiModelProperty(value = "用户信息", required = true)
  List<Uinfos> uinfos;

  @ApiModelProperty(value = "状态码", required = true)
  int code;


  public int getCode() {
    return code;
  }



  public void setCode(int code) {
    this.code = code;
  }



  public class Uinfos {

    @ApiModelProperty(value = "用户id", required = true)
    private String accid;

    @ApiModelProperty(value = "用户姓名", required = true)
    private String name;

    @ApiModelProperty(value = "性别", required = true)
    private String gender;

    public String getAccid() {
      return accid;
    }

    public void setAccid(String accid) {
      this.accid = accid;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getGender() {
      return gender;
    }

    public void setGender(String gender) {
      this.gender = gender;
    }


  }


}
