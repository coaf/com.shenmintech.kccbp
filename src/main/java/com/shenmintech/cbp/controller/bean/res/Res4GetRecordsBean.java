package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("录播视频列表")
@Getter
@Setter
public class Res4GetRecordsBean extends BaseRetBean {

  @ApiModelProperty(value = "录播视频列表", required = true)
  List<RecordModel> recordList;

  @ApiModelProperty(value = "视频类型列表", required = true)
  List<RecordType> typeList;

}
