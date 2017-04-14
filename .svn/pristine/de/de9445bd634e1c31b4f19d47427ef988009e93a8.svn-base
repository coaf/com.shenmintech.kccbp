package com.shenmintech.cbp.biz;

import com.shenmintech.cbp.biz.vo.res.Res4CleanHomeworkVo;
import com.shenmintech.cbp.biz.vo.res.Res4InitHomeworkVo;
import com.shenmintech.cbp.controller.bean.req.Req4GetPrePushHomeworkBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetPushHomeworksBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostPushHomeworkBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutPushHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetPrePushHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetPushHomeworksBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostPushHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutPushHomeworkBean;

public interface IHomeworkPushBiz {

  public Res4GetPrePushHomeworkBean selectInitElement(
      Req4GetPrePushHomeworkBean req4GetPrePushHomeworkBean);

  public Res4PostPushHomeworkBean postPushHomework(
      Req4PostPushHomeworkBean req4PostPushHomeworkBean);

  public Res4GetPushHomeworksBean getPushHomeworks(
      Req4GetPushHomeworksBean req4GetPushHomeworksBean);

  public Res4PutPushHomeworkBean putPushHomework(Req4PutPushHomeworkBean req4PutPushHomeworkBean);

  public Res4InitHomeworkVo InitHomework(String studentId, String groupId);// 教师后期将学生追加进a小组的时候，重新添加所有a小组的历史任务

  public Res4CleanHomeworkVo cleanHomework(String studentId);// 清除某个学生的所有任务，将任务呀状态全部置为-1

}
