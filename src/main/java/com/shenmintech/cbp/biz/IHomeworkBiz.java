package com.shenmintech.cbp.biz;

import com.shenmintech.cbp.controller.bean.req.Req4DelHomeworkBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetHomeworkBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostHomeworkBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4DelHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetHomeworkTypeBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostHomeworkBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutHomeworkBean;

public interface IHomeworkBiz {

  public Res4GetHomeworkTypeBean selectTKcHomeworkType();

  public Res4PostHomeworkBean addTKcHomework(Req4PostHomeworkBean req4PostHomeworkBean);

  public Res4GetHomeworkBean selectTKcHomeworkByTeacherId(Req4GetHomeworkBean req4GetHomeworkBean);

  public Res4DelHomeworkBean delTKcHomework(Req4DelHomeworkBean req4DelHomeworkBean);

  public Res4PutHomeworkBean updateTKcHomework(Req4PutHomeworkBean req4PutHomeworkBean);
}
