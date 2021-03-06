package com.shenmintech.cbp.biz.vo.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseVo {

	public String courseId;
	
	public String courseName;
	
	public String courseTypeId;
	
	public String courseTypeName;
	
}
