package com.shenmintech.cbp.controller.bean.req;

import com.shenmintech.base.bean.BaseReqBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel
public class Req4GetHomeworkStudentRelationBean extends BaseReqBean {

  @ApiModelProperty(value = "推送任务的ID", required = true, example = "832170199418540032")
  public String taskId;

}
