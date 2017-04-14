package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel("获取小组课时表出参")
@Getter
@Setter
public class Res4GetTeachClazzBean extends BaseRetBean {

  @ApiModelProperty(value = "课堂列表", required = true)
  List<Son4GetTeachClazzBean> teachClazzList;

}
