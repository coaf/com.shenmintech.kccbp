package com.shenmintech.cbp.biz;

import java.util.List;

import com.shenmintech.cbp.biz.vo.res.RollingPicAndIndexVo;
import com.shenmintech.cbp.controller.bean.req.Req4GetRPs4AppBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetRollingPicBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetRollingPicsBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostRollingPicBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutRollingPicBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetRPs4AppBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetRollingPicBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetRollingPicsBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostRollingPicBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutRollingPicBean;

public interface IRollingPictureBiz {

  public Res4PostRollingPicBean postRollingPic(Req4PostRollingPicBean req4PostRollingPicBean);

  public Res4GetRollingPicsBean getRollingPics(Req4GetRollingPicsBean req4GetRollingPicsBean);

  public List<RollingPicAndIndexVo> getShowsRollingPics();

  public Res4GetRollingPicBean getRollingPic(Req4GetRollingPicBean req4GetRollingPicBean);

  public Res4PutRollingPicBean putRollingPic(Req4PutRollingPicBean req4PutRollingPicBean);

  public Res4GetRPs4AppBean getRPs4App(Req4GetRPs4AppBean req4GetRPs4AppBean);

}
