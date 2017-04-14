package com.shenmintech.cbp.controller.bean.req;

import java.util.List;

import com.shenmintech.base.bean.BaseReqBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Req4PostPushHomeworkBean extends BaseReqBean {

  @ApiModelProperty(value = "教师的ID", required = true)
  public String teacherId;

  @ApiModelProperty(value = "课后作业的ID", required = true)
  public String homeworkId;

  @ApiModelProperty(value = "公司ID", required = true)
  public String companyId;

  @ApiModelProperty(value = "班级的ID", required = true)
  public String courseId;

  @ApiModelProperty(value = "小组的ID列表,groupIds不传则表示所有小组都推", required = true)
  public List<String> groupIds;

  @ApiModelProperty(value = "课的ID", required = true)
  public String clazzId;

  @ApiModelProperty(value = "推送策略:0即时推送，1课前推送，2课后推送", required = true)
  public String pushFlag;

  @ApiModelProperty(value = "备注", required = true)
  public String remark;

}
