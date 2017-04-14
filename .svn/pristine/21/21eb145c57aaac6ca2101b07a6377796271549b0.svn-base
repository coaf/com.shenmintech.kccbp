package com.shenmintech.cbp.biz;

import com.shenmintech.cbp.controller.bean.req.Req4AppGetCourseBean;
import com.shenmintech.cbp.controller.bean.req.Req4AppGetHomeworkPicTxtBean;
import com.shenmintech.cbp.controller.bean.req.Req4AppGetHomeworkSignCardBean;
import com.shenmintech.cbp.controller.bean.req.Req4AppGetHomeworkStudentRelationBean;
import com.shenmintech.cbp.controller.bean.req.Req4AppGetHomeworkWorkCardBean;
import com.shenmintech.cbp.controller.bean.req.Req4AppGetUserInfoBean;
import com.shenmintech.cbp.controller.bean.req.Req4AppPostHomeworkPicTxtBean;
import com.shenmintech.cbp.controller.bean.req.Req4AppPostHomeworkSignCardBean;
import com.shenmintech.cbp.controller.bean.req.Req4AppPostHomeworkWorkCardBean;
import com.shenmintech.cbp.controller.bean.res.Res4AppGetCourseBean;
import com.shenmintech.cbp.controller.bean.res.Res4AppGetHomeworkPicTxtBean;
import com.shenmintech.cbp.controller.bean.res.Res4AppGetHomeworkSignCardBean;
import com.shenmintech.cbp.controller.bean.res.Res4AppGetHomeworkStudentRelationBean;
import com.shenmintech.cbp.controller.bean.res.Res4AppGetHomeworkWorkCardBean;
import com.shenmintech.cbp.controller.bean.res.Res4AppGetUserInfoBean;
import com.shenmintech.cbp.controller.bean.res.Res4AppPostHomeworkPicTxtBean;
import com.shenmintech.cbp.controller.bean.res.Res4AppPostHomeworkSignCardBean;
import com.shenmintech.cbp.controller.bean.res.Res4AppPostHomeworkWorkCardBean;

public interface ICourse4AppBiz {

  public Res4AppGetCourseBean selectByUserId(Req4AppGetCourseBean req4AppGetCourseBean);

  public Res4AppGetHomeworkStudentRelationBean selectHomeworkStudentRelationByUserId(
      Req4AppGetHomeworkStudentRelationBean req4AppGetHomeworkStudentRelationBean);

  public Res4AppGetHomeworkPicTxtBean selectHomeworkPicTxtByRelationId(
      Req4AppGetHomeworkPicTxtBean req4AppGetHomeworkPicTxtBean);

  public Res4AppGetHomeworkSignCardBean selectHomeworkSignCardByRelationId(
      Req4AppGetHomeworkSignCardBean req4AppGetHomeworkPicTxtBean);

  public Res4AppGetHomeworkWorkCardBean selectHomeworkWorkCardByRelationId(
      Req4AppGetHomeworkWorkCardBean req4AppGetHomeworkPicTxtBean);

  public Res4AppPostHomeworkPicTxtBean addHomeworkPicTxt(
      Req4AppPostHomeworkPicTxtBean req4AppPostHomeworkPicTxtBean);

  public Res4AppPostHomeworkSignCardBean addHomeworkSignCard(
      Req4AppPostHomeworkSignCardBean req4AppPostHomeworkSignCardBean);

  public Res4AppPostHomeworkWorkCardBean addHomeworkWorkCard(
      Req4AppPostHomeworkWorkCardBean req4AppPostHomeworkWorkCardBean);

  public Res4AppGetUserInfoBean getUserInfo(Req4AppGetUserInfoBean req4AppGetUserInfoBean);

}
