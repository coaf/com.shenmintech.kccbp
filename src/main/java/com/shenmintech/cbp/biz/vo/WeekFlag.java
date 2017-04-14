package com.shenmintech.cbp.biz.vo;

public enum WeekFlag {

  MONDAY("周一", "Monday"), TUESDAY("周二", "Tuesday"),WEDNESDAY("周三", "Wednesday"), THURSDAY("周四", "Thursday"),FRIDAY("周五", "Friday"), SATURDAY("周六", "Saturday"),SUNDAY("周日", "Sunday");
  
  private String china;
  private String englisg;
  
  private WeekFlag(String china, String englisg) {
    this.china = china;
    this.englisg = englisg;
  }

  public String getChina() {
    return china;
  }

  public void setChina(String china) {
    this.china = china;
  }

  public String getEnglisg() {
    return englisg;
  }

  public void setEnglisg(String englisg) {
    this.englisg = englisg;
  }
  
}
