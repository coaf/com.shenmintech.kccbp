package com.shenmintech.cbp.service;

import java.util.List;

import com.shenmintech.cbp.biz.vo.res.Res4AppGetClazzVo;

public interface ICourse4AppService {

  public List<Res4AppGetClazzVo> selectByStudentIds(List<String> ids);

}
