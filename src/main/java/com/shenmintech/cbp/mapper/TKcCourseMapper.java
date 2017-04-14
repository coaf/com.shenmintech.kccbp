package com.shenmintech.cbp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shenmintech.cbp.entity.TKcCourse;
import com.shenmintech.cbp.entity.TKcCourseExample;

public interface TKcCourseMapper {
  int countByExample(TKcCourseExample example);

  int deleteByExample(TKcCourseExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcCourse record);

  int insertSelective(TKcCourse record);

  List<TKcCourse> selectByExample(TKcCourseExample example);

  TKcCourse selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcCourse record,
      @Param("example") TKcCourseExample example);

  int updateByExample(@Param("record") TKcCourse record,
      @Param("example") TKcCourseExample example);

  int updateByPrimaryKeySelective(TKcCourse record);

  int updateByPrimaryKey(TKcCourse record);
}
