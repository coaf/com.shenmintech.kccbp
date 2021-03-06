package com.shenmintech.common.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class Constants implements CommandLineRunner {

  private static final String[] TYPELIST_01234 = {"0", "1", "2", "3", "4"};
  private static final String[] PUSHLIST_012 = {"0", "1", "2"};
  public static final List<String> l01234 = Arrays.asList(TYPELIST_01234);
  public static final List<String> l012 = Arrays.asList(PUSHLIST_012);

  public static final String META_STATUS_CODE_0 = "0";
  public static final String META_STATUS_CODE_D1 = "-1";
  public static final String META_STATUS_CODE_D2 = "-2";
  public static final String META_STATUS_CODE_D3 = "-3";
  public static final String BLANKSTR = "";
  public static final String ALL = "ALL";
  public static final String SUCCESS = "SUCCESS";

  // 网易聊天相关常量
  public static String APP_KEY;

  public static String APP_SECRET;

  @Value("${net.app.chatRoomCreateUrl}")
  public static String CHATROOM_CREAT_URL;

  @Value("${net.app.userCreateUrl}")
  public static String USER_CREAT_URL;

  @Value("${net.app.userGetUinfosUrl}")
  public static String USER_GETUINFOS_URL;


  @Value("${net.app.key}")
  public String appKey;

  @Value("${net.app.secret}")
  public String appSecret;

  @Value("${net.app.chatRoomCreateUrl}")
  public String chatRoomCreateUrl;

  @Value("${net.app.userCreateUrl}")
  public String userCreateUrl;

  @Value("${net.app.userGetUinfosUrl}")
  public String userGetUinfosUrl;



  @Override
  public void run(String... arg0) throws Exception {
    // TODO Auto-generated method stub
    APP_KEY = appKey;
    APP_SECRET = appSecret;
    CHATROOM_CREAT_URL = chatRoomCreateUrl;
    USER_CREAT_URL = userCreateUrl;
    USER_GETUINFOS_URL = userGetUinfosUrl;

  }

}
