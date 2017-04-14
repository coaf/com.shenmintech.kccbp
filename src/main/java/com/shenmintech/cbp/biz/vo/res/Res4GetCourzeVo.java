package com.shenmintech.cbp.biz.vo.res;

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
public class Res4GetCourzeVo {
	
	private String Id;

    private String courseTypeId;
    
    private String courseName;
    
    private String remark;
    
}
