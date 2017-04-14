package com.shenmintech.cbp.biz.vo.ques;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Req4PostClazzVo {

	public List<SonRelationVo> relations; 
}
