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
public class ResRecords4AppBean extends BaseRetBean {

  @ApiModelProperty(value = "用户ID", required = true)
  String userId;

  @ApiModelProperty(value = "录播类型父级列表", required = true)
  List<RecordTypeModel4App> records;

}
