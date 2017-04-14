package com.shenmintech.cbp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.shenmintech.cbp.entity.TKcGroup;
import com.shenmintech.cbp.entity.TKcGroupExample;

public interface TKcGroupMapper {
  int countByExample(TKcGroupExample example);

  int deleteByExample(TKcGroupExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcGroup record);

  int insertSelective(TKcGroup record);

  List<TKcGroup> selectByExample(TKcGroupExample example);

  TKcGroup selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcGroup record,
      @Param("example") TKcGroupExample example);

  int updateByExample(@Param("record") TKcGroup record, @Param("example") TKcGroupExample example);

  int updateByPrimaryKeySelective(TKcGroup record);

  int updateByPrimaryKey(TKcGroup record);
}
