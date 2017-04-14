package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Homework {

  @ApiModelProperty(value = "课后作业主键ID", required = true)
  public String homeworkId;

  @ApiModelProperty(value = "课后作业名", required = true)
  public String homeworkName;

}