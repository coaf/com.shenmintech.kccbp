package com.shenmintech.cbp.controller.bean.res;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("查询单个轮播图详情出参")
public class Res4GetRollingPicBean extends BaseRetBean {

  @ApiModelProperty(value = "轮播图ID", required = true)
  public String rollingPicId;

  @ApiModelProperty(value = "轮播图名", required = true)
  public String rollingPicName;

  @ApiModelProperty(value = "轮播图跳转类型:0直播公开课，1链接", required = true)
  public String renderType;

  @ApiModelProperty(value = "轮播图跳直播时，直播课程的名称", required = false)
  public String pubCourseName;

  @ApiModelProperty(value = "轮播图跳直播时，直播课程的开课时间", required = false)
  public String preStartTime;

  @ApiModelProperty(value = "轮播图跳转地址", required = false)
  public String renderUrl;

  @ApiModelProperty(value = "备注信息", required = true)
  public String remark;

  @ApiModelProperty(value = "顺序标志，展示的时候为1/2/3/4，不展示的时候为空", required = true)
  public String hisIndex;

  @ApiModelProperty(value = "图片ID", required = true)
  public String picId;

  @ApiModelProperty(value = "状态:0打开，1关闭", required = true)
  public String status;

}
