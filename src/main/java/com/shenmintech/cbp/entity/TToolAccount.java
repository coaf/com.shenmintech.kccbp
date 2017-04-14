package com.shenmintech.cbp.entity;

import java.util.Date;

public class TToolAccount {
  private String id;

  private String activeId;

  private String passiveId;

  private String actionId;

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

  public String getActiveId() {
    return activeId;
  }

  public void setActiveId(String activeId) {
    this.activeId = activeId;
  }

  public String getPassiveId() {
    return passiveId;
  }

  public void setPassiveId(String passiveId) {
    this.passiveId = passiveId;
  }

  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
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
