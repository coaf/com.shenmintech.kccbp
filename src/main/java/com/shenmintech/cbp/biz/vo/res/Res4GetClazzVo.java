package com.shenmintech.cbp.biz.vo.res;

import java.util.Date;

import lombok.Data;

@Data
public class Res4GetClazzVo {
	public String courseTableGroupRelationId;
	public Date startTime;
	public Date endTime;
	public String clazzName;
	public int clazzNo;
}
