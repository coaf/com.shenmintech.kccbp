package com.shenmintech.cbp.controller.bean.res;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("添加学生出参")
public class Res4PostStudentBean extends BaseRetBean {

  @ApiModelProperty(value = "添加学生的学生ID", required = true)
  public String studentId;

}
