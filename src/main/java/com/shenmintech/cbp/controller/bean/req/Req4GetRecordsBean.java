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
public class Req4GetRecordsBean extends BaseReqBean {

  @ApiModelProperty(value = "视频名称（关键字模糊查询）", required = false, example = "零食")
  String keywords;// 关键字模糊查询

  @ApiModelProperty(value = "视频类型ID（不传为全部）", required = false, example = "1")
  String recordTypeId;

}
