package com.shenmintech.cbp.entity;

import java.util.Date;

public class TKcHomeworkWorkCard {
  private String id;

  private String homeworkStudentRelationFid;

  private String selections;

  private String currentWeekTarget;

  private String currentWeekResult;

  private Integer weekNo;

  private Integer status;

  private Date commitTime;

  private Date createTime;

  private Date updateTime;

  private String remark1;

  private String remark2;

  private String remark3;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getHomeworkStudentRelationFid() {
    return homeworkStudentRelationFid;
  }

  public void setHomeworkStudentRelationFid(String homeworkStudentRelationFid) {
    this.homeworkStudentRelationFid = homeworkStudentRelationFid;
  }

  public String getSelections() {
    return selections;
  }

  public void setSelections(String selections) {
    this.selections = selections;
  }

  public String getCurrentWeekTarget() {
    return currentWeekTarget;
  }

  public void setCurrentWeekTarget(String currentWeekTarget) {
    this.currentWeekTarget = currentWeekTarget;
  }

  public String getCurrentWeekResult() {
    return currentWeekResult;
  }

  public void setCurrentWeekResult(String currentWeekResult) {
    this.currentWeekResult = currentWeekResult;
  }

  public Integer getWeekNo() {
    return weekNo;
  }

  public void setWeekNo(Integer weekNo) {
    this.weekNo = weekNo;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Date getCommitTime() {
    return commitTime;
  }

  public void setCommitTime(Date commitTime) {
    this.commitTime = commitTime;
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
