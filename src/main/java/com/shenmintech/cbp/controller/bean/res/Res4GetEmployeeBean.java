package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("获取员工列表出参，包含小组信息")
public class Res4GetEmployeeBean extends BaseRetBean {

  @ApiModelProperty(value = "小组列表", required = true)
  List<Son4GetGroup1Bean> groupList;

  @ApiModelProperty(value = "员工列表（包含员工所属小组信息，员工手机信息，等各类数据）", required = true)
  List<Son4GetEmployeeBean> employeeList;

}
