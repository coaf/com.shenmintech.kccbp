package com.shenmintech.cbp.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shenmintech.base.template.IdWorkerTemplate;
import com.shenmintech.cbp.biz.IRoomAndVideoBiz;
import com.shenmintech.cbp.biz.vo.ques.Req4PostRollingPicVo;
import com.shenmintech.cbp.biz.vo.ques.Req4PutRollingPicVo;
import com.shenmintech.cbp.controller.bean.req.NetEasyRoomCreateRoomReq;
import com.shenmintech.cbp.controller.bean.res.NetEasyRoomResponse;
import com.shenmintech.cbp.entity.TKcPubCourse;
import com.shenmintech.cbp.entity.TKcPubCourseExample;
import com.shenmintech.cbp.entity.TKcRollingPic;
import com.shenmintech.cbp.entity.TKcRollingPlacehd;
import com.shenmintech.cbp.entity.TKcRollingPlacehdExample;
import com.shenmintech.cbp.exception.ApplicationException;
import com.shenmintech.cbp.mapper.TKcPubCourseMapper;
import com.shenmintech.cbp.mapper.TKcRollingPicMapper;
import com.shenmintech.cbp.mapper.TKcRollingPlacehdMapper;
import com.shenmintech.cbp.service.IRollingPictureService;
import com.shenmintech.cbp.service.model.PubCourseModel;
import com.shenmintech.common.util.Constants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
@SuppressWarnings("static-access")
public class RollingPictureServiceImpl implements IRollingPictureService {

  @Autowired
  IdWorkerTemplate idWorkerTemplate;

  @Autowired
  TKcRollingPicMapper tKcRollingPicMapper;

  @Autowired
  TKcRollingPlacehdMapper tKcRollingPlacehdMapper;

  @Autowired
  IRoomAndVideoBiz iRoomAndVideoBiz;

  @Autowired
  TKcPubCourseMapper tKcPubCourseMapper;

  @Override
  public void addRollingPic(Req4PostRollingPicVo rollingPicVo) {
    // 入轮播图表
    TKcRollingPic tKcRollingPic = new TKcRollingPic();
    String id = idWorkerTemplate.generateId();
    tKcRollingPic.setId(id);
    String rollingPicName = rollingPicVo.getRollingPicName();
    tKcRollingPic.setRollName(rollingPicName);
    int renderType = rollingPicVo.getRenderType();
    tKcRollingPic.setRollTypeFlag(renderType);
    String remark = rollingPicVo.getRemark();
    tKcRollingPic.setRemark(remark);
    String picId = rollingPicVo.getPicId();
    tKcRollingPic.setPicId(picId);
    String renderUrl = rollingPicVo.getRenderUrl();
    tKcRollingPic.setRenderUrl(renderUrl);
    tKcRollingPic.setCreateTime(new Date());
    int status = rollingPicVo.getStatus();
    tKcRollingPic.setStatus(status);
    tKcRollingPicMapper.insert(tKcRollingPic);
    // 更新排序栏位表
    int hisIndex = rollingPicVo.getHisIndex();
    this.updateOrInsertRollingPlacehd(hisIndex, id);
    // 如果是公开课，则插入公开课表
    if (1 == renderType) return;
    String pubCourseName = rollingPicVo.getPubCourseName();
    Date preStime = rollingPicVo.getPreStartTime();
    String operatorUserId = rollingPicVo.getOperatorUserId();
    PubCourseModel pubCourseModel =
        new PubCourseModel().builder().rollingPicId(id).pubCourseName(pubCourseName)
            .preStime(preStime).picId(picId).operatorUserId(operatorUserId).build();
    try {
      this.updateOrInsertPubCourse(pubCourseModel);
    } catch (ApplicationException e) {
      throw e;
    } catch (Exception e) {
      throw new ApplicationException(Constants.META_STATUS_CODE_D1, e.getMessage(),
          Constants.BLANKSTR);
    }
  }

