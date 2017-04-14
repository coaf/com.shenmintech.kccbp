package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Company {

  @ApiModelProperty(value = "公司ID", required = true)
  public String companyId;

  @ApiModelProperty(value = "公司名", required = true)
  public String companyName;

  @ApiModelProperty(value = "二级课程列表", required = true)
  public List<Course> courses;

}
