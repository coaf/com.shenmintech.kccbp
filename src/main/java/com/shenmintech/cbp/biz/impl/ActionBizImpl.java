package com.shenmintech.cbp.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shenmintech.cbp.biz.IActionBiz;
import com.shenmintech.cbp.config.HttpAction;
import com.shenmintech.cbp.config.HttpErrorMsg;
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
import com.shenmintech.cbp.service.ITToolAccountService;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.StringUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ActionBizImpl implements IActionBiz {

  @Autowired
  HttpErrorMsg httpErrorMsg;

  @Autowired
  HttpAction httpAction;

  @Autowired
  ITToolAccountService iTToolAccountService;

  @Override
  public ResUserCollectRecordBean postUCR(ReqUserCollectRecordBean reqUserCollectRecordBean) {
    ResUserCollectRecordBean resBean = new ResUserCollectRecordBean();
    String userId = reqUserCollectRecordBean.getUserId();
    String recordId = reqUserCollectRecordBean.getRecordId();
    String remark = reqUserCollectRecordBean.getRemark();

    if (StringUtil.checkBlank(userId, recordId)) {
      log.error("userId,recordId不能为空");
      resBean.setError(httpErrorMsg.getPostUCR().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostUCR().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    iTToolAccountService.addAccount(userId, recordId,
        httpAction.getCbpModule().getUserCollectRecord(), remark);
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public ResUCRCancelBean postUCRCancel(ReqUCRCancelBean reqUCRCancelBean) {
    ResUCRCancelBean resBean = new ResUCRCancelBean();
    String userId = reqUCRCancelBean.getUserId();
    String recordId = reqUCRCancelBean.getRecordId();

    if (StringUtil.checkBlank(userId, recordId)) {
      log.error("userId,recordId不能为空");
      resBean.setError(httpErrorMsg.getPostUCR().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostUCR().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    iTToolAccountService.clearAccount(userId, recordId,
        httpAction.getCbpModule().getUserCollectRecord());
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public ResUserPlayRecordBean postUPR(ReqUserPlayRecordBean reqUserPlayRecordBean) {
    ResUserPlayRecordBean resBean = new ResUserPlayRecordBean();
    String userId = reqUserPlayRecordBean.getUserId();
    String recordId = reqUserPlayRecordBean.getRecordId();
    String remark = reqUserPlayRecordBean.getRemark();
    if (StringUtil.checkBlank(userId, recordId)) {
      log.error("userId,recordId不能为空");
      resBean.setError(httpErrorMsg.getPostUPR().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostUPR().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    iTToolAccountService.addAccount(userId, recordId, httpAction.getCbpModule().getUserPlayRecord(),
        remark);
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public ResUserLikeRecordBean postULR(ReqUserLikeRecordBean reqUserLikeRecordBean) {
    ResUserLikeRecordBean resBean = new ResUserLikeRecordBean();
    String userId = reqUserLikeRecordBean.getUserId();
    String recordId = reqUserLikeRecordBean.getRecordId();
    String remark = reqUserLikeRecordBean.getRemark();
    if (StringUtil.checkBlank(userId, recordId)) {
      log.error("userId,recordId不能为空");
      resBean.setError(httpErrorMsg.getPostULR().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostULR().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    iTToolAccountService.addAccount(userId, recordId, httpAction.getCbpModule().getUserLikeRecord(),
        remark);
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public ResULRCancelBean postULRCancel(ReqULRCancelBean reqULRCancelBean) {
    ResULRCancelBean resBean = new ResULRCancelBean();
    String userId = reqULRCancelBean.getUserId();
    String recordId = reqULRCancelBean.getRecordId();

    if (StringUtil.checkBlank(userId, recordId)) {
      log.error("userId,recordId不能为空");
      resBean.setError(httpErrorMsg.getPostULRCancel().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostULRCancel().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    iTToolAccountService.clearAccount(userId, recordId,
        httpAction.getCbpModule().getUserLikeRecord());
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public ResUserCollectArticleBean postUCA(ReqUserCollectArticleBean reqUserCollectArticleBean) {
    ResUserCollectArticleBean resBean = new ResUserCollectArticleBean();
    String userId = reqUserCollectArticleBean.getUserId();
    String articleId = reqUserCollectArticleBean.getArticleId();
    String remark = reqUserCollectArticleBean.getRemark();
    if (StringUtil.checkBlank(userId, articleId)) {
      log.error("userId,articleId不能为空");
      resBean.setError(httpErrorMsg.getPostUCA().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostUCA().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    iTToolAccountService.addAccount(userId, articleId,
        httpAction.getCbpModule().getUserCollectArticle(), remark);
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public ResUCACancelBean postUCACancel(ReqUCACancelBean reqUCACancelBean) {
    ResUCACancelBean resBean = new ResUCACancelBean();
    String userId = reqUCACancelBean.getUserId();
    String articleId = reqUCACancelBean.getArticleId();

    if (StringUtil.checkBlank(userId, articleId)) {
      log.error("userId,articleId不能为空");
      resBean.setError(httpErrorMsg.getPostUCACancel().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostUCACancel().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    iTToolAccountService.clearAccount(userId, articleId,
        httpAction.getCbpModule().getUserCollectArticle());
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public ResUserReadArticleBean postURA(ReqUserReadArticleBean reqUserReadArticleBean) {
    ResUserReadArticleBean resBean = new ResUserReadArticleBean();
    String userId = reqUserReadArticleBean.getUserId();
    String articleId = reqUserReadArticleBean.getArticleId();
    String remark = reqUserReadArticleBean.getRemark();
    if (StringUtil.checkBlank(userId, articleId)) {
      log.error("userId,articleId不能为空");
      resBean.setError(httpErrorMsg.getPostURA().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostURA().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    iTToolAccountService.addAccount(userId, articleId,
        httpAction.getCbpModule().getUserReadArticle(), remark);
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }


}
