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
public class PushedHomework {

  @ApiModelProperty(value = "作业实例的ID", required = true)
  String relationId;

  @ApiModelProperty(value = "完成日期", required = true)
  String finishedTime;

  @ApiModelProperty(value = "学生姓名", required = true)
  String studentName;

}
