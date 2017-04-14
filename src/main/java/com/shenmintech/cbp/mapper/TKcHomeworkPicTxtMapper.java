package com.shenmintech.cbp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shenmintech.cbp.entity.TKcHomeworkPicTxt;
import com.shenmintech.cbp.entity.TKcHomeworkPicTxtExample;

public interface TKcHomeworkPicTxtMapper {
  int countByExample(TKcHomeworkPicTxtExample example);

  int deleteByExample(TKcHomeworkPicTxtExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcHomeworkPicTxt record);

  int insertSelective(TKcHomeworkPicTxt record);

  List<TKcHomeworkPicTxt> selectByExample(TKcHomeworkPicTxtExample example);

  TKcHomeworkPicTxt selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcHomeworkPicTxt record,
      @Param("example") TKcHomeworkPicTxtExample example);

  int updateByExample(@Param("record") TKcHomeworkPicTxt record,
      @Param("example") TKcHomeworkPicTxtExample example);

  int updateByPrimaryKeySelective(TKcHomeworkPicTxt record);

  int updateByPrimaryKey(TKcHomeworkPicTxt record);

  void insertList(List<TKcHomeworkPicTxt> list);
}
