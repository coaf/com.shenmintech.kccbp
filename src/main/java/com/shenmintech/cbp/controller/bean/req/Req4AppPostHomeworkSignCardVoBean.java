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
public class Req4AppPostHomeworkSignCardVoBean {

  @ApiModelProperty(value = "具体任务流水id", required = true)
  public String id;

  @ApiModelProperty(value = "早餐标记", required = true)
  public Integer breakfastFlag;

  @ApiModelProperty(value = "午餐标记", required = true)
  public Integer lunchFlag;

  @ApiModelProperty(value = "晚餐标记", required = true)
  public Integer supperFlag;

  @ApiModelProperty(value = "饮水", required = true)
  public Integer drinkWater;

}
