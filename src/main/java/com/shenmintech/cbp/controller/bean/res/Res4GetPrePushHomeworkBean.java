package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("获取列表")
@Getter
@Setter
public class Res4GetPrePushHomeworkBean extends BaseRetBean {

  @ApiModelProperty(value = "任务列表", required = true)
  public List<Homework> homeworks;

  @ApiModelProperty(value = "一级公司列表", required = true)
  public List<Company> companies;

  @ApiModelProperty(value = "推送时间", required = true)
  public List<PushInfo> pushInfo;
}
