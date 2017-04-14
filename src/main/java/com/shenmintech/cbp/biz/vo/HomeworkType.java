package com.shenmintech.cbp.biz.vo;

public enum HomeworkType {

  PIC_TXT("图文", "1"), SIGN_CARD("打卡", "2"), WORK_CARD("选卡片","3");
  
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

  private HomeworkType(String desc, String code) {
    this.desc = desc;
    this.code = code;
  }
  
}
