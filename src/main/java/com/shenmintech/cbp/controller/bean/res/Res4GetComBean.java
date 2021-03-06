package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("获取公司列表出参")
public class Res4GetComBean extends BaseRetBean {

  @ApiModelProperty(value = "公司列表", required = true)
  List<Sons4GetComBean> list;
}
