package com.shenmintech.cbp.controller.bean.res;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("获取员工详情数据出参")
@Getter
@Setter
public class Res4GetUserInfoBean extends BaseRetBean {

  @ApiModelProperty(value = "基础信息相关", required = true)
  BasicInfo basicInfo;

  @ApiModelProperty(value = "体重相关", required = true)
  WeightBMI weightBMI;

  @ApiModelProperty(value = "热量与分配建议相关", required = true)
  CalAndDistributeSuggest calAndDistributeSuggest;
}
