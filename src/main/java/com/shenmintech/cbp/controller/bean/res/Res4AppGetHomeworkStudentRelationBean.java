package com.shenmintech.cbp.controller.bean.res;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("用户获取任务列表出参")
public class Res4AppGetHomeworkStudentRelationBean extends BaseRetBean {

  @ApiModelProperty(value = "所有课程列表", required = true)
  public List<Son4AppGetHomeworkStudentRelationBean> list;

  @ApiModelProperty(value = "最近要上的课", required = true)
  public Son4AppGetCourseBean clazz;

  @ApiModelProperty(value = "是否要显示精选文章的标志位:false不显示精选文章，true显示精选文章", required = true)
  public boolean flag;

}
