package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("小组列表出参")
public class Son4GetGroupBean {

  @ApiModelProperty(value = "小组ID", required = true)
  public String groupId;

  @ApiModelProperty(value = "小组名", required = true)
  public String groupName;

  @ApiModelProperty(value = "创建日期", required = true)
  public String createDate;

  @ApiModelProperty(value = "小组人数", required = true)
  public String studentCount;

  @ApiModelProperty(value = "当前小组在当前课程下的时间分配状态，0：未加时间 1：已加时间", required = true)
  public String courseGroupStatus;
}
