package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("查询课后作业列表出参")
@Getter
@Setter
public class Res4GetHomeworkBean extends BaseRetBean {

  @ApiModelProperty(value = "作业列表", required = true)
  public List<Son4GetHomeworkBean> list;

}
