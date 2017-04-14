package com.shenmintech.cbp.biz;

import com.shenmintech.cbp.controller.bean.req.Req4DelStudentBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetHomeworkStudentRelationBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetUserInfoBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetUserRelationIds;
import com.shenmintech.cbp.controller.bean.req.Req4PostStudentBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutStudentBean;
import com.shenmintech.cbp.controller.bean.res.Res4DelStudentBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetHomeworkStudentRelationBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetUserInfoBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetUserRelationIds;
import com.shenmintech.cbp.controller.bean.res.Res4PostStudentBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutStudentBean;

public interface IStudentBiz {

  public Res4PostStudentBean addStudent(Req4PostStudentBean req4PostStudentBean);

  public Res4DelStudentBean deleteById(Req4DelStudentBean req4DelStudentBean);

  public Res4PutStudentBean updateById(Req4PutStudentBean req4PutStudentBean);

  public Res4GetHomeworkStudentRelationBean selectByTaskId(
      Req4GetHomeworkStudentRelationBean req4GetHomeworkStudentRelationBean);

  public Res4GetUserRelationIds selectRelationsByUserId(
      Req4GetUserRelationIds req4GetUserRelationIds);

  public Res4GetUserInfoBean selectUserInfo(Req4GetUserInfoBean req4GetUserInfo);
}
