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
public class WeightBMI {

  @ApiModelProperty(value = "BMI数据+解释说明", required = true)
  String bmiStr;

  @ApiModelProperty(value = "健康体重区间", required = true)
  String healthWeightBetween;

  @ApiModelProperty(value = "当前体重", required = true)
  String currentWeight;

  @ApiModelProperty(value = "初始体重", required = true)
  String initWeight;
}
