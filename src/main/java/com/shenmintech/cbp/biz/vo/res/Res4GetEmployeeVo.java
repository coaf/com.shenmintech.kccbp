package com.shenmintech.cbp.biz.vo.res;

import java.util.List;

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
public class Res4GetEmployeeVo {
	
	public List<Son4GetEmployeeVo> list;
	
	public int recordCount;
	
}
