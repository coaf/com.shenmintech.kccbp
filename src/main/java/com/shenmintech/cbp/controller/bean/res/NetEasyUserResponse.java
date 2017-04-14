package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class NetEasyUserResponse {
  @ApiModelProperty(value = "描述", required = true)
  private String desc;
  @ApiModelProperty(value = "状态码,414表示已存在，200表示ok", required = true)
  private int code;
  @ApiModelProperty(value = "用户信息", required = true)
  private Info info;

  @Data
  public class Info {
    @ApiModelProperty(value = "用户token", required = true)
    private String token;
    @ApiModelProperty(value = "用户accid", required = true)
    private String accid;
    private String name;
  }
}
