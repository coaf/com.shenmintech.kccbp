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
public class Req4PostGroupBean extends BaseReqBean {

  @ApiModelProperty(value = "班级id", required = true)
  public String courseFid;

  @ApiModelProperty(value = "小组名", required = true)
  public String groupName;
}
