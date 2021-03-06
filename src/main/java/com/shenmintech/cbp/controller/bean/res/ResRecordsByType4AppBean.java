package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

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
public class ResRecordsByType4AppBean extends BaseRetBean {

  @ApiModelProperty(value = "类型", required = true)
  public String recordType;

  @ApiModelProperty(value = "类型名", required = true)
  public String recordTypeName;

  @ApiModelProperty(value = "录播视频实例列表", required = true)
  List<RecordModel4App> recordModel;

}
