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
public class Req4PutRecordStatusBean extends BaseReqBean {

  @ApiModelProperty(value = "录播视频ID", required = true)
  public String recordId;

  @ApiModelProperty(value = "是否隐藏标识：0否（不隐藏），1是（隐藏）", required = true)
  public String hideFlag;
}
