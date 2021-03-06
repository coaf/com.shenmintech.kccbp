package com.shenmintech.cbp.controller.bean.req;

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
public class ClazzObj {

  @ApiModelProperty(value = "课的名字", required = true)
  public String clazzName;

  @ApiModelProperty(value = "图片ID", required = true)
  public String picId;

}
