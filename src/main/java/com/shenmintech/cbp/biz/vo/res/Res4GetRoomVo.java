package com.shenmintech.cbp.biz.vo.res;

import java.util.List;

import lombok.Data;

@Data
public class Res4GetRoomVo {

	List<RoomVo> roomList;
	
	List<String> timeList;
	
	String teacherToken;
	
	String teacherAccid;
}
