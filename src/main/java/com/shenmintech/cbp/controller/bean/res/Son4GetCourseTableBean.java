package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("课程表出参")
public class Son4GetCourseTableBean {

  @ApiModelProperty(value = "课的ID", required = true)
  public String clazzId;

  @ApiModelProperty(value = "课的局部编号", required = true)
  public String clazzNo;

  @ApiModelProperty(value = "课名", required = true)
  public String clazzName;

  @ApiModelProperty(value = "该课对应的封面图", required = true)
  public String picId;

}

