package com.shenmintech.cbp.biz;

import com.shenmintech.cbp.controller.bean.req.Req4DeleteRecordBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetRecordsBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetUCRBean;
import com.shenmintech.cbp.controller.bean.req.Req4PatchIndexBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostRecordBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutRecordBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutRecordStatusBean;
import com.shenmintech.cbp.controller.bean.req.ReqRecord4AppBean;
import com.shenmintech.cbp.controller.bean.req.ReqRecords4AppBean;
import com.shenmintech.cbp.controller.bean.req.ReqRecordsByType4AppBean;
import com.shenmintech.cbp.controller.bean.res.Res4DeleteRecordBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetRecordsBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetUCRBean;
import com.shenmintech.cbp.controller.bean.res.Res4PatchIndexBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostRecordBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutRecordBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutRecordStatusBean;
import com.shenmintech.cbp.controller.bean.res.ResRecord4AppBean;
import com.shenmintech.cbp.controller.bean.res.ResRecords4AppBean;
import com.shenmintech.cbp.controller.bean.res.ResRecordsByType4AppBean;

public interface IRecordBiz {

  public Res4GetRecordsBean getRecords(Req4GetRecordsBean req4GetRecordsBean);

  public Res4DeleteRecordBean deleteRecord(Req4DeleteRecordBean req4DeleteRecordBean);

  public Res4PostRecordBean postRecord(Req4PostRecordBean req4PostRecordBean);

  public Res4PutRecordBean putRecord(Req4PutRecordBean req4PutRecordBean);

  public Res4PatchIndexBean patchIndex(Req4PatchIndexBean req4PatchIndexBean);

  public Res4PutRecordStatusBean putRecordStatus(Req4PutRecordStatusBean req4PutRecordStatusBean);

  public ResRecords4AppBean getRecords4App(ReqRecords4AppBean req4Records4AppBean);

  public ResRecordsByType4AppBean getRecordsByType4App(
      ReqRecordsByType4AppBean reqRecordsByType4AppBean);

  public ResRecord4AppBean getRecord4App(ReqRecord4AppBean req4Records4AppBean);

  public Res4GetUCRBean getUCR(Req4GetUCRBean req4GetUCRBean);

}
