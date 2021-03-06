package com.shenmintech.cbp.biz.vo.res;

import java.util.Date;

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
public class Sons4GetCourseVo {
	
	private String Id;

    private String courseName;
    
    private String companyFid;
    
    private Date createTime;
    
    private String teacherFid;
    
    private int status;
    
}