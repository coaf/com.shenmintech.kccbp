package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("单堂课对象")
public class Son4GetTeachClazzBean {

  @ApiModelProperty(value = "具体某堂课的ID", required = true)
  public String courseTableGroupRelationId;

  @ApiModelProperty(value = "开课时间", required = true)
  public String startTime;

  @ApiModelProperty(value = "结束时间", required = true)
  public String endTime;

  @ApiModelProperty(value = "课堂名", required = true)
  public String clazzName;

  @ApiModelProperty(value = "课堂编号", required = true)
  public String clazzNo;

}
