package com.shenmintech.cbp.mapper;

import com.shenmintech.cbp.entity.TKcCourseTableGroupRelation;
import com.shenmintech.cbp.entity.TKcCourseTableGroupRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TKcCourseTableGroupRelationMapper {
  int countByExample(TKcCourseTableGroupRelationExample example);

  int deleteByExample(TKcCourseTableGroupRelationExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcCourseTableGroupRelation record);

  int insertSelective(TKcCourseTableGroupRelation record);

  List<TKcCourseTableGroupRelation> selectByExample(TKcCourseTableGroupRelationExample example);

  TKcCourseTableGroupRelation selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcCourseTableGroupRelation record,
      @Param("example") TKcCourseTableGroupRelationExample example);

  int updateByExample(@Param("record") TKcCourseTableGroupRelation record,
      @Param("example") TKcCourseTableGroupRelationExample example);

  int updateByPrimaryKeySelective(TKcCourseTableGroupRelation record);

  int updateByPrimaryKey(TKcCourseTableGroupRelation record);

  void insertList(List<TKcCourseTableGroupRelation> list);
}
