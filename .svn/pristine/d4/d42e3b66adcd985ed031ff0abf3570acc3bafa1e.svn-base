package com.shenmintech.cbp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shenmintech.cbp.biz.IStudentBiz;
import com.shenmintech.cbp.controller.bean.req.Req4DelStudentBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetHomeworkStudentRelationBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetUserInfoBean;
import com.shenmintech.cbp.controller.bean.req.Req4GetUserRelationIds;
import com.shenmintech.cbp.controller.bean.req.Req4PostStudentBean;
import com.shenmintech.cbp.controller.bean.req.Req4PutStudentBean;
import com.shenmintech.cbp.controller.bean.res.Res4DelStudentBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetHomeworkStudentRelationBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetUserInfoBean;
import com.shenmintech.cbp.controller.bean.res.Res4GetUserRelationIds;
import com.shenmintech.cbp.controller.bean.res.Res4PostStudentBean;
import com.shenmintech.cbp.controller.bean.res.Res4PutStudentBean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/*
 * 学员查接口归类至EmployeeController by max
 * 
 */

@Controller
@Api(value = "学员", description = "学员相关操作--max")
public class StudentController {

  @Autowired
  IStudentBiz iStudentBiz;

  @PostMapping("/tkcStudent/post")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "将某个员工从无分组状态归到当前班级的某个小组中", httpMethod = "POST", value = "添加学员的小组归属（OK）")
  public @ResponseBody Res4PostStudentBean postTKcStudent(
      @ApiParam(required = true, value = "员工小组对象") @RequestBody Req4PostStudentBean req4PostStudentBean) {
    return iStudentBiz.addStudent(req4PostStudentBean);
  }

  @PostMapping("/tkcStudent/delete")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "将某个员工在小组中移除(逻辑删)", httpMethod = "POST", value = "删除学员（OK）")
  public @ResponseBody Res4DelStudentBean deleteTKcStudent(
      @ApiParam(required = true, value = "删除的学生对象") @RequestBody Req4DelStudentBean req4DelStudentBean) {
    return iStudentBiz.deleteById(req4DelStudentBean);
  }

  @PostMapping("/tkcStudent/put")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "将某个员工在一个小组更换到另外一个小组", httpMethod = "POST", value = "更新学员小组归属（OK）")
  public @ResponseBody Res4PutStudentBean putTKcStudent(
      @ApiParam(required = true, value = "更新的学生对象") @RequestBody Req4PutStudentBean req4PutStudentBean) {
    return iStudentBiz.updateById(req4PutStudentBean);
  }

  @PostMapping("/tkcHSRelation/get")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "根据taskId获取该推送任务推送到学生的任务列表", httpMethod = "POST", value = "查看学生被推送的任务列表（ing）")
  public @ResponseBody Res4GetHomeworkStudentRelationBean getTKcHSRelation(
      @ApiParam(required = true, value = "查看列表入参对象") @RequestBody Req4GetHomeworkStudentRelationBean req4GetHomeworkStudentRelationBean) {
    return iStudentBiz.selectByTaskId(req4GetHomeworkStudentRelationBean);
  }

  @PostMapping("/tUser/relations/get")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "", httpMethod = "POST", value = "根据用户ID查询与该用户相关的人的id列表")
  public @ResponseBody Res4GetUserRelationIds getTUserRelation(
      @ApiParam(required = true, value = "查看与某个用户相关的用户列表（包含小组，课程，公司）") @RequestBody Req4GetUserRelationIds req4GetUserRelationIds) {
    return iStudentBiz.selectRelationsByUserId(req4GetUserRelationIds);
  }

  @PostMapping("/tkcStudent/id/get")
  @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
  @ApiOperation(notes = "", httpMethod = "POST", value = "查看员工的个人详情")
  public @ResponseBody Res4GetUserInfoBean getTUserInfo(
      @ApiParam(required = true, value = "查看与某个员工的信息") @RequestBody Req4GetUserInfoBean req4GetUserInfo) {
    return iStudentBiz.selectUserInfo(req4GetUserInfo);
  }
}
