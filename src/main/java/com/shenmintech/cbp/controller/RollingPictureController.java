package com.shenmintech.cbp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shenmintech.cbp.biz.IRollingPictureBiz;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * 轮播图管理
 * 
 */

@Controller
@Api(value = "轮播图管理", description = "轮播图相关操作--max")
public class RollingPictureController {

  @Autowired
  IRollingPictureBiz iRollingPictureBiz;

  @PostMapping("/tkcRollingPic/post")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "导师添加轮播图", httpMethod = "POST", value = "添加轮播图（OK）")
  public @ResponseBody Res4PostRollingPicBean postTKcRollingPic(
      @ApiParam(required = true, value = "添加轮播图入参对象") @RequestBody Req4PostRollingPicBean req4PostRollingPicBean) {
    return iRollingPictureBiz.postRollingPic(req4PostRollingPicBean);
  }

  @PostMapping("/tkcRollingPics/get")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "查询轮播图列表", httpMethod = "POST", value = "轮播图列表查询（OK）")
  public @ResponseBody Res4GetRollingPicsBean getTKcRollingPics(
      @ApiParam(required = true, value = "查看轮播图列表入参对象") @RequestBody Req4GetRollingPicsBean req4GetRollingPicsBean) {
    return iRollingPictureBiz.getRollingPics(req4GetRollingPicsBean);
  }

  @PostMapping("/tkcRollingPic/get")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "查询轮播图详细信息", httpMethod = "POST", value = "轮播图信息查询（OK）")
  public @ResponseBody Res4GetRollingPicBean getTKcRollingPic(
      @ApiParam(required = true, value = "查看单个轮播图详情入参对象") @RequestBody Req4GetRollingPicBean req4GetRollingPicBean) {
    return iRollingPictureBiz.getRollingPic(req4GetRollingPicBean);
  }

  @PostMapping("/tkcRollingPic/put")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "更新轮播图详细信息", httpMethod = "POST", value = "轮播图信息更改（OK）")
  public @ResponseBody Res4PutRollingPicBean putTKcRollingPic(
      @ApiParam(required = true, value = "更改单个轮播图详情入参对象") @RequestBody Req4PutRollingPicBean req4PutRollingPicBean) {
    return iRollingPictureBiz.putRollingPic(req4PutRollingPicBean);
  }

  @PostMapping("/tkcRollingPics4App/get")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "APP端展示轮播图", httpMethod = "POST", value = "APP端轮播图查询（OK）")
  public @ResponseBody Res4GetRPs4AppBean getTKcRPs4App(
      @ApiParam(required = true, value = "APP展示轮播图列表入参对象") @RequestBody Req4GetRPs4AppBean req4GetRPs4AppBean) {
    return iRollingPictureBiz.getRPs4App(req4GetRPs4AppBean);
  }

}
