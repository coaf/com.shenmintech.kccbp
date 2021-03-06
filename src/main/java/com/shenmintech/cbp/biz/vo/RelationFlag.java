package com.shenmintech.cbp.biz.vo;

public enum RelationFlag {

  CLASSMATES("同组", 1), COURSEMATES("同课程", 2), COWORKER("同事",3);
  
  private String desc;
  private int code;

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  private RelationFlag(String desc, int code) {
    this.desc = desc;
    this.code = code;
  }
  
}
