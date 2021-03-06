package com.shenmintech.cbp.controller.bean.res;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("用户获取具体图文任务出参")
public class Res4AppGetHomeworkPicTxtBean extends BaseRetBean {

  @ApiModelProperty(value = "主键id", required = true)
  private String id;

  @ApiModelProperty(value = "内容", required = true)
  private String content;

  @ApiModelProperty(value = "图片ids", required = true)
  private String picIds;

  @ApiModelProperty(value = "任务要求", required = true)
  private String taskDesc;

}
