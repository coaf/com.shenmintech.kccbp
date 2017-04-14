package com.shenmintech.cbp.service;

import java.util.List;

import com.shenmintech.cbp.biz.vo.ques.Req4PostCompanyVo;
import com.shenmintech.cbp.biz.vo.ques.Req4PutComVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetComVo;

public interface ICompanyService {

  public void add(List<Req4PostCompanyVo> list);

  public void update(Req4PutComVo putComVo);

  public Res4GetComVo select(int pageNo, int rowsPerPage);

  public String selectNameById(String companyId);

}
