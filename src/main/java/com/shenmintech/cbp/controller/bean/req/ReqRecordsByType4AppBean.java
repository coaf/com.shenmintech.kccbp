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
public class ReqRecordsByType4AppBean extends BaseReqBean {

  @ApiModelProperty(value = "用户ID", required = true)
  public String userId;

  @ApiModelProperty(value = "录播视频类型ID", required = true)
  public String recordTypeId;

}
