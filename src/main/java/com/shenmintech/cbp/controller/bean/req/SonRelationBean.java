package com.shenmintech.cbp.controller.bean.req;

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
public class SonRelationBean {

  @ApiModelProperty(value = "课的实例ID", required = true)
  public String clazzId;

  @ApiModelProperty(value = "课程开始时间", required = true)
  public String startTime;

  @ApiModelProperty(value = "课程结束时间", required = true)
  public String endTime;
}
