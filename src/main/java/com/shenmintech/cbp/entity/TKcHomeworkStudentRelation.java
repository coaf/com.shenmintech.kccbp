package com.shenmintech.cbp.entity;

import java.util.Date;

public class TKcHomeworkStudentRelation {
  private String id;

  private String taskFid;

  private String homeworkFid;

  private String studentFid;

  private Date createTime;

  private Date updateTime;

  private Integer status;

  private String remark1;

  private String remark2;

  private String remark3;

  private String remark4;

  private String remark5;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTaskFid() {
    return taskFid;
  }

  public void setTaskFid(String taskFid) {
    this.taskFid = taskFid;
  }

  public String getHomeworkFid() {
    return homeworkFid;
  }

  public void setHomeworkFid(String homeworkFid) {
    this.homeworkFid = homeworkFid;
  }

  public String getStudentFid() {
    return studentFid;
  }

  public void setStudentFid(String studentFid) {
    this.studentFid = studentFid;
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

  public String getRemark2() {
    return remark2;
  }

  public void setRemark2(String remark2) {
    this.remark2 = remark2;
  }

  public String getRemark3() {
    return remark3;
  }

  public void setRemark3(String remark3) {
    this.remark3 = remark3;
  }

  public String getRemark4() {
    return remark4;
  }

  public void setRemark4(String remark4) {
    this.remark4 = remark4;
  }

  public String getRemark5() {
    return remark5;
  }

  public void setRemark5(String remark5) {
    this.remark5 = remark5;
  }
}
