package com.shenmintech.cbp.entity;

import java.util.Date;

public class TKcHomework {
  private String id;

  private String teacherFid;

  private String workName;

  private String workTypeFid;

  private String workDescribe;

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

  public String getTeacherFid() {
    return teacherFid;
  }

  public void setTeacherFid(String teacherFid) {
    this.teacherFid = teacherFid;
  }

  public String getWorkName() {
    return workName;
  }

  public void setWorkName(String workName) {
    this.workName = workName;
  }

  public String getWorkTypeFid() {
    return workTypeFid;
  }

  public void setWorkTypeFid(String workTypeFid) {
    this.workTypeFid = workTypeFid;
  }

  public String getWorkDescribe() {
    return workDescribe;
  }

  public void setWorkDescribe(String workDescribe) {
    this.workDescribe = workDescribe;
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
