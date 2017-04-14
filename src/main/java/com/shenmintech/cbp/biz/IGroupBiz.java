package com.shenmintech.cbp.biz;

import com.shenmintech.cbp.controller.bean.req.Req4GetGroupBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostGroupBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutGroupBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetGroupBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostGroupBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutGroupBean;

public interface IGroupBiz {

  public Res4PostGroupBean addGroup(Req4PostGroupBean req4PostGroupBean);

  public Res4PutGroupBean updateByGroupId(Req4PutGroupBean req4PutGroupBean);

  public Res4GetGroupBean selectByCourseId(Req4GetGroupBean req4GetGroupBean);

}
