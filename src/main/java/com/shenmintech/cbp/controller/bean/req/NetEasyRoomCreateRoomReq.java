package com.shenmintech.cbp.controller.bean.req;

import com.shenmintech.base.bean.BaseReqBean;

import io.swagger.annotations.ApiModelProperty;

public class NetEasyRoomCreateRoomReq extends BaseReqBean {

  @ApiModelProperty(value = "小组id", required = true)
  private String groupId;

  @ApiModelProperty(value = "聊天室名称", required = true)
  private String roomName;


  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public String getRoomName() {
    return roomName;
  }


  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }



}
