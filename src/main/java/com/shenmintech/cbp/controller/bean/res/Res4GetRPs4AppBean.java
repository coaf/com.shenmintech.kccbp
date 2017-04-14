package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("APP端查询轮播图列表出参")
public class Res4GetRPs4AppBean extends BaseRetBean {

  @ApiModelProperty(value = "轮播图列表", required = true)
  List<RP4App> rp4Apps;

}
