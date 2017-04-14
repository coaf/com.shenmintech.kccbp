package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

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
public class HisClassMates {

  @ApiModelProperty(value = "同班同学ID", required = true)
  List<String> classMates;

}
