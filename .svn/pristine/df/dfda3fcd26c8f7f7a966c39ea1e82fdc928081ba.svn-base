package com.shenmintech.cbp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.shenmintech.cbp.entity.TKcStudent;
import com.shenmintech.cbp.entity.TKcStudentExample;

public interface TKcStudentMapper {
  int countByExample(TKcStudentExample example);

  int deleteByExample(TKcStudentExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcStudent record);

  int insertSelective(TKcStudent record);

  List<TKcStudent> selectByExample(TKcStudentExample example);

  TKcStudent selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcStudent record,
      @Param("example") TKcStudentExample example);

  int updateByExample(@Param("record") TKcStudent record,
      @Param("example") TKcStudentExample example);

  int updateByPrimaryKeySelective(TKcStudent record);

  int updateByPrimaryKey(TKcStudent record);

  @Select("SELECT c.id AS courseId, c.course_name AS courseName, ct.id AS courseTypeId, ct.type_name AS courseTypeName "
      + "FROM t_kc_student s " + "INNER JOIN t_kc_group g ON s.group_fid = g.id "
      + "INNER JOIN t_kc_course c ON g.course_fid = c.id "
      + "INNER JOIN t_kc_course_type ct ON c.course_type_fid = ct.id "
      + "WHERE s.id = #{studentId}")
  Map<String, String> selectCourseDetailByStudentId(@Param("studentId") String studentId);

}
