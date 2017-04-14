package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("直播间列表")
@Getter
@Setter
public class Res4GetRoomBean extends BaseRetBean {

  @ApiModelProperty(value = "房间列表", required = true)
  List<RoomModel> roomList;

  @ApiModelProperty(value = "开课时间列表", required = true)
  List<String> timeList;

  @ApiModelProperty(value = "教师token", required = true)
  String teacherToken;

  @ApiModelProperty(value = "教师accid", required = true)
  String teacherAccid;
}
