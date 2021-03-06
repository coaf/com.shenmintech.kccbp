package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

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
public class Son4AppGetHomeworkStudentRelationBean {

  @ApiModelProperty(value = "课程的ID", required = true)
  public String courseId;

  @ApiModelProperty(value = "课程的名字", required = true)
  public String courseName;

  @ApiModelProperty(value = "课程的类型", required = true)
  public String courseTypeId;

  @ApiModelProperty(value = "课程类型描述：1血糖/2减肥减脂/3塑身/4高血压", required = true)
  public String courseTypeName;

  @ApiModelProperty(value = "当前课程的任务列表", required = true)
  public List<Grand4AppGetHomeworkStudentRelationBean> list;

}
