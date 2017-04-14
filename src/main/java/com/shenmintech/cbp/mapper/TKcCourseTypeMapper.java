package com.shenmintech.cbp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shenmintech.cbp.entity.TKcCourseType;
import com.shenmintech.cbp.entity.TKcCourseTypeExample;

public interface TKcCourseTypeMapper {
  int countByExample(TKcCourseTypeExample example);

  int deleteByExample(TKcCourseTypeExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcCourseType record);

  int insertSelective(TKcCourseType record);

  List<TKcCourseType> selectByExample(TKcCourseTypeExample example);

  TKcCourseType selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcCourseType record,
      @Param("example") TKcCourseTypeExample example);

  int updateByExample(@Param("record") TKcCourseType record,
      @Param("example") TKcCourseTypeExample example);

  int updateByPrimaryKeySelective(TKcCourseType record);

  int updateByPrimaryKey(TKcCourseType record);
}
