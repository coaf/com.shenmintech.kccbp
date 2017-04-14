package com.shenmintech.cbp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TKcCourseTableGroupRelationExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public TKcCourseTableGroupRelationExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  public String getOrderByClause() {
    return orderByClause;
  }

  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  public boolean isDistinct() {
    return distinct;
  }

  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  protected abstract static class GeneratedCriteria {
    protected List<Criterion> criteria;

    protected GeneratedCriteria() {
      super();
      criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
      return criteria.size() > 0;
    }

    public List<Criterion> getAllCriteria() {
      return criteria;
    }

    public List<Criterion> getCriteria() {
      return criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      criteria.add(new Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value1, value2));
    }

    public Criteria andIdIsNull() {
      addCriterion("id is null");
      return (Criteria) this;
    }

    public Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (Criteria) this;
    }

    public Criteria andIdEqualTo(String value) {
      addCriterion("id =", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotEqualTo(String value) {
      addCriterion("id <>", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThan(String value) {
      addCriterion("id >", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThanOrEqualTo(String value) {
      addCriterion("id >=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThan(String value) {
      addCriterion("id <", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThanOrEqualTo(String value) {
      addCriterion("id <=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLike(String value) {
      addCriterion("id like", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotLike(String value) {
      addCriterion("id not like", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdIn(List<String> values) {
      addCriterion("id in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotIn(List<String> values) {
      addCriterion("id not in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdBetween(String value1, String value2) {
      addCriterion("id between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotBetween(String value1, String value2) {
      addCriterion("id not between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andGroupFidIsNull() {
      addCriterion("group_fid is null");
      return (Criteria) this;
    }

    public Criteria andGroupFidIsNotNull() {
      addCriterion("group_fid is not null");
      return (Criteria) this;
    }

    public Criteria andGroupFidEqualTo(String value) {
      addCriterion("group_fid =", value, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidNotEqualTo(String value) {
      addCriterion("group_fid <>", value, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidGreaterThan(String value) {
      addCriterion("group_fid >", value, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidGreaterThanOrEqualTo(String value) {
      addCriterion("group_fid >=", value, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidLessThan(String value) {
      addCriterion("group_fid <", value, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidLessThanOrEqualTo(String value) {
      addCriterion("group_fid <=", value, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidLike(String value) {
      addCriterion("group_fid like", value, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidNotLike(String value) {
      addCriterion("group_fid not like", value, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidIn(List<String> values) {
      addCriterion("group_fid in", values, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidNotIn(List<String> values) {
      addCriterion("group_fid not in", values, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidBetween(String value1, String value2) {
      addCriterion("group_fid between", value1, value2, "groupFid");
      return (Criteria) this;
    }

    public Criteria andGroupFidNotBetween(String value1, String value2) {
      addCriterion("group_fid not between", value1, value2, "groupFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidIsNull() {
      addCriterion("course_table_fid is null");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidIsNotNull() {
      addCriterion("course_table_fid is not null");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidEqualTo(String value) {
      addCriterion("course_table_fid =", value, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidNotEqualTo(String value) {
      addCriterion("course_table_fid <>", value, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidGreaterThan(String value) {
      addCriterion("course_table_fid >", value, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidGreaterThanOrEqualTo(String value) {
      addCriterion("course_table_fid >=", value, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidLessThan(String value) {
      addCriterion("course_table_fid <", value, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidLessThanOrEqualTo(String value) {
      addCriterion("course_table_fid <=", value, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidLike(String value) {
      addCriterion("course_table_fid like", value, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidNotLike(String value) {
      addCriterion("course_table_fid not like", value, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidIn(List<String> values) {
      addCriterion("course_table_fid in", values, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidNotIn(List<String> values) {
      addCriterion("course_table_fid not in", values, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidBetween(String value1, String value2) {
      addCriterion("course_table_fid between", value1, value2, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andCourseTableFidNotBetween(String value1, String value2) {
      addCriterion("course_table_fid not between", value1, value2, "courseTableFid");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeIsNull() {
      addCriterion("pre_start_time is null");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeIsNotNull() {
      addCriterion("pre_start_time is not null");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeEqualTo(Date value) {
      addCriterion("pre_start_time =", value, "preStartTime");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeNotEqualTo(Date value) {
      addCriterion("pre_start_time <>", value, "preStartTime");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeGreaterThan(Date value) {
      addCriterion("pre_start_time >", value, "preStartTime");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("pre_start_time >=", value, "preStartTime");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeLessThan(Date value) {
      addCriterion("pre_start_time <", value, "preStartTime");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeLessThanOrEqualTo(Date value) {
      addCriterion("pre_start_time <=", value, "preStartTime");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeIn(List<Date> values) {
      addCriterion("pre_start_time in", values, "preStartTime");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeNotIn(List<Date> values) {
      addCriterion("pre_start_time not in", values, "preStartTime");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeBetween(Date value1, Date value2) {
      addCriterion("pre_start_time between", value1, value2, "preStartTime");
      return (Criteria) this;
    }

    public Criteria andPreStartTimeNotBetween(Date value1, Date value2) {
      addCriterion("pre_start_time not between", value1, value2, "preStartTime");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeIsNull() {
      addCriterion("pre_end_time is null");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeIsNotNull() {
      addCriterion("pre_end_time is not null");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeEqualTo(Date value) {
      addCriterion("pre_end_time =", value, "preEndTime");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeNotEqualTo(Date value) {
      addCriterion("pre_end_time <>", value, "preEndTime");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeGreaterThan(Date value) {
      addCriterion("pre_end_time >", value, "preEndTime");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("pre_end_time >=", value, "preEndTime");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeLessThan(Date value) {
      addCriterion("pre_end_time <", value, "preEndTime");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeLessThanOrEqualTo(Date value) {
      addCriterion("pre_end_time <=", value, "preEndTime");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeIn(List<Date> values) {
      addCriterion("pre_end_time in", values, "preEndTime");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeNotIn(List<Date> values) {
      addCriterion("pre_end_time not in", values, "preEndTime");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeBetween(Date value1, Date value2) {
      addCriterion("pre_end_time between", value1, value2, "preEndTime");
      return (Criteria) this;
    }

    public Criteria andPreEndTimeNotBetween(Date value1, Date value2) {
      addCriterion("pre_end_time not between", value1, value2, "preEndTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIsNull() {
      addCriterion("create_time is null");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIsNotNull() {
      addCriterion("create_time is not null");
      return (Criteria) this;
    }

    public Criteria andCreateTimeEqualTo(Date value) {
      addCriterion("create_time =", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotEqualTo(Date value) {
      addCriterion("create_time <>", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeGreaterThan(Date value) {
      addCriterion("create_time >", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("create_time >=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeLessThan(Date value) {
      addCriterion("create_time <", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
      addCriterion("create_time <=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIn(List<Date> values) {
      addCriterion("create_time in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotIn(List<Date> values) {
      addCriterion("create_time not in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeBetween(Date value1, Date value2) {
      addCriterion("create_time between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
      addCriterion("create_time not between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIsNull() {
      addCriterion("update_time is null");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIsNotNull() {
      addCriterion("update_time is not null");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeEqualTo(Date value) {
      addCriterion("update_time =", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotEqualTo(Date value) {
      addCriterion("update_time <>", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeGreaterThan(Date value) {
      addCriterion("update_time >", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("update_time >=", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeLessThan(Date value) {
      addCriterion("update_time <", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
      addCriterion("update_time <=", value, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeIn(List<Date> values) {
      addCriterion("update_time in", values, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotIn(List<Date> values) {
      addCriterion("update_time not in", values, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeBetween(Date value1, Date value2) {
      addCriterion("update_time between", value1, value2, "updateTime");
      return (Criteria) this;
    }

    public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
      addCriterion("update_time not between", value1, value2, "updateTime");
      return (Criteria) this;
    }

    public Criteria andStatusIsNull() {
      addCriterion("status is null");
      return (Criteria) this;
    }

    public Criteria andStatusIsNotNull() {
      addCriterion("status is not null");
      return (Criteria) this;
    }

    public Criteria andStatusEqualTo(Integer value) {
      addCriterion("status =", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusNotEqualTo(Integer value) {
      addCriterion("status <>", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusGreaterThan(Integer value) {
      addCriterion("status >", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
      addCriterion("status >=", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusLessThan(Integer value) {
      addCriterion("status <", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusLessThanOrEqualTo(Integer value) {
      addCriterion("status <=", value, "status");
      return (Criteria) this;
    }

    public Criteria andStatusIn(List<Integer> values) {
      addCriterion("status in", values, "status");
      return (Criteria) this;
    }

    public Criteria andStatusNotIn(List<Integer> values) {
      addCriterion("status not in", values, "status");
      return (Criteria) this;
    }

    public Criteria andStatusBetween(Integer value1, Integer value2) {
      addCriterion("status between", value1, value2, "status");
      return (Criteria) this;
    }

    public Criteria andStatusNotBetween(Integer value1, Integer value2) {
      addCriterion("status not between", value1, value2, "status");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdIsNull() {
      addCriterion("ntes_room_id is null");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdIsNotNull() {
      addCriterion("ntes_room_id is not null");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdEqualTo(String value) {
      addCriterion("ntes_room_id =", value, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdNotEqualTo(String value) {
      addCriterion("ntes_room_id <>", value, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdGreaterThan(String value) {
      addCriterion("ntes_room_id >", value, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdGreaterThanOrEqualTo(String value) {
      addCriterion("ntes_room_id >=", value, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdLessThan(String value) {
      addCriterion("ntes_room_id <", value, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdLessThanOrEqualTo(String value) {
      addCriterion("ntes_room_id <=", value, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdLike(String value) {
      addCriterion("ntes_room_id like", value, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdNotLike(String value) {
      addCriterion("ntes_room_id not like", value, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdIn(List<String> values) {
      addCriterion("ntes_room_id in", values, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdNotIn(List<String> values) {
      addCriterion("ntes_room_id not in", values, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdBetween(String value1, String value2) {
      addCriterion("ntes_room_id between", value1, value2, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomIdNotBetween(String value1, String value2) {
      addCriterion("ntes_room_id not between", value1, value2, "ntesRoomId");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameIsNull() {
      addCriterion("ntes_room_name is null");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameIsNotNull() {
      addCriterion("ntes_room_name is not null");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameEqualTo(String value) {
      addCriterion("ntes_room_name =", value, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameNotEqualTo(String value) {
      addCriterion("ntes_room_name <>", value, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameGreaterThan(String value) {
      addCriterion("ntes_room_name >", value, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameGreaterThanOrEqualTo(String value) {
      addCriterion("ntes_room_name >=", value, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameLessThan(String value) {
      addCriterion("ntes_room_name <", value, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameLessThanOrEqualTo(String value) {
      addCriterion("ntes_room_name <=", value, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameLike(String value) {
      addCriterion("ntes_room_name like", value, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameNotLike(String value) {
      addCriterion("ntes_room_name not like", value, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameIn(List<String> values) {
      addCriterion("ntes_room_name in", values, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameNotIn(List<String> values) {
      addCriterion("ntes_room_name not in", values, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameBetween(String value1, String value2) {
      addCriterion("ntes_room_name between", value1, value2, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRoomNameNotBetween(String value1, String value2) {
      addCriterion("ntes_room_name not between", value1, value2, "ntesRoomName");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlIsNull() {
      addCriterion("ntes_rtmp_pull_url is null");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlIsNotNull() {
      addCriterion("ntes_rtmp_pull_url is not null");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlEqualTo(String value) {
      addCriterion("ntes_rtmp_pull_url =", value, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlNotEqualTo(String value) {
      addCriterion("ntes_rtmp_pull_url <>", value, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlGreaterThan(String value) {
      addCriterion("ntes_rtmp_pull_url >", value, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlGreaterThanOrEqualTo(String value) {
      addCriterion("ntes_rtmp_pull_url >=", value, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlLessThan(String value) {
      addCriterion("ntes_rtmp_pull_url <", value, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlLessThanOrEqualTo(String value) {
      addCriterion("ntes_rtmp_pull_url <=", value, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlLike(String value) {
      addCriterion("ntes_rtmp_pull_url like", value, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlNotLike(String value) {
      addCriterion("ntes_rtmp_pull_url not like", value, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlIn(List<String> values) {
      addCriterion("ntes_rtmp_pull_url in", values, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlNotIn(List<String> values) {
      addCriterion("ntes_rtmp_pull_url not in", values, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlBetween(String value1, String value2) {
      addCriterion("ntes_rtmp_pull_url between", value1, value2, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesRtmpPullUrlNotBetween(String value1, String value2) {
      addCriterion("ntes_rtmp_pull_url not between", value1, value2, "ntesRtmpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlIsNull() {
      addCriterion("ntes_http_pull_url is null");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlIsNotNull() {
      addCriterion("ntes_http_pull_url is not null");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlEqualTo(String value) {
      addCriterion("ntes_http_pull_url =", value, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlNotEqualTo(String value) {
      addCriterion("ntes_http_pull_url <>", value, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlGreaterThan(String value) {
      addCriterion("ntes_http_pull_url >", value, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlGreaterThanOrEqualTo(String value) {
      addCriterion("ntes_http_pull_url >=", value, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlLessThan(String value) {
      addCriterion("ntes_http_pull_url <", value, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlLessThanOrEqualTo(String value) {
      addCriterion("ntes_http_pull_url <=", value, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlLike(String value) {
      addCriterion("ntes_http_pull_url like", value, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlNotLike(String value) {
      addCriterion("ntes_http_pull_url not like", value, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlIn(List<String> values) {
      addCriterion("ntes_http_pull_url in", values, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlNotIn(List<String> values) {
      addCriterion("ntes_http_pull_url not in", values, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlBetween(String value1, String value2) {
      addCriterion("ntes_http_pull_url between", value1, value2, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesHttpPullUrlNotBetween(String value1, String value2) {
      addCriterion("ntes_http_pull_url not between", value1, value2, "ntesHttpPullUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlIsNull() {
      addCriterion("ntes_push_url is null");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlIsNotNull() {
      addCriterion("ntes_push_url is not null");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlEqualTo(String value) {
      addCriterion("ntes_push_url =", value, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlNotEqualTo(String value) {
      addCriterion("ntes_push_url <>", value, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlGreaterThan(String value) {
      addCriterion("ntes_push_url >", value, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlGreaterThanOrEqualTo(String value) {
      addCriterion("ntes_push_url >=", value, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlLessThan(String value) {
      addCriterion("ntes_push_url <", value, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlLessThanOrEqualTo(String value) {
      addCriterion("ntes_push_url <=", value, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlLike(String value) {
      addCriterion("ntes_push_url like", value, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlNotLike(String value) {
      addCriterion("ntes_push_url not like", value, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlIn(List<String> values) {
      addCriterion("ntes_push_url in", values, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlNotIn(List<String> values) {
      addCriterion("ntes_push_url not in", values, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlBetween(String value1, String value2) {
      addCriterion("ntes_push_url between", value1, value2, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andNtesPushUrlNotBetween(String value1, String value2) {
      addCriterion("ntes_push_url not between", value1, value2, "ntesPushUrl");
      return (Criteria) this;
    }

    public Criteria andRemark1IsNull() {
      addCriterion("remark1 is null");
      return (Criteria) this;
    }

    public Criteria andRemark1IsNotNull() {
      addCriterion("remark1 is not null");
      return (Criteria) this;
    }

    public Criteria andRemark1EqualTo(String value) {
      addCriterion("remark1 =", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1NotEqualTo(String value) {
      addCriterion("remark1 <>", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1GreaterThan(String value) {
      addCriterion("remark1 >", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1GreaterThanOrEqualTo(String value) {
      addCriterion("remark1 >=", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1LessThan(String value) {
      addCriterion("remark1 <", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1LessThanOrEqualTo(String value) {
      addCriterion("remark1 <=", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1Like(String value) {
      addCriterion("remark1 like", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1NotLike(String value) {
      addCriterion("remark1 not like", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1In(List<String> values) {
      addCriterion("remark1 in", values, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1NotIn(List<String> values) {
      addCriterion("remark1 not in", values, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1Between(String value1, String value2) {
      addCriterion("remark1 between", value1, value2, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1NotBetween(String value1, String value2) {
      addCriterion("remark1 not between", value1, value2, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark2IsNull() {
      addCriterion("remark2 is null");
      return (Criteria) this;
    }

    public Criteria andRemark2IsNotNull() {
      addCriterion("remark2 is not null");
      return (Criteria) this;
    }

    public Criteria andRemark2EqualTo(String value) {
      addCriterion("remark2 =", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2NotEqualTo(String value) {
      addCriterion("remark2 <>", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2GreaterThan(String value) {
      addCriterion("remark2 >", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2GreaterThanOrEqualTo(String value) {
      addCriterion("remark2 >=", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2LessThan(String value) {
      addCriterion("remark2 <", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2LessThanOrEqualTo(String value) {
      addCriterion("remark2 <=", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2Like(String value) {
      addCriterion("remark2 like", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2NotLike(String value) {
      addCriterion("remark2 not like", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2In(List<String> values) {
      addCriterion("remark2 in", values, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2NotIn(List<String> values) {
      addCriterion("remark2 not in", values, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2Between(String value1, String value2) {
      addCriterion("remark2 between", value1, value2, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2NotBetween(String value1, String value2) {
      addCriterion("remark2 not between", value1, value2, "remark2");
      return (Criteria) this;
    }
  }

  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  public static class Criterion {
    private String condition;

    private Object value;

    private Object secondValue;

    private boolean noValue;

    private boolean singleValue;

    private boolean betweenValue;

    private boolean listValue;

    private String typeHandler;

    public String getCondition() {
      return condition;
    }

    public Object getValue() {
      return value;
    }

    public Object getSecondValue() {
      return secondValue;
    }

    public boolean isNoValue() {
      return noValue;
    }

    public boolean isSingleValue() {
      return singleValue;
    }

    public boolean isBetweenValue() {
      return betweenValue;
    }

    public boolean isListValue() {
      return listValue;
    }

    public String getTypeHandler() {
      return typeHandler;
    }

    protected Criterion(String condition) {
      super();
      this.condition = condition;
      this.typeHandler = null;
      this.noValue = true;
    }

    protected Criterion(String condition, Object value, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.typeHandler = typeHandler;
      if (value instanceof List<?>) {
        this.listValue = true;
      } else {
        this.singleValue = true;
      }
    }

    protected Criterion(String condition, Object value) {
      this(condition, value, null);
    }

    protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.secondValue = secondValue;
      this.typeHandler = typeHandler;
      this.betweenValue = true;
    }

    protected Criterion(String condition, Object value, Object secondValue) {
      this(condition, value, secondValue, null);
    }
  }
}
