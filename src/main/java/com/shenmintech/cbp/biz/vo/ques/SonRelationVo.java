package com.shenmintech.cbp.biz.vo.ques;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SonRelationVo {
	
	public String clazzId;
	
	public Date startTime;
	
	public Date endTime;
}
