package com.shenmintech.cbp.service;

import com.shenmintech.cbp.biz.vo.res.NtesDataVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetEmployeeVo;
import com.shenmintech.cbp.service.model.EmpAndNtesModel;

public interface IEmpolyeeService {

  public EmpAndNtesModel addEmpolyee(String userId, String companyId, String realName,
      String employeeNo);

  public Res4GetEmployeeVo selectByCompanyId(int pageNo, int rowsPerPage, String courseId,
      String keywords, String groupId);

  public String selectByUserId(String userId);

  public int countByCompanyId(String companyId);

  public NtesDataVo selectNtesdataByUserId(String userId);
}
