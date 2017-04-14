package com.shenmintech.cbp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shenmintech.cbp.entity.TKcHomeworkWorkCard;
import com.shenmintech.cbp.entity.TKcHomeworkWorkCardExample;

public interface TKcHomeworkWorkCardMapper {
  int countByExample(TKcHomeworkWorkCardExample example);

  int deleteByExample(TKcHomeworkWorkCardExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcHomeworkWorkCard record);

  int insertSelective(TKcHomeworkWorkCard record);

  List<TKcHomeworkWorkCard> selectByExample(TKcHomeworkWorkCardExample example);

  TKcHomeworkWorkCard selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcHomeworkWorkCard record,
      @Param("example") TKcHomeworkWorkCardExample example);

  int updateByExample(@Param("record") TKcHomeworkWorkCard record,
      @Param("example") TKcHomeworkWorkCardExample example);

  int updateByPrimaryKeySelective(TKcHomeworkWorkCard record);

  int updateByPrimaryKey(TKcHomeworkWorkCard record);

  void insertList(List<TKcHomeworkWorkCard> list);
}
