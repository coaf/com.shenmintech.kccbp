package com.shenmintech.cbp.controller.bean.res;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("用户获取课程出参")
public class Son4AppGetCourseBean {

  @ApiModelProperty(value = "课程ID", required = true)
  public String clazzId;

  @ApiModelProperty(value = "课程名", required = true)
  public String clazzName;

  @ApiModelProperty(value = "教师昵称", required = true)
  public String nickName;

  @ApiModelProperty(value = "课程开始时间", required = true)
  public String preStartTime;

  @ApiModelProperty(value = "还差多久开始", required = true)
  public String interval;

  @ApiModelProperty(value = "图片ID", required = true)
  public String picId;

  @ApiModelProperty(value = "网易http拉流地址", required = true)
  public String ntesHttpPullUrl;

  @ApiModelProperty(value = "网易直播房间ID", required = true)
  public String ntesRoomId;

  @ApiModelProperty(value = "网易直播房间名", required = true)
  public String ntesRoomName;

  @ApiModelProperty(value = "网易rtmp拉流地址", required = true)
  public String ntesRtmpPullUrl;

  @ApiModelProperty(value = "时间排序索引列", required = true)
  public Date tIndex;
}
