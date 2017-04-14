package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("当前课程员工对象")
public class Son4GetEmployeeBean {

  @ApiModelProperty(value = "用户ID", required = true)
  public String userId;

  @ApiModelProperty(value = "员工ID", required = true)
  public String employeeId;

  @ApiModelProperty(value = "学员ID", required = true)
  public String studentId;

  @ApiModelProperty(value = "小组ID", required = true)
  public String groupId;

  @ApiModelProperty(value = "累计减重", required = true)
  public String weightLossTotal;

  @ApiModelProperty(value = "饮食记录", required = true)
  public String dietaryRecord;

  @ApiModelProperty(value = "每日预算", required = true)
  public String dailyBudget;

  @ApiModelProperty(value = "减重百分比", required = true)
  public String weightLossPercentage;

  @ApiModelProperty(value = "周减重百分比", required = true)
  public String weightLossWeek;

  @ApiModelProperty(value = "BMI", required = true)
  public String BMI;

  @ApiModelProperty(value = "用户名", required = true)
  public String userName;

  @ApiModelProperty(value = "用户手机号", required = true)
  public String mobile;

  @ApiModelProperty(value = "跟进记录", required = true)
  public String followRecord;

  @ApiModelProperty(value = "最后登录时间时间", required = true)
  public String registerDate;
}
