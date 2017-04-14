package com.shenmintech.cbp.biz.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shenmintech.cbp.biz.IClazzBiz;
import com.shenmintech.cbp.biz.IRoomAndVideoBiz;
import com.shenmintech.cbp.biz.vo.ques.Req4PostClazzVo;
import com.shenmintech.cbp.biz.vo.ques.SonRelationVo;
import com.shenmintech.cbp.biz.vo.res.ClazzVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetClazzVo;
import com.shenmintech.cbp.biz.vo.res.Res4GetRoomVo;
import com.shenmintech.cbp.config.HttpErrorMsg;
import com.shenmintech.cbp.controller.bean.req.NetEasyRoomCreateRoomReq;
import com.shenmintech.cbp.controller.bean.req.Req4GetRoomBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetTeachClazzBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostTeachClazzBean;
import com.shenmintech.cbp.controller.bean.req.SonRelationBean;
import com.shenmintech.cbp.controller.bean.res.NetEasyRoomResponse;
import com.shenmintech.cbp.controller.bean.res.Res4GetRoomBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetTeachClazzBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostTeachClazzBean;
import com.shenmintech.cbp.controller.bean.res.Son4GetTeachClazzBean;
import com.shenmintech.cbp.entity.TKcCourseTableGroupRelation;
import com.shenmintech.cbp.exception.ApplicationException;
import com.shenmintech.cbp.mapper.TKcCourseTableGroupRelationMapper;
import com.shenmintech.cbp.service.IClazzService;
import com.shenmintech.common.util.Constants;
import com.shenmintech.common.util.DateUtil;
import com.shenmintech.common.util.StringUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@SuppressWarnings("static-access")
public class ClazzBizImpl implements IClazzBiz {

  @Autowired
  IClazzService iClazzService;

  @Autowired
  IRoomAndVideoBiz iRoomAndVideoBiz;

  @Autowired
  TKcCourseTableGroupRelationMapper tKcCourseTableGroupRelationMapper;

  @Autowired
  HttpErrorMsg httpErrorMsg;

