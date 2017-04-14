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
public class Son4GetHomeworkVo {
	
	public String homeworkId;
	
	public String homeworkName;
	
	public String homeworkTypeId;
	
	public String describe;
	
	public Date createTime;
	
	public Integer status;
	
}
