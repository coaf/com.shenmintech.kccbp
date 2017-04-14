package com.shenmintech.cbp.service;

import java.util.List;

import com.shenmintech.cbp.biz.vo.res.HomeWorkTypesVo;
import com.shenmintech.cbp.biz.vo.res.HomeworkVo;
import com.shenmintech.cbp.biz.vo.res.RelationVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetHomeworkTypeVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetHomeworkVo;
import com.shenmintech.cbp.controller.bean.req.Req4AppPostHomeworkSignCardBean;
import com.shenmintech.cbp.controller.bean.req.Req4AppPostHomeworkWorkCardBean;
import com.shenmintech.cbp.entity.TKcHomework;
import com.shenmintech.cbp.entity.TKcHomeworkCardSelection;
import com.shenmintech.cbp.entity.TKcHomeworkPicTxt;
import com.shenmintech.cbp.entity.TKcHomeworkSignCard;
import com.shenmintech.cbp.entity.TKcHomeworkWorkCard;

public interface IHomeWorkService {

  public Res4GetHomeworkTypeVo selectHomeworkType();

  public void add(String teacherId, String workName, String typeId, String describe);

  public Res4GetHomeworkVo selectByTeacherIdPages(String teacherId, int pageNo, int rowsPerPage);

  public void deleteById(String workId);

  public void updateById(String workId, String workName, String typeId, String describe);

  public List<HomeWorkTypesVo> getHomeWorkTypesByIds(List<String> list);

  public List<RelationVo> selectHomeworksByStudentIds(String id);//

  public List<TKcHomeworkPicTxt> selectHomeworkPicTxtByRaleationId(String id);

  public List<TKcHomeworkWorkCard> selecHomeworkWorkCardByRaleationId(String id);

  public List<TKcHomeworkSignCard> selecHomeworkSignCardByRaleationId(String id);

  public void updateTKcHomeworkPicTxt(TKcHomeworkPicTxt bean);

  public void updateTKcHomeworkWorkCard(
      Req4AppPostHomeworkWorkCardBean req4AppPostHomeworkWorkCardBean);

  public void updateTKcHomeworkSignCard(
      Req4AppPostHomeworkSignCardBean req4AppPostHomeworkSignCardBean);

  public String selectNameById(String id);


  public TKcHomework selectHomeWorkByRelationId(String relationId);


  public HomeworkVo selectById(String id);


  public List<TKcHomeworkCardSelection> selectSelection();


}
