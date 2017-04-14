package com.shenmintech.cbp.mapper;

import com.shenmintech.cbp.entity.TKcPubCourse;
import com.shenmintech.cbp.entity.TKcPubCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TKcPubCourseMapper {
  int countByExample(TKcPubCourseExample example);

  int deleteByExample(TKcPubCourseExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcPubCourse record);

  int insertSelective(TKcPubCourse record);

  List<TKcPubCourse> selectByExample(TKcPubCourseExample example);

  TKcPubCourse selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcPubCourse record,
      @Param("example") TKcPubCourseExample example);

  int updateByExample(@Param("record") TKcPubCourse record,
      @Param("example") TKcPubCourseExample example);

  int updateByPrimaryKeySelective(TKcPubCourse record);

  int updateByPrimaryKey(TKcPubCourse record);
}
