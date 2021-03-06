package com.shenmintech.cbp.mapper;

import com.shenmintech.cbp.entity.TKcCourseTable;
import com.shenmintech.cbp.entity.TKcCourseTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TKcCourseTableMapper {
  int countByExample(TKcCourseTableExample example);

  int deleteByExample(TKcCourseTableExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcCourseTable record);

  int insertSelective(TKcCourseTable record);

  List<TKcCourseTable> selectByExample(TKcCourseTableExample example);

  TKcCourseTable selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcCourseTable record,
      @Param("example") TKcCourseTableExample example);

  int updateByExample(@Param("record") TKcCourseTable record,
      @Param("example") TKcCourseTableExample example);

  int updateByPrimaryKeySelective(TKcCourseTable record);

  int updateByPrimaryKey(TKcCourseTable record);
}
