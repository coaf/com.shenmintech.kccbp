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
public class Req4PutRecordBean extends BaseReqBean {

  @ApiModelProperty(value = "录播视频ID", required = true)
  public String recordId;

  @ApiModelProperty(value = "录播视频名", required = true)
  public String recordName;

  @ApiModelProperty(value = "录播视频类型ID", required = true)
  public String recordTypeId;

  @ApiModelProperty(value = "观看权限", required = true)
  public String viewPermission;

  @ApiModelProperty(value = "标签1", required = false)
  public String title1;

  @ApiModelProperty(value = "标签2", required = false)
  public String title2;

  @ApiModelProperty(value = "标签3", required = false)
  public String title3;

  @ApiModelProperty(value = "封面图", required = true)
  public String coverPictureId;

  @ApiModelProperty(value = "流文件Id", required = true)
  public String fileId;

  @ApiModelProperty(value = "分钟数", required = true)
  public String minutes;

  @ApiModelProperty(value = "秒钟数", required = true)
  public String seconds;

  @ApiModelProperty(value = "视频大小", required = true)
  public String recordSize;

  @ApiModelProperty(value = "是否隐藏标识：0否（不隐藏），1是（隐藏）", required = true)
  public String hideFlag;

  @ApiModelProperty(value = "视频简介", required = true)
  public String recordSynopsis;

}
