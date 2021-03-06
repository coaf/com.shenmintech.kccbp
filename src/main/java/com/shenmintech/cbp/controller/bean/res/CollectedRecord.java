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
public class CollectedRecord {

  @ApiModelProperty(value = "录播视频ID", required = true)
  public String recordId;

  @ApiModelProperty(value = "录播视频名字", required = true)
  public String recordName;

  @ApiModelProperty(value = "配图", required = true)
  public String coverPictureId;

  @ApiModelProperty(value = "配图地址", required = true)
  public String coverPictureURL;

  @ApiModelProperty(value = "视频流文件Id", required = true)
  public String fileId;

  @ApiModelProperty(value = "视频地址", required = true)
  public String fileURL;

  @ApiModelProperty(value = "播放时长mm:ss", required = true)
  public String duration;

  @ApiModelProperty(value = "播放量", required = true)
  public String playAmount;

}
