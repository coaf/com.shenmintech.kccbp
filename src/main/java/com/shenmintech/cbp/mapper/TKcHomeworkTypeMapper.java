package com.shenmintech.cbp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shenmintech.cbp.entity.TKcHomeworkType;
import com.shenmintech.cbp.entity.TKcHomeworkTypeExample;

public interface TKcHomeworkTypeMapper {
  int countByExample(TKcHomeworkTypeExample example);

  int deleteByExample(TKcHomeworkTypeExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcHomeworkType record);

  int insertSelective(TKcHomeworkType record);

  List<TKcHomeworkType> selectByExample(TKcHomeworkTypeExample example);

  TKcHomeworkType selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcHomeworkType record,
      @Param("example") TKcHomeworkTypeExample example);

  int updateByExample(@Param("record") TKcHomeworkType record,
      @Param("example") TKcHomeworkTypeExample example);

  int updateByPrimaryKeySelective(TKcHomeworkType record);

  int updateByPrimaryKey(TKcHomeworkType record);
}
