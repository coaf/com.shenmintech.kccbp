package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("获取用户收藏课程列表出参")
@Getter
@Setter
public class Res4GetUCRBean extends BaseRetBean {

  @ApiModelProperty(value = "用户收藏的课程列表", required = true)
  List<CollectedRecord> list;

}
