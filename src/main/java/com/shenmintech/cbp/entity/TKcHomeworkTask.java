package com.shenmintech.cbp.entity;

import java.util.Date;

public class TKcHomeworkTask {
  private String id;

  private String teacherId;

  private String homeworkFid;

  private String companyFid;

  private String courseFid;

  private String groupFids;

  private String clazzFid;

  private String pushTimeTypeFid;

  private Integer status;

  private Date createTime;

  private Date updateTime;

  private String remark;

  private String remark1;

  private String remark2;

  private String remark3;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(String teacherId) {
    this.teacherId = teacherId;
  }

  public String getHomeworkFid() {
    return homeworkFid;
  }

  public void setHomeworkFid(String homeworkFid) {
    this.homeworkFid = homeworkFid;
  }

  public String getCompanyFid() {
    return companyFid;
  }

  public void setCompanyFid(String companyFid) {
    this.companyFid = companyFid;
  }

  public String getCourseFid() {
    return courseFid;
  }

  public void setCourseFid(String courseFid) {
    this.courseFid = courseFid;
  }

  public String getGroupFids() {
    return groupFids;
  }

  public void setGroupFids(String groupFids) {
    this.groupFids = groupFids;
  }

  public String getClazzFid() {
    return clazzFid;
  }

  public void setClazzFid(String clazzFid) {
    this.clazzFid = clazzFid;
  }

  public String getPushTimeTypeFid() {
    return pushTimeTypeFid;
  }

  public void setPushTimeTypeFid(String pushTimeTypeFid) {
    this.pushTimeTypeFid = pushTimeTypeFid;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
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

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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
}
