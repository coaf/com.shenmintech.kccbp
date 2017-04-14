package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("目标范围-- 每条明细")
public class Res4AppGetHomeworkWorkCardStandardsVoBean {

  @ApiModelProperty(value = "目标名称", required = true)
  private String name;


  @ApiModelProperty(value = "目标picId", required = true)
  private String picId;

}
