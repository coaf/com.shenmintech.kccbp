package com.shenmintech.cbp.controller.bean.res;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RecordModel {

  @ApiModelProperty(value = "录播视频ID", required = true)
  public String recordId;

  @ApiModelProperty(value = "录播视频名字", required = true)
  public String recordName;

  @ApiModelProperty(value = "类型", required = true)
  public String recordType;

  @ApiModelProperty(value = "类型名", required = true)
  public String recordTypeName;

  @ApiModelProperty(value = "观看权限", required = true)
  public String viewPermission;

  @ApiModelProperty(value = "观看权限描述", required = true)
  public String viewPermissionDesc;

  @ApiModelProperty(value = "创建时间", required = true)
  public String createTime;

  @ApiModelProperty(value = "标签", required = true)
  public String titles;

  @ApiModelProperty(value = "配图", required = true)
  public String coverPictureId;

  @ApiModelProperty(value = "配图地址", required = true)
  public String coverPictureURL;

  @ApiModelProperty(value = "流文件Id", required = true)
  public String fileId;

  @ApiModelProperty(value = "时长", required = true)
  public String duration;

  @ApiModelProperty(value = "播放分钟数", required = true)
  public String minutes;

  @ApiModelProperty(value = "播放秒钟数", required = true)
  public String seconds;

  @ApiModelProperty(value = "是否隐藏:0否（不隐藏），1是（隐藏）", required = true)
  public String hideFlag;

  @ApiModelProperty(value = "视频大小", required = true)
  public String recordSize;

  @ApiModelProperty(value = "视频简介", required = true)
  public String recordSynopsis;

  @ApiModelProperty(value = "视频排序索引", required = true)
  public String recordIndex;
}
