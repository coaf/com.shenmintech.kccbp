package com.shenmintech.cbp.service;

import java.util.List;

import com.shenmintech.cbp.biz.vo.res.HomeworkStudentRelationVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetUserRelationsVo;
import com.shenmintech.cbp.biz.vo.res.StudentVo;

public interface IStudentService {

  public String add(String employeeId, String groupId);

  public void deleteById(String id);

  public void updateById(String groupId, String studentId);

  public int countByGroupIds(List<String> groupIds);

  public StudentVo searchByEmployeeIdAndGroupIds(String employeeId, List<String> groupIds);

  public List<String> selectByEmployeeId(String employeeId);

  // public List<String> searchStudentIdsByGroupIds(List<String> groupIds);

  public HomeworkStudentRelationVo selectHomeworkStudentTrlationByTaskId(String taskId, int pageNo,
      int rowsPerPage);

  public void addEmployeeAndStudent(String userId, String companyId, String groupId,
      String userName, String employeeNo);

  public Res4GetUserRelationsVo selectRelationsByUserId(String userId);

}
