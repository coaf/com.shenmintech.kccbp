package com.shenmintech.cbp.mapper;

import com.shenmintech.cbp.entity.TKcTeacher;
import com.shenmintech.cbp.entity.TKcTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TKcTeacherMapper {
  int countByExample(TKcTeacherExample example);

  int deleteByExample(TKcTeacherExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcTeacher record);

  int insertSelective(TKcTeacher record);

  List<TKcTeacher> selectByExample(TKcTeacherExample example);

  TKcTeacher selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcTeacher record,
      @Param("example") TKcTeacherExample example);

  int updateByExample(@Param("record") TKcTeacher record,
      @Param("example") TKcTeacherExample example);

  int updateByPrimaryKeySelective(TKcTeacher record);

  int updateByPrimaryKey(TKcTeacher record);
}
