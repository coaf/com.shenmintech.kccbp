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
public class Req4PutCourseTableBean extends BaseReqBean {

  @ApiModelProperty(value = "班级id", required = true)
  public String id;

  @ApiModelProperty(value = "类型id", required = true)
  public String courseTypeFid;

  @ApiModelProperty(value = "课列表", required = true)
  public List<ClazzObj> clazzList;

  @ApiModelProperty(value = "备注", required = true)
  public String remark;

}
