package com.shenmintech.cbp.biz;

import com.shenmintech.cbp.controller.bean.req.Req4GetComBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetSingleComBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostCompanyBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutComBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetComBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetSingleComBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostCompanyBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutComBean;

public interface ICompanyBiz {

  public Res4PostCompanyBean addCompany(Req4PostCompanyBean req4PostCompanyBean);

  public Res4PutComBean updateCompany(Req4PutComBean req4PutComBean);

  public Res4GetComBean selectCompany(Req4GetComBean Req4GetComBean);

  public Res4GetSingleComBean selectCompanyById(Req4GetSingleComBean Req4GetSingleComBean);

}