  @Override
  public Res4PostTeachClazzBean addTeachClazz(Req4PostTeachClazzBean req4TeachClazzBean) {
    Res4PostTeachClazzBean resBean = new Res4PostTeachClazzBean();
    Req4PostClazzVo clazzVo = new Req4PostClazzVo();
    List<SonRelationVo> list = new ArrayList<>();
    List<SonRelationBean> SonRelationBeans = req4TeachClazzBean.getRelations();
    Iterator<SonRelationBean> it = SonRelationBeans.iterator();
    while (it.hasNext()) {
      SonRelationBean sonRelationBean = it.next();
      String clazzId = sonRelationBean.getClazzId();
      if (StringUtil.isBlank(clazzId)) {
        log.error("clazzId不能为空");
        resBean.setError(httpErrorMsg.getPostTKcClazz().variMiss.getCodeFail());
        resBean.setMsg(httpErrorMsg.getPostTKcClazz().variMiss.getMsgFail());
        resBean.setSuccess(false);
        return resBean;
      }
      String startTime = sonRelationBean.getStartTime();
      Date sTime = null;
      try {
        sTime = DateUtil.parse(startTime, DateUtil.DATETYPE_10);
      } catch (Exception e) {
        log.error("startTime无法转化为date类型，请检查所传字段是否符合格式");
        resBean.setError(httpErrorMsg.getPostTKcClazz().variIllegal.getCodeFail());
        resBean.setMsg(httpErrorMsg.getPostTKcClazz().variIllegal.getMsgFail());
        resBean.setSuccess(false);
        return resBean;
      }
      String endTime = sonRelationBean.getEndTime();
      Date eTime = null;
      try {
        eTime = DateUtil.parse(endTime, DateUtil.DATETYPE_10);
      } catch (Exception e) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(sTime);
        cal.add(Calendar.HOUR, 2);
        eTime = cal.getTime();
      }

      SonRelationVo sonRelationVo =
          new SonRelationVo().builder().clazzId(clazzId).startTime(sTime).endTime(eTime).build();
      list.add(sonRelationVo);
    }
    clazzVo.setRelations(list);
    List<ClazzVo> vos = new ArrayList<>();
    try {
      vos = iClazzService.setClazzTime(clazzVo);
    } catch (ApplicationException e) {
      log.error(e.msg);
      resBean.setError(httpErrorMsg.getPostTKcClazz().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostTKcClazz().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    } catch (Exception e) {
      log.error("context", e);
      resBean.setError(httpErrorMsg.getPostTKcClazz().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getPostTKcClazz().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    for (ClazzVo vo : vos) {// 调用外部创建房间接口，只可循环记录
      NetEasyRoomCreateRoomReq req = new NetEasyRoomCreateRoomReq();
      String clazzId = vo.getClazzId();
      TKcCourseTableGroupRelation rela =
          tKcCourseTableGroupRelationMapper.selectByPrimaryKey(clazzId);
      if (null != rela.getNtesRoomId()) continue;
      req.setOperatorUserId(req4TeachClazzBean.getOperatorUserId());
      req.setGroupId(clazzId);
      req.setRoomName(vo.getClazzName());
      NetEasyRoomResponse res = iRoomAndVideoBiz.createNetEasyRoom(req);
      if (200 != res.getCode()) {
        log.error("房间号申请失败");
        resBean.setError(httpErrorMsg.getPostTKcClazz().thirdApiExc.getCodeFail());
        resBean.setMsg(httpErrorMsg.getPostTKcClazz().thirdApiExc.getMsgFail());
        resBean.setSuccess(false);
        return resBean;
      }
      String roomId = res.getChatroom().getRoomid();
      String rtmpPullUrl = res.getChatroom().getRtmpPullUrl();
      String httpPullUrl = res.getChatroom().getHttpPullUrl();
      String pushUrl = res.getChatroom().getPushUrl();
      try {
        iClazzService.setRoomData(clazzId, roomId, rtmpPullUrl, httpPullUrl, pushUrl);
      } catch (Exception e) {
        log.error(e.getMessage());
        resBean.setError(httpErrorMsg.getPostTKcClazz().sysInnerExc.getCodeFail());
        resBean.setMsg(httpErrorMsg.getPostTKcClazz().sysInnerExc.getMsgFail());
        resBean.setSuccess(false);
        return resBean;
      }
    }
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public Res4GetTeachClazzBean selectById(Req4GetTeachClazzBean req4GetTeachClazzBean) {
    Res4GetTeachClazzBean resBean = new Res4GetTeachClazzBean();
    String groupId = req4GetTeachClazzBean.getGroupId();
    if (StringUtil.isBlank(groupId)) {
      log.error("groupId不能为空");
      resBean.setError(httpErrorMsg.getGetTKcClazzById().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetTKcClazzById().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    List<Res4GetClazzVo> res4GetClazzVos = new ArrayList<>();
    try {
      res4GetClazzVos = iClazzService.selectByGroupId(groupId);
    } catch (ApplicationException e) {
      log.error(e.msg);
      resBean.setError(httpErrorMsg.getGetTKcClazzById().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetTKcClazzById().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    } catch (Exception e) {
      log.error("context", e);
      resBean.setError(httpErrorMsg.getGetTKcClazzById().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetTKcClazzById().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }

    List<Son4GetTeachClazzBean> teachClazzList = new ArrayList<>();
    Iterator<Res4GetClazzVo> it = res4GetClazzVos.iterator();
    while (it.hasNext()) {
      Son4GetTeachClazzBean son4GetTeachClazzBean = new Son4GetTeachClazzBean();
      Res4GetClazzVo res4GetClazzVo = it.next();
      String courseTableGroupRelationId = res4GetClazzVo.getCourseTableGroupRelationId();
      son4GetTeachClazzBean.setCourseTableGroupRelationId(courseTableGroupRelationId);
      int clazzNo = res4GetClazzVo.getClazzNo();
      son4GetTeachClazzBean.setClazzNo(String.valueOf(clazzNo));
      String clazzName = res4GetClazzVo.getClazzName();
      son4GetTeachClazzBean.setClazzName(clazzName);
      Date startTime = res4GetClazzVo.getStartTime();
      if (null == startTime) {
        son4GetTeachClazzBean.setStartTime(Constants.BLANKSTR);
      } else {
        son4GetTeachClazzBean.setStartTime(DateUtil.format(startTime, DateUtil.DATETYPE_10));
      }
      Date endTime = res4GetClazzVo.getEndTime();
      if (null == endTime) {
        son4GetTeachClazzBean.setEndTime(Constants.BLANKSTR);
      } else {
        son4GetTeachClazzBean.setEndTime(DateUtil.format(endTime, DateUtil.DATETYPE_10));
      }
      teachClazzList.add(son4GetTeachClazzBean);
    }
    resBean.setTeachClazzList(teachClazzList);
    resBean.setError(0);
    resBean.setMsg(Constants.SUCCESS);
    resBean.setSuccess(true);
    return resBean;
  }

  @Override
  public Res4GetRoomBean getRooms(Req4GetRoomBean req4GetRoomBean) {
    Res4GetRoomBean resBean = new Res4GetRoomBean();

    String teacherId = req4GetRoomBean.getTeacherId();
    if (StringUtil.isBlank(teacherId)) {
      log.error("groupId不能为空");
      resBean.setError(httpErrorMsg.getGetNtesRoom().variMiss.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetNtesRoom().variMiss.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }

    Res4GetRoomVo roomVo = new Res4GetRoomVo();
    try {
      roomVo = iClazzService.selectRoomsByTeacherId(teacherId);
    } catch (ApplicationException e) {
      log.error(e.msg);
      resBean.setError(httpErrorMsg.getGetNtesRoom().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetNtesRoom().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    } catch (Exception e) {
      log.error(e.getMessage());
      resBean.setError(httpErrorMsg.getGetNtesRoom().sysInnerExc.getCodeFail());
      resBean.setMsg(httpErrorMsg.getGetNtesRoom().sysInnerExc.getMsgFail());
      resBean.setSuccess(false);
      return resBean;
    }
    BeanUtils.copyProperties(roomVo, resBean);
    return resBean;
  }

}
