package com.shenmintech.cbp.biz;

import com.shenmintech.cbp.controller.bean.req.Req4GetCourseBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetCourseTableBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostCourseBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutCourseTableBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetCourseBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetCourseTableBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetCourseTypeAndCompanyBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostCourseBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutCourseTableBean;

public interface ICourseBiz {

  public Res4PostCourseBean addCourse(Req4PostCourseBean req4PostCourseBean);

  public Res4GetCourseBean selectCourseById(Req4GetCourseBean req4GetCourseBean);

  public Res4GetCourseTypeAndCompanyBean selectCourseTypeAndCompanies();

  public Res4PutCourseTableBean updateCourseTableById(
      Req4PutCourseTableBean req4PutCourseTableBean);

  public Res4GetCourseTableBean selectByCourseId(Req4GetCourseTableBean req4GetCourseTableBean);

}