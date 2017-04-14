package com.shenmintech.cbp.biz.vo.res;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Res4AppGetClazzVo {
	public Date tIndex;
	public String clazzId;
	public String clazzName;
	public String clazzTypeId;
	public String nickName;
	public String doneFlag;//0未上，1已上
	public String preStartTime;
	public String interval;//还差多久开始
	public String picId;//封面图片ID
	public String ntesHttpPullUrl;
	public String ntesRoomId;
	public String ntesRoomName;
	public String ntesRtmpPullUrl;
}
