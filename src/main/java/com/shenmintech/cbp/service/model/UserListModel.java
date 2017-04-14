package com.shenmintech.cbp.service.model;

import java.util.List;

import com.shenmintech.base.bean.BaseRetBean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserListModel extends BaseRetBean {

  List<TUser4List> users;

}
