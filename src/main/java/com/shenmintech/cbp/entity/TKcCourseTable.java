package com.shenmintech.cbp.entity;

import java.util.Date;

public class TKcCourseTable {
  private String id;

  private Integer clazzNo;

  private String clazzName;

  private String picId;

  private String courseFid;

  private Date createTime;

  private Date updateTime;

  private Integer status;

  private String remark1;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getClazzNo() {
    return clazzNo;
  }

  public void setClazzNo(Integer clazzNo) {
    this.clazzNo = clazzNo;
  }

  public String getClazzName() {
    return clazzName;
  }

  public void setClazzName(String clazzName) {
    this.clazzName = clazzName;
  }

  public String getPicId() {
    return picId;
  }

  public void setPicId(String picId) {
    this.picId = picId;
  }

  public String getCourseFid() {
    return courseFid;
  }

  public void setCourseFid(String courseFid) {
    this.courseFid = courseFid;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getRemark1() {
    return remark1;
  }

  public void setRemark1(String remark1) {
    this.remark1 = remark1;
  }
}
