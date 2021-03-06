package com.shenmintech.cbp.controller.bean.req;

import com.shenmintech.base.bean.BaseReqBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class Req4PostUEStudentBean extends BaseReqBean {

  @ApiModelProperty(value = "姓名", required = true)
  public String userName;

  @ApiModelProperty(value = "手机号码", required = true)
  public String mobile;

  @ApiModelProperty(value = "性别0女/1男", required = true)
  public String sex;

  @ApiModelProperty(value = "体重/KG", required = true)
  public String weight;

  @ApiModelProperty(value = "身高/CM", required = true)
  public String height;

  @ApiModelProperty(value = "生日", required = true)
  public String birthday;

  @ApiModelProperty(value = "班级ID", required = true)
  public String courseId;

  @ApiModelProperty(value = "分组ID", required = true)
  public String groupId;

  @ApiModelProperty(value = "热量单位0轻币/1大卡", required = true)
  public String calUnit;

  @ApiModelProperty(value = "邮箱", required = true)
  public String email;

  @ApiModelProperty(value = "员工号", required = false)
  public String employeeNo;

}
