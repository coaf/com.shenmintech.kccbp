package com.shenmintech.cbp.service;

import java.util.List;

import com.shenmintech.cbp.biz.vo.ques.Req4PostGroupVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetGroupVo;

public interface IGroupService {

  public void add(List<Req4PostGroupVo> list);

  public void updateById(String groupId, String groupName);

  public Res4GetGroupVo selectByIdPages(String courseId, int pageNo, int rowsPerPage);

  public int countByGroupId(String groupId);

  public int countByCourseId(String courseId);

  public List<String> getGroupIdsByCourseId(String courseId);

  public String selelctNameById(String id);

}
