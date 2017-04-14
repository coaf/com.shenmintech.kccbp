package com.shenmintech.cbp.biz;

import com.shenmintech.cbp.controller.bean.req.NetEasyRoomCreateRoomReq;
import com.shenmintech.cbp.controller.bean.res.NetEasyRoomGetTokenResBean;
import com.shenmintech.cbp.controller.bean.res.NetEasyRoomResponse;
import com.shenmintech.cbp.controller.bean.res.NetEasyUserResponse;

public interface IRoomAndVideoBiz {

  NetEasyRoomResponse createNetEasyRoom(NetEasyRoomCreateRoomReq req);

  NetEasyUserResponse createAccoutAndAccid(String accid, String name);

  NetEasyRoomGetTokenResBean getAccoutAndAccidAndToken(String accid);

}
