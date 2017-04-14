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
public class Req4AppPostHomeworkPicTxtBean extends BaseReqBean {

  @ApiModelProperty(value = "具体任务流水id", required = true)
  public String id;

  @ApiModelProperty(value = "提交的文字", required = true)
  public String content;

  @ApiModelProperty(value = "提交的图片ids", required = true)
  public String picIds;

}
