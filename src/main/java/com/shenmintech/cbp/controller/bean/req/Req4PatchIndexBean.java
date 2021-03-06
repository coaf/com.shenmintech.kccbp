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
public class Req4PatchIndexBean extends BaseReqBean {

  @ApiModelProperty(value = "录播视频Id", required = true)
  public String recordId;

  @ApiModelProperty(value = "调整排序标识，0--置顶，1--上移，2--下移", required = true)
  public String changeFlg;

}
