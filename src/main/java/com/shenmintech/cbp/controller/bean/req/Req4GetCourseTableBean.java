package com.shenmintech.cbp.controller.bean.req;

import com.shenmintech.base.bean.BaseReqBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel
public class Req4GetCourseTableBean extends BaseReqBean {

  @ApiModelProperty(value = "课程ID", required = true, example = "aa38c642-29f2-4eef-9811-f67ca491")
  public String courseId;

}
