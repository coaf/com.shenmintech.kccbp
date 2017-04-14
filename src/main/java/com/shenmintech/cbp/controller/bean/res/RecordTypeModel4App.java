package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RecordTypeModel4App {

  @ApiModelProperty(value = "类型", required = true)
  public String recordType;

  @ApiModelProperty(value = "类型名", required = true)
  public String recordTypeName;

  @ApiModelProperty(value = "录播视频实例列表", required = true)
  List<RecordModel4App> recordModel;

}
