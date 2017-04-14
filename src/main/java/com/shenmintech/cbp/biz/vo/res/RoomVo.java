package com.shenmintech.cbp.biz.vo.res;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomVo {

	public String relaId;
	
	public Date preStartTime;
	
	public String period;
	
	public String courseName;
	
	public String groupName;
	
	public String clazzName;
	
	public String roomId;
	
	public String pushUrl;
}
