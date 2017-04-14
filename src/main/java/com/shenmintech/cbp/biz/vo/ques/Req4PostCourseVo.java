package com.shenmintech.cbp.biz.vo.ques;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Req4PostCourseVo {

	public String companyId;
	
	public String courseTypeId;
	
	public String teacherId;

	public String courseName;
	
	
}
