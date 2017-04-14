package com.shenmintech.cbp.controller.bean.req;

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
public class Req4GetPushHomeworksBean extends BaseReqBean {

  @ApiModelProperty(value = "教师ID", required = true, example = "1a794bfc-b7b2-46d9-a9a6-6779269b")
  public String teacherId;

}
