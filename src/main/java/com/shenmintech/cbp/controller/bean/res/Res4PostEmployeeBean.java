package com.shenmintech.cbp.controller.bean.res;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Api("新增员工出参")
@Setter
@Getter
public class Res4PostEmployeeBean extends BaseRetBean {

  @ApiModelProperty(value = "添加员工的员工ID", required = true)
  public String employeeId;

  @ApiModelProperty(value = "网易进房间ID", required = true)
  public String ntesAccId;

  @ApiModelProperty(value = "网易进房间token", required = true)
  public String ntesToken;

}
