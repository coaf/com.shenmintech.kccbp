package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModel;
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
@ApiModel("当前课程小组对象")
public class Son4GetGroup1Bean {

  @ApiModelProperty(value = "小组ID", required = true)
  public String groupId;

  @ApiModelProperty(value = "小组名", required = true)
  public String groupName;

}
