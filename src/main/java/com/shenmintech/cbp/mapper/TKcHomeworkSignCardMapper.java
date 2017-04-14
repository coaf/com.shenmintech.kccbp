package com.shenmintech.cbp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shenmintech.cbp.entity.TKcHomeworkSignCard;
import com.shenmintech.cbp.entity.TKcHomeworkSignCardExample;

public interface TKcHomeworkSignCardMapper {
  int countByExample(TKcHomeworkSignCardExample example);

  int deleteByExample(TKcHomeworkSignCardExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcHomeworkSignCard record);

  int insertSelective(TKcHomeworkSignCard record);

  List<TKcHomeworkSignCard> selectByExample(TKcHomeworkSignCardExample example);

  TKcHomeworkSignCard selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcHomeworkSignCard record,
      @Param("example") TKcHomeworkSignCardExample example);

  int updateByExample(@Param("record") TKcHomeworkSignCard record,
      @Param("example") TKcHomeworkSignCardExample example);

  int updateByPrimaryKeySelective(TKcHomeworkSignCard record);

  int updateByPrimaryKey(TKcHomeworkSignCard record);

  void insertList(List<TKcHomeworkSignCard> list);
}
