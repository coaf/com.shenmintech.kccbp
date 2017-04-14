package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("获取推送任务列表出参")
@Getter
@Setter
public class Res4GetPushHomeworksBean extends BaseRetBean {

  @ApiModelProperty(value = "推送列表", required = true)
  public List<Son4GetPushHomeworksBean> list;



}
