package com.shenmintech.cbp.biz.vo;

public enum PushStyle {

  PUSH_IMMEDIATELY("即时推送", "0"), PUSH_BEFORE_CLASS("课前推送", "1"), PUSH_AFTER_CLASS("课后推送","2");

  private String desc;
  private String code;

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  private PushStyle(String desc, String code) {
    this.desc = desc;
    this.code = code;
  }

}
