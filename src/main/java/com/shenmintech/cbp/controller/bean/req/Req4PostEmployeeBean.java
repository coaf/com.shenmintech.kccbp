package com.shenmintech.cbp.controller.bean.req;

import com.shenmintech.base.bean.BaseReqBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Req4PostEmployeeBean extends BaseReqBean {

  @ApiModelProperty(value = "用户id", required = true)
  public String userId;

  @ApiModelProperty(value = "公司id", required = true)
  public String companyId;

  @ApiModelProperty(value = "姓名", required = false)
  public String realName;

  @ApiModelProperty(value = "员工号", required = false)
  public String employeeNo;

}
