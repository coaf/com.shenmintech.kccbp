package com.shenmintech.cbp.entity;

import java.util.Date;

public class TKcCourseTableGroupRelation {
  private String id;

  private String groupFid;

  private String courseTableFid;

  private Date preStartTime;

  private Date preEndTime;

  private Date createTime;

  private Date updateTime;

  private Integer status;

  private String ntesRoomId;

  private String ntesRoomName;

  private String ntesRtmpPullUrl;

  private String ntesHttpPullUrl;

  private String ntesPushUrl;

  private String remark1;

  private String remark2;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getGroupFid() {
    return groupFid;
  }

  public void setGroupFid(String groupFid) {
    this.groupFid = groupFid;
  }

  public String getCourseTableFid() {
    return courseTableFid;
  }

  public void setCourseTableFid(String courseTableFid) {
    this.courseTableFid = courseTableFid;
  }

  public Date getPreStartTime() {
    return preStartTime;
  }

  public void setPreStartTime(Date preStartTime) {
    this.preStartTime = preStartTime;
  }

  public Date getPreEndTime() {
    return preEndTime;
  }

  public void setPreEndTime(Date preEndTime) {
    this.preEndTime = preEndTime;
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

  public String getNtesRoomId() {
    return ntesRoomId;
  }

  public void setNtesRoomId(String ntesRoomId) {
    this.ntesRoomId = ntesRoomId;
  }

  public String getNtesRoomName() {
    return ntesRoomName;
  }

  public void setNtesRoomName(String ntesRoomName) {
    this.ntesRoomName = ntesRoomName;
  }

  public String getNtesRtmpPullUrl() {
    return ntesRtmpPullUrl;
  }

  public void setNtesRtmpPullUrl(String ntesRtmpPullUrl) {
    this.ntesRtmpPullUrl = ntesRtmpPullUrl;
  }

  public String getNtesHttpPullUrl() {
    return ntesHttpPullUrl;
  }

  public void setNtesHttpPullUrl(String ntesHttpPullUrl) {
    this.ntesHttpPullUrl = ntesHttpPullUrl;
  }

  public String getNtesPushUrl() {
    return ntesPushUrl;
  }

  public void setNtesPushUrl(String ntesPushUrl) {
    this.ntesPushUrl = ntesPushUrl;
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
}
