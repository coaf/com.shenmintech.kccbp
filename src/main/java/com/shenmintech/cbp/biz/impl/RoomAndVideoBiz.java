package com.shenmintech.cbp.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.shenmintech.cbp.biz.IRoomAndVideoBiz;
import com.shenmintech.cbp.controller.bean.req.NetEasyRoomCreateChannelBean;
import com.shenmintech.cbp.controller.bean.req.NetEasyRoomCreateRoomReq;
import com.shenmintech.cbp.controller.bean.res.NetEasyRoomGetTokenResBean;
import com.shenmintech.cbp.controller.bean.res.NetEasyRoomResponse;
import com.shenmintech.cbp.controller.bean.res.NetEasyUserResponse;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.NeteasyUtil;

@Component
public class RoomAndVideoBiz implements IRoomAndVideoBiz {

  @Override
  public NetEasyRoomResponse createNetEasyRoom(NetEasyRoomCreateRoomReq req) {
    List<NameValuePair> nvps = new ArrayList<>();
    NetEasyRoomGetTokenResBean userInfoResult = getAccoutAndAccidAndToken(req.getOperatorUserId());
    if (userInfoResult.getCode() != 200) {
      createAccoutAndAccid(req.getOperatorUserId(), "用户" + req.getOperatorUserId());
    }


    String json2 = NeteasyUtil.sendPostNeteasyVideo(req.getGroupId() + req.getRoomName(),
        "https://vcloud.163.com/app/channel/create");
    System.out.println(json2);

    nvps.add(new BasicNameValuePair("creator", req.getOperatorUserId()));
    nvps.add(new BasicNameValuePair("name", req.getRoomName()));
    String json = NeteasyUtil.sendPostNeteasy(nvps, Constants.CHATROOM_CREAT_URL);
    Gson gson = new Gson();
    NetEasyRoomResponse response = gson.fromJson(json, NetEasyRoomResponse.class);

    NetEasyRoomCreateChannelBean tempResponse =
        gson.fromJson(json2, NetEasyRoomCreateChannelBean.class);

    NetEasyRoomResponse.Uinfos uinfos = response.getChatroom();
    uinfos.setHttpPullUrl(tempResponse.getRet().getHttpPullUrl());
    uinfos.setRtmpPullUrl(tempResponse.getRet().getRtmpPullUrl());
    uinfos.setPushUrl(tempResponse.getRet().getPushUrl());

    response.setChatroom(uinfos);


    return response;
  }

  @Override
  public NetEasyUserResponse createAccoutAndAccid(String accid, String name) {
    List<NameValuePair> nvps = new ArrayList<>();
    nvps.add(new BasicNameValuePair("accid", accid));
    nvps.add(new BasicNameValuePair("name", name));
    String json = NeteasyUtil.sendPostNeteasy(nvps, Constants.USER_CREAT_URL);
    Gson gson = new Gson();
    NetEasyUserResponse response = gson.fromJson(json, NetEasyUserResponse.class);

    return response;
  }

  @Override
  public NetEasyRoomGetTokenResBean getAccoutAndAccidAndToken(String accids) {
    List<NameValuePair> nvps = new ArrayList<>();
    List<String> accidsArray = new ArrayList<>();
    accidsArray.add(accids);
    Gson gson = new Gson();
    accids = gson.toJson(accidsArray);
    nvps.add(new BasicNameValuePair("accids", accids));
    String json = NeteasyUtil.sendPostNeteasy(nvps, Constants.USER_GETUINFOS_URL);
    NetEasyRoomGetTokenResBean response = gson.fromJson(json, NetEasyRoomGetTokenResBean.class);

    return response;
  }

  public void createChannel() {

  }



}
