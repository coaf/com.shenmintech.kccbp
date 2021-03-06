package com.shenmintech.cbp.controller.bean.res;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("用户获取具体卡片任务出参-- 每条明细")
public class Res4AppGetHomeworkWorkCardVoBean {


  @ApiModelProperty(value = "主键id", required = true)
  private String id;

  @ApiModelProperty(value = "选择的目标", required = true)
  private String selections;

  @ApiModelProperty(value = "当前周目标值", required = true)
  private String currentWeekTarget;

  @ApiModelProperty(value = "当前周实际值", required = true)
  private String currentWeekResult;

  @ApiModelProperty(value = "周数", required = true)
  private Integer weekNo;

  @ApiModelProperty(value = "状态", required = true)
  private Integer status;

  @ApiModelProperty(value = "提交时间", required = true)
  private Date commitTime;

  @ApiModelProperty(value = "是否是当前周,1表示本周，0表示上周", required = true)
  private int isCurrentWeek;

  @ApiModelProperty(value = "时间区间", required = true)
  private String dateZoneArea;



}
