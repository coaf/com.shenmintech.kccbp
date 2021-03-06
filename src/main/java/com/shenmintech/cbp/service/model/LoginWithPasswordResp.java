package com.shenmintech.cbp.service.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginWithPasswordResp {
  public int error;
  public double height;
  public int isNeedFillUserInfo;
  public String msg;
  public String name;
  public String nickname;
  public String ntesAccId;
  public String ntesToken;
  public String sessionid;
  public boolean success;
  public String userId;
  public double weight;
  public String pictureId;
}
