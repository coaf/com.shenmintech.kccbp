package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("推送详情对象")
public class Son4GetPushHomeworksBean {

  @ApiModelProperty(value = "推送任务ID", required = true)
  public String taskId;

  @ApiModelProperty(value = "课后作业ID", required = true)
  public String homeworkId;

  @ApiModelProperty(value = "课后作业名称", required = true)
  public String homeworkName;

  @ApiModelProperty(value = "所属公司ID", required = true)
  public String companyId;

  @ApiModelProperty(value = "推送班级ID", required = true)
  public String courseId;

  @ApiModelProperty(value = "推送班级名", required = true)
  public String courseName;

  @ApiModelProperty(value = "推送小组ID", required = true)
  public String groupIds;

  @ApiModelProperty(value = "推送小组名", required = true)
  public String groupNames;

  @ApiModelProperty(value = "推送关联课程（pushFlg不为0的时候必返回）", required = true)
  public String clazzId;

  @ApiModelProperty(value = "推送标识：0即时推送，1定时推送", required = true)
  public String pushCode;

  @ApiModelProperty(value = "推送描述", required = true)
  public String pushFlg;

  @ApiModelProperty(value = "能否修改标识:0初始状态，可以修改/-1已删除，不可修改/1已推送，不可修改", required = true)
  public String status;

  @ApiModelProperty(value = "备注", required = true)
  public String remark;

}
