package com.shenmintech.cbp.service;

import java.util.List;

import com.shenmintech.cbp.biz.vo.ques.Req4PostPushHomeworkVo;
import com.shenmintech.cbp.biz.vo.res.PushHomeworkVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetPushHomeworksVo;

public interface IHomeworkPushService {

  public void checkAddPushHomework(String homeworkId, String clazzId, List<String> groupIds,
      String pushFlag);

  public void addPushHomework(Req4PostPushHomeworkVo req4PostPushHomeworkVo);

  public Res4GetPushHomeworksVo selectByTeacherIdPages(String teacherId, int pageNo,
      int rowsPerPage);

  public PushHomeworkVo selectById(String id);

  public void updateByIdSelective(PushHomeworkVo vo);

  public void insertRelations(List<String> studentIds, String pushId, String homeworkId,
      String courseId, String clazzId);

  public void initHomework(String studentId, String groupId);

  public void cleanHomework(String studentId);

  public void cleanAndInit(String studentId, String groupId);

}
