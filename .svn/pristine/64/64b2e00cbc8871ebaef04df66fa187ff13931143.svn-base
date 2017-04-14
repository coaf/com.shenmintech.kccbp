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
public class Req4GetEmployeeBean extends BaseReqBean {

  @ApiModelProperty(value = "课程ID", required = true, example = "842616368733753344")
  public String courseId;

  @ApiModelProperty(value = "关键字（姓名/手机号）", required = false, example = "王")
  public String keywords;

  @ApiModelProperty(value = "小组id", required = false, example = "842616686917849088")
  public String groupId;

  @ApiModelProperty(value = "体重相关", required = false)
  public String weightRelated;

  @ApiModelProperty(value = "肌肉相关", required = false)
  public String muscleRelated;

  @ApiModelProperty(value = "水分相关", required = false)
  public String waterRelated;
}
