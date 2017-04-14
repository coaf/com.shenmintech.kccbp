package com.shenmintech.cbp.biz.vo;

public enum HideFlag {

  HIDE("隐藏", "1"), UNHIDE("不隐藏", "0");
  
  private String desc;
  private String code;

  private HideFlag(String desc, String code) {
    this.desc = desc;
    this.code = code;
  }

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
  
}
