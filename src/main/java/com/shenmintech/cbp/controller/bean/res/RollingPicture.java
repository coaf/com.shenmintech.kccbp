package com.shenmintech.cbp.controller.bean.res;

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
public class RollingPicture {

  @ApiModelProperty(value = "轮播图ID", required = true)
  String rollingPicId;

  @ApiModelProperty(value = "轮播图名字", required = true)
  String rollingPicName;

  @ApiModelProperty(value = "轮播图类型0直播公开课，1链接", required = true)
  String renderType;

  @ApiModelProperty(value = "预览地址", required = true)
  String renderUrl;

  @ApiModelProperty(value = "备注", required = true)
  String remark;

  @ApiModelProperty(value = "显示顺序", required = true)
  String hisIndex;

  @ApiModelProperty(value = "创建时间", required = true)
  String createTime;

  @ApiModelProperty(value = "图片ID", required = true)
  String picId;

  @ApiModelProperty(value = "状态：0打开状态，1关闭状态", required = true)
  String status;

}
