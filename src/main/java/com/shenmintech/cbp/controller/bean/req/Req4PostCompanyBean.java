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
public class Req4PostCompanyBean extends BaseReqBean {

  @ApiModelProperty(value = "公司名称", required = true, example = "上海云鼎企业")
  public String companyName;

  @ApiModelProperty(value = "预计的学员数量", required = true, example = "450")
  public String estimatedStudentsNum;

}
