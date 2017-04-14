package com.shenmintech.cbp.service.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PubCourseModel {

  String rollingPicId;
  String pubCourseName;
  Date preStime;
  String picId;
  String operatorUserId;
  int status;
}
