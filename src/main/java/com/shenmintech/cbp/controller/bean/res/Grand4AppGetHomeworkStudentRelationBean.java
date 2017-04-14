package com.shenmintech.cbp.controller.bean.res;

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
public class Grand4AppGetHomeworkStudentRelationBean {

  @ApiModelProperty(value = "当前用户任务的唯一ID", required = true)
  public String relationId;

  @ApiModelProperty(value = "当前用户任务的任务名", required = true)
  public String relationName;

  @ApiModelProperty(value = "任务类型ID：1蚊子拍照类/2打卡类/3课后任务卡", required = true)
  public String homeworkTypeId;

  @ApiModelProperty(value = "任务类型名", required = true)
  public String homeworkTypeName;

  @ApiModelProperty(value = "任务状态：0未完成，1已完成", required = true)
  public String statusFlg;

  @ApiModelProperty(value = "当前用户任务的状态", required = true)
  public String statusDesc;

}
