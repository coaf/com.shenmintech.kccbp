package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("获取课程类型列表出参")
public class Res4CourseTypeBean {
  @ApiModelProperty(value = "类型ID", required = true)
  public String typeId;

  @ApiModelProperty(value = "类型名称", required = true)
  public String typeName;
}