  @Override
  public void updateRollingPic(Req4PutRollingPicVo rollingPicVo) {
    String rollingPicId = rollingPicVo.getRollingPicId();
    TKcRollingPic tKcRollingPic = tKcRollingPicMapper.selectByPrimaryKey(rollingPicId);
    if (null == tKcRollingPic) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
        "不存在id为" + rollingPicId + "的轮播图", Constants.BLANKSTR);
    Integer rollTypeFlag = tKcRollingPic.getRollTypeFlag();// 原跳转类型
    int renderType = rollingPicVo.getRenderType();// 现跳转类型
    log.info("rollTypeFlag=" + rollTypeFlag + ",故原轮播图的类型为" + (0 == rollTypeFlag ? "跳直播课" : "跳链接")
        + ",renderType=" + renderType + ",故目前要将跳转类型改成" + (0 == renderType ? "跳直播课" : "跳链接"));
    TKcRollingPic rollingPic = new TKcRollingPic();
    rollingPic.setId(rollingPicId);
    String rollingPicName = rollingPicVo.getRollingPicName();
    rollingPic.setRollName(rollingPicName);
    String remark = rollingPicVo.getRemark();
    rollingPic.setRemark(remark);
    String picId = rollingPicVo.getPicId();
    rollingPic.setPicId(picId);
    int status = rollingPicVo.getStatus();
    rollingPic.setStatus(status);
    if (1 == rollTypeFlag && 1 == renderType) {// 跳链接改为跳链接
      log.info("------------更新轮播图表------------");
      String renderUrl = rollingPicVo.getRenderUrl();
      rollingPic.setRenderUrl(renderUrl);
      tKcRollingPicMapper.updateByPrimaryKeySelective(rollingPic);
      log.info("------------更新排序栏位表------------");
      int hisIndex = rollingPicVo.getHisIndex();
      try {
        this.updateOrInsertRollingPlacehd(hisIndex, rollingPicId);
      } catch (ApplicationException e) {
        throw e;
      } catch (Exception e) {
        throw new ApplicationException(Constants.META_STATUS_CODE_D1, e.getMessage(),
            Constants.BLANKSTR);
      }
    } else if (1 == rollTypeFlag && 0 == renderType) {// 跳链接改为跳直播
      log.info("------------更新轮播图表------------");
      rollingPic.setRollTypeFlag(renderType);
      rollingPic.setRenderUrl(null);
      Date createTime = tKcRollingPic.getCreateTime();
      rollingPic.setCreateTime(createTime);
      rollingPic.setUpdateTime(new Date());
      tKcRollingPicMapper.updateByPrimaryKey(rollingPic);
      log.info("------------更新排序栏位表------------");
      int hisIndex = rollingPicVo.getHisIndex();
      try {
        this.updateOrInsertRollingPlacehd(hisIndex, rollingPicId);
      } catch (ApplicationException e) {
        throw e;
      } catch (Exception e) {
        throw new ApplicationException(Constants.META_STATUS_CODE_D1, e.getMessage(),
            Constants.BLANKSTR);
      }
      log.info("------------更新公开课表------------");
      String pubCourseName = rollingPicVo.getPubCourseName();
      Date preStime = rollingPicVo.getPreStartTime();
      String operatorUserId = rollingPicVo.getOperatorUserId();
      PubCourseModel pubCourseModel =
          new PubCourseModel().builder().rollingPicId(rollingPicId).pubCourseName(pubCourseName)
              .preStime(preStime).picId(picId).status(0).operatorUserId(operatorUserId).build();
      try {
        this.updateOrInsertPubCourse(pubCourseModel);
      } catch (ApplicationException e) {
        throw e;
      } catch (Exception e) {
        throw new ApplicationException(Constants.META_STATUS_CODE_D1, e.getMessage(),
            Constants.BLANKSTR);
      }
    } else if (0 == rollTypeFlag && 0 == renderType) {// 跳直播改为跳直播
      log.info("------------更新轮播图表------------");
      tKcRollingPicMapper.updateByPrimaryKeySelective(rollingPic);
      log.info("------------更新排序栏位表------------");
      int hisIndex = rollingPicVo.getHisIndex();
      try {
        this.updateOrInsertRollingPlacehd(hisIndex, rollingPicId);
      } catch (ApplicationException e) {
        throw e;
      } catch (Exception e) {
        throw new ApplicationException(Constants.META_STATUS_CODE_D1, e.getMessage(),
            Constants.BLANKSTR);
      }
      log.info("------------更新公开课表------------");
      String pubCourseName = rollingPicVo.getPubCourseName();
      Date preStime = rollingPicVo.getPreStartTime();
      String operatorUserId = rollingPicVo.getOperatorUserId();
      PubCourseModel pubCourseModel =
          new PubCourseModel().builder().rollingPicId(rollingPicId).pubCourseName(pubCourseName)
              .preStime(preStime).picId(picId).status(0).operatorUserId(operatorUserId).build();
      try {
        this.updateOrInsertPubCourse(pubCourseModel);
      } catch (ApplicationException e) {
        throw e;
      } catch (Exception e) {
        throw new ApplicationException(Constants.META_STATUS_CODE_D1, e.getMessage(),
            Constants.BLANKSTR);
      }
    } else if (0 == rollTypeFlag && 1 == renderType) {// 跳直播改为跳链接
      log.info("------------更新轮播图表------------");
      rollingPic.setRollTypeFlag(renderType);
      String renderUrl = rollingPicVo.getRenderUrl();
      rollingPic.setRenderUrl(renderUrl);
      tKcRollingPicMapper.updateByPrimaryKeySelective(rollingPic);
      log.info("------------更新排序栏位表------------");
      int hisIndex = rollingPicVo.getHisIndex();
      try {
        this.updateOrInsertRollingPlacehd(hisIndex, rollingPicId);
      } catch (ApplicationException e) {
        throw e;
      } catch (Exception e) {
        throw new ApplicationException(Constants.META_STATUS_CODE_D1, e.getMessage(),
            Constants.BLANKSTR);
      }
      log.info("------------更新公开课表------------");
      PubCourseModel pubCourseModel =
          new PubCourseModel().builder().rollingPicId(rollingPicId).status(-1).build();
      try {
        this.updateOrInsertPubCourse(pubCourseModel);
      } catch (ApplicationException e) {
        throw e;
      } catch (Exception e) {
        throw new ApplicationException(Constants.META_STATUS_CODE_D1, e.getMessage(),
            Constants.BLANKSTR);
      }
    } else {
      throw new ApplicationException(Constants.META_STATUS_CODE_D1, "跳转类型有误，请联系DB",
          Constants.BLANKSTR);
    }
  }

  @Override
  public void updateOrInsertRollingPlacehd(int hisIndex, String rollingPicId) {
    TKcRollingPlacehdExample tKcRollingPlacehdExample = new TKcRollingPlacehdExample();
    tKcRollingPlacehdExample.or().andStatusNotEqualTo(-1).andRollingPicFidEqualTo(rollingPicId);
    List<TKcRollingPlacehd> tKcRollingPlacehds =
        tKcRollingPlacehdMapper.selectByExample(tKcRollingPlacehdExample);
    if (null == tKcRollingPlacehds || 0 == tKcRollingPlacehds.size()) {// 之前没有参与占位排序
      if (0 != hisIndex) {// 现在参与排序，排序号就是hisIndex
        TKcRollingPlacehdExample example = new TKcRollingPlacehdExample();
        example.or().andStatusNotEqualTo(-1).andHisIndexEqualTo(hisIndex);
        List<TKcRollingPlacehd> hds = tKcRollingPlacehdMapper.selectByExample(example);
        if (null == hds || 0 == hds.size()) {
          TKcRollingPlacehd record = new TKcRollingPlacehd();
          record.setId(idWorkerTemplate.generateId());
          record.setHisIndex(hisIndex);
          record.setRollingPicFid(rollingPicId);
          record.setStatus(0);
          tKcRollingPlacehdMapper.insertSelective(record);
        } else {
          TKcRollingPlacehdExample rpExample = new TKcRollingPlacehdExample();
          rpExample.or().andHisIndexEqualTo(hisIndex);
          TKcRollingPlacehd tKcRollingPlacehd = new TKcRollingPlacehd();
          tKcRollingPlacehd.setRollingPicFid(rollingPicId);
          tKcRollingPlacehd.setStatus(0);
          tKcRollingPlacehdMapper.updateByExampleSelective(tKcRollingPlacehd, rpExample);
        }
      }
    } else if (1 == tKcRollingPlacehds.size()) {// 之前参与了占位排序
      TKcRollingPlacehd tKcRollingPlacehd = tKcRollingPlacehds.get(0);
      int beforeHisIndex = tKcRollingPlacehd.getHisIndex();
      if (beforeHisIndex != hisIndex) {// 之前的占位排序号不为当前的占位排序号
        tKcRollingPlacehd.setRollingPicFid(null);
        tKcRollingPlacehdMapper.updateByPrimaryKey(tKcRollingPlacehd);// 清除原占位
        // 查询hisIndex位置有没有占坑，如果已经占坑，则更新，如果没有占坑，则插入
        TKcRollingPlacehdExample kcRollingPlacehdExample = new TKcRollingPlacehdExample();
        kcRollingPlacehdExample.or().andStatusNotEqualTo(-1).andHisIndexEqualTo(hisIndex);
        List<TKcRollingPlacehd> rollingPlacehds =
            tKcRollingPlacehdMapper.selectByExample(kcRollingPlacehdExample);
        if (1 == rollingPlacehds.size()) {
          if (0 != hisIndex) {// 当前改为不参与占位排序
            TKcRollingPlacehdExample rpExample = new TKcRollingPlacehdExample();
            rpExample.or().andHisIndexEqualTo(hisIndex);
            TKcRollingPlacehd curPlacehd = new TKcRollingPlacehd();
            curPlacehd.setRollingPicFid(rollingPicId);
            tKcRollingPlacehdMapper.updateByExampleSelective(curPlacehd, rpExample);// 更新入新的占位坑
          }
        } else if (0 == rollingPlacehds.size()) {
          TKcRollingPlacehd curPlacehd = new TKcRollingPlacehd();
          curPlacehd.setId(idWorkerTemplate.generateId());
          curPlacehd.setHisIndex(hisIndex);
          curPlacehd.setRollingPicFid(rollingPicId);
          curPlacehd.setStatus(0);
          tKcRollingPlacehdMapper.insert(curPlacehd);
        } else {
          log.info("同一个坑位hisIndex：" + hisIndex + "存在两个轮播图，请联系DB排查");
          throw new ApplicationException(Constants.META_STATUS_CODE_D1,
              "同一个坑位hisIndex：" + hisIndex + "存在两个轮播图，请联系DB排查", Constants.BLANKSTR);
        }
      }
    } else {// 之前占用了两个占位排序坑，一个萝卜一个坑，占着茅坑不拉屎，这是不对的哦
      throw new ApplicationException(Constants.META_STATUS_CODE_D1,
          "rollingPicId=" + rollingPicId + "在占位表中占多个坑位，请联系DB", Constants.BLANKSTR);
    }
  }

  @Override
  public void updateOrInsertPubCourse(PubCourseModel pubCourseModel) {
    String rollingPicId = pubCourseModel.getRollingPicId();
    String picId = pubCourseModel.getPicId();
    String operatorUserId = pubCourseModel.getOperatorUserId();
    String pubCourseName = pubCourseModel.getPubCourseName();
    Date preStartTime = pubCourseModel.getPreStime();
    int status = pubCourseModel.getStatus();

    TKcPubCourseExample tKcPubCourseExample = new TKcPubCourseExample();
    tKcPubCourseExample.or().andStatusNotEqualTo(-1).andRollingFidEqualTo(rollingPicId);
    List<TKcPubCourse> tKcPubCourses = tKcPubCourseMapper.selectByExample(tKcPubCourseExample);
    if (null == tKcPubCourses || 0 == tKcPubCourses.size()) {
      TKcPubCourse tKcPubCourse = new TKcPubCourse();
      String pubCourseId = idWorkerTemplate.generateId();
      tKcPubCourse.setId(pubCourseId);
      tKcPubCourse.setRollingFid(rollingPicId);
      tKcPubCourse.setCourseName(pubCourseName);
      tKcPubCourse.setPreStime(preStartTime);
      tKcPubCourse.setPicId(picId);;// 轮播图图片默认给公开课做封面
      tKcPubCourse.setStatus(0);
      NetEasyRoomCreateRoomReq req = new NetEasyRoomCreateRoomReq();// 开始申请网易视频房间
      req.setOperatorUserId(operatorUserId);
      req.setGroupId(pubCourseId);
      req.setRoomName(pubCourseName);
      NetEasyRoomResponse res = iRoomAndVideoBiz.createNetEasyRoom(req);
      if (200 != res.getCode()) throw new ApplicationException(Constants.META_STATUS_CODE_D1,
          "生成用户在网易的第三方房间接口报错", Constants.BLANKSTR);
      String roomId = res.getChatroom().getRoomid();
      String rtmpPullUrl = res.getChatroom().getRtmpPullUrl();
      String httpPullUrl = res.getChatroom().getHttpPullUrl();
      String pushUrl = res.getChatroom().getPushUrl();
      tKcPubCourse.setNtesRoomId(roomId);
      tKcPubCourse.setNtesRtmpPullUrl(rtmpPullUrl);
      tKcPubCourse.setNtesHttpPullUrl(httpPullUrl);
      tKcPubCourse.setNtesPushUrl(pushUrl);
      tKcPubCourseMapper.insertSelective(tKcPubCourse);
    } else if (1 == tKcPubCourses.size()) {
      TKcPubCourse tKcPubCourse = new TKcPubCourse();
      tKcPubCourse.setCourseName(pubCourseName);
      tKcPubCourse.setPreStime(preStartTime);
      tKcPubCourse.setPicId(picId);
      tKcPubCourse.setStatus(status);
      tKcPubCourseMapper.updateByExampleSelective(tKcPubCourse, tKcPubCourseExample);
    } else {
      throw new ApplicationException(Constants.META_STATUS_CODE_D1,
          "rollingPicId=" + rollingPicId + "在公开课表中有多个记录，请联系DB", Constants.BLANKSTR);
    }
  }
}
