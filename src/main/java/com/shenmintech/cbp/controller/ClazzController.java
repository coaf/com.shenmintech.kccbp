package com.shenmintech.cbp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shenmintech.cbp.biz.IClazzBiz;
import com.shenmintech.cbp.controller.bean.req.Req4GetTeachClazzBean;
import com.shenmintech.cbp.controller.bean.req.Req4PostTeachClazzBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetTeachClazzBean;
import com.shenmintech.cbp.controller.bean.res.Res4PostTeachClazzBean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/*
 * 
 */

@Controller
@Api(value = "课", description = "课实例的相关操作--max")
public class ClazzController {

  @Autowired
  IClazzBiz iClazzBiz;

  @PostMapping("/tkcTeachClazz/post")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "导师针对某一小组，制定某些课的上课时间。（此接口为创建上课实例，一旦创建，课程则制定，在当前小组的学员都可以参与课程）", httpMethod = "POST", value = "添加课表时间（OK）")
  public @ResponseBody Res4PostTeachClazzBean postTKcClazz(
      @ApiParam(required = true, value = "添加课表时间对象") @RequestBody Req4PostTeachClazzBean req4TeachClazzBean) {
    return iClazzBiz.addTeachClazz(req4TeachClazzBean);
  }

  @PostMapping("/tkcTeachClazz/get")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "针对某一个小组id，精确查询该小组的课程实例", httpMethod = "POST", value = "查看课表时间（OK）")
  public @ResponseBody Res4GetTeachClazzBean getTKcClazzById(
      @ApiParam(required = true, value = "查新小组课程表对象") @RequestBody Req4GetTeachClazzBean Req4GetTeachClazzBean) {
    return iClazzBiz.selectById(Req4GetTeachClazzBean);
  }
}
