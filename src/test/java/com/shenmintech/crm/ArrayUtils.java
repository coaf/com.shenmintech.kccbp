package com.shenmintech.crm;

import java.text.ParseException;

import com.shenmintech.cbp.controller.bean.res.NetEasyUserResponse;
import com.shenmintech.common.util.GsonUtil;

public class ArrayUtils {

  public static void main(String[] args) throws ParseException {
    NetEasyUserResponse np = GsonUtil.gson.fromJson("{\"desc\":\"already register\",\"code\":414}",NetEasyUserResponse.class);
    System.out.println("=====");
    System.out.println("=====");
    System.out.println("=====");
    System.out.println("=====");
    System.out.println("=====");

  }

}
