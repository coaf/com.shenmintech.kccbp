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
public class Req4PostTeachClazzBean extends BaseReqBean {

  @ApiModelProperty(value = "时间表", required = true)
  public List<SonRelationBean> relations;

}
