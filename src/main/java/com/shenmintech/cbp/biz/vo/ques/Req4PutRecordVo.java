package com.shenmintech.cbp.biz.vo.ques;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Req4PutRecordVo {

	public String recordId;
	public String recordName;
	public String recordTypeId;
	public String viewPermission;
	public String title1;
	public String title2;
	public String title3;
	public String coverPictureId;
	public String fileId;
	public int duration;
	public double recordSizeDb;
	public String hideFlag;
	public String recordSynopsis;
}
