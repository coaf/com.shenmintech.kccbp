package com.shenmintech.cbp.entity;

import java.util.Date;

public class TKcRollingPlacehd {
  private String id;

  private Integer hisIndex;

  private String rollingPicFid;

  private Date createTime;

  private Date updateTime;

  private Integer status;

  private String remark;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getHisIndex() {
    return hisIndex;
  }

  public void setHisIndex(Integer hisIndex) {
    this.hisIndex = hisIndex;
  }

  public String getRollingPicFid() {
    return rollingPicFid;
  }

  public void setRollingPicFid(String rollingPicFid) {
    this.rollingPicFid = rollingPicFid;
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

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
}
