package com.shenmintech.cbp.service;

import java.util.List;

import com.shenmintech.cbp.biz.vo.ques.Req4PostCourseVo;
import com.shenmintech.cbp.biz.vo.res.CompanyVo;
import com.shenmintech.cbp.biz.vo.res.CourseVo;
import com.shenmintech.cbp.biz.vo.res.Res4CourseTypeVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetCourseTableVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetCourseVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetCourzeVo;
import com.shenmintech.cbp.controller.bean.req.ClazzObj;

public interface ICourseService {

  public List<Res4CourseTypeVo> selectCourseType();

  public int countByCompanyId(String companyId);

  public void add(List<Req4PostCourseVo> list);

  public Res4GetCourseVo selectByTeacherIdPages(String teacherId, int pageNo, int rowsPerPage);

  public Res4GetCourzeVo selectByCourseId(String id);

  public void updateCourseTableById(String courseId, String courseTypeId, String remark,
      List<ClazzObj> clazzList);

  public List<Res4GetCourseTableVo> selectCourseTableByCourseId(String courseId);

  public List<CourseVo> selectCourseByTeacherIdAndCompanyId(String teacherId, String companyId);

  public CourseVo selectCourseByStudentId(String studentId);

  public String selectCourseTypeNameById(String id);

  public CompanyVo selectCompanyBelongByCourseId(String courseId);
}
