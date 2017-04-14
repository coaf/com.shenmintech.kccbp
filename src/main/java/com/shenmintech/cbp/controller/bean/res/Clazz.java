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
public class Clazz {

  @ApiModelProperty(value = "课的主键ID", required = true)
  public String clazzId;

  @ApiModelProperty(value = "课的名字", required = true)
  public String clazzName;
}
