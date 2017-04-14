package com.shenmintech.common.util;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

public class GsonUtil {
  public static final Gson gson = new Gson();


  /**
   * 构造Json数据
   * 
   * @return
   * @throws JSONException
   */
  public static String buildJson(String[] keys, String[] values) throws JSONException {

    // JSON格式数据解析对象
    JSONObject jo = new JSONObject();

    for (int i = 0; i < keys.length; i++) {
      jo.put(keys[i], values[i]);
    }
    return jo.toString();

  }
}
