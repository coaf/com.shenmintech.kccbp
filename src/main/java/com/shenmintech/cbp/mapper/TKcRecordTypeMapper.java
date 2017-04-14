package com.shenmintech.cbp.mapper;

import com.shenmintech.cbp.entity.TKcRecordType;
import com.shenmintech.cbp.entity.TKcRecordTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TKcRecordTypeMapper {
  int countByExample(TKcRecordTypeExample example);

  int deleteByExample(TKcRecordTypeExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcRecordType record);

  int insertSelective(TKcRecordType record);

  List<TKcRecordType> selectByExample(TKcRecordTypeExample example);

  TKcRecordType selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcRecordType record,
      @Param("example") TKcRecordTypeExample example);

  int updateByExample(@Param("record") TKcRecordType record,
      @Param("example") TKcRecordTypeExample example);

  int updateByPrimaryKeySelective(TKcRecordType record);

  int updateByPrimaryKey(TKcRecordType record);
}
