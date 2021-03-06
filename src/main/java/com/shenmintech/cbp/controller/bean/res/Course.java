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
public class Course {

  @ApiModelProperty(value = "课程ID", required = true)
  public String courseId;

  @ApiModelProperty(value = "课程名", required = true)
  public String courseName;

  @ApiModelProperty(value = "三级小组列表", required = true)
  public List<Group> groups;

  @ApiModelProperty(value = "", required = true)
  public List<Clazz> clazzes;

}
