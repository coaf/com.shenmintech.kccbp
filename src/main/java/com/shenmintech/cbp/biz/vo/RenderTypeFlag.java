package com.shenmintech.cbp.biz.vo;

public enum RenderTypeFlag {

  RENDER_PUB_COURSE("跳直播公开课", "0"), RENDER_URL("跳链接", "1");
  
  private String desc;
  private String code;

  private RenderTypeFlag(String desc, String code) {
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
