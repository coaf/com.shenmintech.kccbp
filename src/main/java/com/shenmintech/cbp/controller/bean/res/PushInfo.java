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
public class PushInfo {

  @ApiModelProperty(value = "推送标识：0即时推送，1课前推送，2课后推送", required = true)
  public String pushFlag;

  @ApiModelProperty(value = "推送描述", required = true)
  public String pushDesc;

}
