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
public class RoomModel {

  @ApiModelProperty(value = "上课实例ID", required = true)
  public String relaId;

  @ApiModelProperty(value = "上课时间段", required = true)
  public String period;

  @ApiModelProperty(value = "班级名", required = true)
  public String courseName;

  @ApiModelProperty(value = "小组名", required = true)
  public String groupName;

  @ApiModelProperty(value = "课程名", required = true)
  public String clazzName;

  @ApiModelProperty(value = "房间ID", required = true)
  public String roomId;

  @ApiModelProperty(value = "推流地址", required = true)
  public String pushUrl;
}
