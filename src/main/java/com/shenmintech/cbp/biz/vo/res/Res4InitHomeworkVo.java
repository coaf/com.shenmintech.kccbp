package com.shenmintech.cbp.biz.vo.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Res4InitHomeworkVo {
	public int code;
	public boolean msg;
	public String data;
}
