package com.shenmintech.cbp.controller.bean.req;

import com.shenmintech.base.bean.BaseReqBean;

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
public class Req4GetTeachClazzBean extends BaseReqBean {

  @ApiModelProperty(value = "小组ID", required = true, example = "c143a615-a50c-47e2-95b0-37532999")
  public String groupId;

}
