package com.shenmintech.cbp.service;

import java.util.List;

import com.shenmintech.cbp.biz.vo.ques.Req4PostClazzVo;
import com.shenmintech.cbp.biz.vo.res.ClazzVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetClazzVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetRoomVo;
import com.shenmintech.cbp.service.model.RelationModel;

public interface IClazzService {

  public List<Res4GetClazzVo> selectByGroupId(String groupId);

  public List<ClazzVo> setClazzTime(Req4PostClazzVo clazzVo);

  public void setRoomData(String clazzId, String roomId, String rtmpPullUrl, String httpPullUrl,
      String pushUrl);

  public Res4GetRoomVo selectRoomsByTeacherId(String teacherId);

  public RelationModel chooseNoClazz(String relationId, int offset);// 入参为上课时间的实例ID:relationId，偏移量offset，0为当前，-1为上一节课，1为下一节课
}