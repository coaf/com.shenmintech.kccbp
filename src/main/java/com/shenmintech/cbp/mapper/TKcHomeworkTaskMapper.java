package com.shenmintech.cbp.mapper;

import com.shenmintech.cbp.entity.TKcHomeworkTask;
import com.shenmintech.cbp.entity.TKcHomeworkTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TKcHomeworkTaskMapper {
  int countByExample(TKcHomeworkTaskExample example);

  int deleteByExample(TKcHomeworkTaskExample example);

  int deleteByPrimaryKey(String id);

  int insert(TKcHomeworkTask record);

  int insertSelective(TKcHomeworkTask record);

  List<TKcHomeworkTask> selectByExample(TKcHomeworkTaskExample example);

  TKcHomeworkTask selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") TKcHomeworkTask record,
      @Param("example") TKcHomeworkTaskExample example);

  int updateByExample(@Param("record") TKcHomeworkTask record,
      @Param("example") TKcHomeworkTaskExample example);

  int updateByPrimaryKeySelective(TKcHomeworkTask record);

  int updateByPrimaryKey(TKcHomeworkTask record);
}
