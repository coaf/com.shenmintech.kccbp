package com.shenmintech.cbp.controller.bean.req;

public class NetEasyRoomCreateChannelBean {
  private String code;

  NetEasyRoomCreateChannel ret;



  public String getCode() {
    return code;
  }



  public void setCode(String code) {
    this.code = code;
  }



  public NetEasyRoomCreateChannel getRet() {
    return ret;
  }



  public void setRet(NetEasyRoomCreateChannel ret) {
    this.ret = ret;
  }



  public class NetEasyRoomCreateChannel {
    private String httpPullUrl;

    private String rtmpPullUrl;

    private String pushUrl;



    public String getPushUrl() {
      return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
      this.pushUrl = pushUrl;
    }

    public String getHttpPullUrl() {
      return httpPullUrl;
    }

    public void setHttpPullUrl(String httpPullUrl) {
      this.httpPullUrl = httpPullUrl;
    }

    public String getRtmpPullUrl() {
      return rtmpPullUrl;
    }

    public void setRtmpPullUrl(String rtmpPullUrl) {
      this.rtmpPullUrl = rtmpPullUrl;
    }
  }



}
