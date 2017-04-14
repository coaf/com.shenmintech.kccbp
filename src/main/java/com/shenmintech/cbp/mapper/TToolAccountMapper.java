package com.shenmintech.cbp.mapper;

import com.shenmintech.cbp.entity.TToolAccount;
import com.shenmintech.cbp.entity.TToolAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TToolAccountMapper {
  int countByExample(TToolAccountExample example);

  int deleteByExample(TToolAccountExample example);

  int deleteByPrimaryKey(String id);

  int insert(TToolAccount record);

  int insertSelective(TToolAccount record);

  List<TToolAccount> selectByExample(TToolAccountExample example);

  TToolAccount selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TToolAccount record,
      @Param("example") TToolAccountExample example);

  int updateByExample(@Param("record") TToolAccount record,
      @Param("example") TToolAccountExample example);

  int updateByPrimaryKeySelective(TToolAccount record);

  int updateByPrimaryKey(TToolAccount record);
}
