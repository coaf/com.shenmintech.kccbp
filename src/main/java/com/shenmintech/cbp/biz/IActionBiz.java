package com.shenmintech.cbp.biz;

import com.shenmintech.cbp.controller.bean.req.ReqUCACancelBean;
import com.shenmintech.cbp.controller.bean.req.ReqUCRCancelBean;
import com.shenmintech.cbp.controller.bean.req.ReqULRCancelBean;
import com.shenmintech.cbp.controller.bean.req.ReqUserCollectArticleBean;
import com.shenmintech.cbp.controller.bean.req.ReqUserCollectRecordBean;
import com.shenmintech.cbp.controller.bean.req.ReqUserLikeRecordBean;
import com.shenmintech.cbp.controller.bean.req.ReqUserPlayRecordBean;
import com.shenmintech.cbp.controller.bean.req.ReqUserReadArticleBean;
import com.shenmintech.cbp.controller.bean.res.ResUCACancelBean;
import com.shenmintech.cbp.controller.bean.res.ResUCRCancelBean;
import com.shenmintech.cbp.controller.bean.res.ResULRCancelBean;
import com.shenmintech.cbp.controller.bean.res.ResUserCollectArticleBean;
import com.shenmintech.cbp.controller.bean.res.ResUserCollectRecordBean;
import com.shenmintech.cbp.controller.bean.res.ResUserLikeRecordBean;
import com.shenmintech.cbp.controller.bean.res.ResUserPlayRecordBean;
import com.shenmintech.cbp.controller.bean.res.ResUserReadArticleBean;

public interface IActionBiz {

  public ResUserCollectRecordBean postUCR(ReqUserCollectRecordBean reqUserCollectRecordBean);

  public ResUCRCancelBean postUCRCancel(ReqUCRCancelBean reqUCRCancelBean);

  public ResUserPlayRecordBean postUPR(ReqUserPlayRecordBean reqUserPlayRecordBean);

  public ResUserLikeRecordBean postULR(ReqUserLikeRecordBean reqUserLikeRecordBean);

  public ResULRCancelBean postULRCancel(ReqULRCancelBean reqULRCancelBean);

  public ResUserCollectArticleBean postUCA(ReqUserCollectArticleBean reqUserCollectArticleBean);

  public ResUCACancelBean postUCACancel(ReqUCACancelBean reqUCACancelBean);

  public ResUserReadArticleBean postURA(ReqUserReadArticleBean reqUserReadArticleBean);


}
