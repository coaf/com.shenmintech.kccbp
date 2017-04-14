package com.shenmintech.cbp.biz.vo.ques;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Req4PutComVo {
	
	public String id;
	
	public String companyName;
	
	public int estimatedStudentsNum;
}
