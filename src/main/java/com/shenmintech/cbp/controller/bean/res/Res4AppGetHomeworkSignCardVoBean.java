package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("用户获取具体打卡任务出参 -- 每条明细")
public class Res4AppGetHomeworkSignCardVoBean {
  @ApiModelProperty(value = "主键id", required = true)
  private String id;

  @ApiModelProperty(value = "日期", required = true)
  private String markDate;

  @ApiModelProperty(value = "早餐标志", required = true)
  private Integer breakfastFlag;

  @ApiModelProperty(value = "中餐标志", required = true)
  private Integer lunchFlag;

  @ApiModelProperty(value = "晚餐标志", required = true)
  private Integer supperFlag;

  @ApiModelProperty(value = "饮水量", required = true)
  private Integer drinkWater;
}
