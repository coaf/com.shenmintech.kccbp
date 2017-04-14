package com.shenmintech.cbp.service;

import com.shenmintech.cbp.biz.vo.ques.Req4PostRollingPicVo;
import com.shenmintech.cbp.biz.vo.ques.Req4PutRollingPicVo;
import com.shenmintech.cbp.service.model.PubCourseModel;

public interface IRollingPictureService {

  public void addRollingPic(Req4PostRollingPicVo rollingPicVo);

  public void updateRollingPic(Req4PutRollingPicVo rollingPicVo);

  public void updateOrInsertRollingPlacehd(int hisIndex, String rollingPicId);// 占位表更新插入：将id为rollingPicId的轮播图占用占位排序表中的第hisIndex坑，支持坑位移除（hisIndex=0）

  public void updateOrInsertPubCourse(PubCourseModel pubCourseModel);

}
