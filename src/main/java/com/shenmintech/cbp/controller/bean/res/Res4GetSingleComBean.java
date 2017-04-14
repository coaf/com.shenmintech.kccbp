package com.shenmintech.cbp.controller.bean.res;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("获取公司名字和公司的图标ID")
@Getter
@Setter
public class Res4GetSingleComBean extends BaseRetBean {

  @ApiModelProperty(value = "公司ID", required = true)
  String companyId;

  @ApiModelProperty(value = "公司名字", required = true)
  String companyName;

  @ApiModelProperty(value = "公司图标picId", required = true)
  String comPicId;

}
