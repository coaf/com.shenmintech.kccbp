package com.shenmintech.cbp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TKcHomeworkStudentRelationExample {
  protected PagingExample pagingExample;

  public PagingExample getPagingExample() {
    return pagingExample;
  }

  public void setPagingExample(PagingExample pagingExample) {
    this.pagingExample = pagingExample;
  }

  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public TKcHomeworkStudentRelationExample() {
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

    public Criteria andTaskFidIsNull() {
      addCriterion("task_fid is null");
      return (Criteria) this;
    }

    public Criteria andTaskFidIsNotNull() {
      addCriterion("task_fid is not null");
      return (Criteria) this;
    }

    public Criteria andTaskFidEqualTo(String value) {
      addCriterion("task_fid =", value, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidNotEqualTo(String value) {
      addCriterion("task_fid <>", value, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidGreaterThan(String value) {
      addCriterion("task_fid >", value, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidGreaterThanOrEqualTo(String value) {
      addCriterion("task_fid >=", value, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidLessThan(String value) {
      addCriterion("task_fid <", value, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidLessThanOrEqualTo(String value) {
      addCriterion("task_fid <=", value, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidLike(String value) {
      addCriterion("task_fid like", value, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidNotLike(String value) {
      addCriterion("task_fid not like", value, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidIn(List<String> values) {
      addCriterion("task_fid in", values, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidNotIn(List<String> values) {
      addCriterion("task_fid not in", values, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidBetween(String value1, String value2) {
      addCriterion("task_fid between", value1, value2, "taskFid");
      return (Criteria) this;
    }

    public Criteria andTaskFidNotBetween(String value1, String value2) {
      addCriterion("task_fid not between", value1, value2, "taskFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidIsNull() {
      addCriterion("homework_fid is null");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidIsNotNull() {
      addCriterion("homework_fid is not null");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidEqualTo(String value) {
      addCriterion("homework_fid =", value, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidNotEqualTo(String value) {
      addCriterion("homework_fid <>", value, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidGreaterThan(String value) {
      addCriterion("homework_fid >", value, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidGreaterThanOrEqualTo(String value) {
      addCriterion("homework_fid >=", value, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidLessThan(String value) {
      addCriterion("homework_fid <", value, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidLessThanOrEqualTo(String value) {
      addCriterion("homework_fid <=", value, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidLike(String value) {
      addCriterion("homework_fid like", value, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidNotLike(String value) {
      addCriterion("homework_fid not like", value, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidIn(List<String> values) {
      addCriterion("homework_fid in", values, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidNotIn(List<String> values) {
      addCriterion("homework_fid not in", values, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidBetween(String value1, String value2) {
      addCriterion("homework_fid between", value1, value2, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andHomeworkFidNotBetween(String value1, String value2) {
      addCriterion("homework_fid not between", value1, value2, "homeworkFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidIsNull() {
      addCriterion("student_fid is null");
      return (Criteria) this;
    }

    public Criteria andStudentFidIsNotNull() {
      addCriterion("student_fid is not null");
      return (Criteria) this;
    }

    public Criteria andStudentFidEqualTo(String value) {
      addCriterion("student_fid =", value, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidNotEqualTo(String value) {
      addCriterion("student_fid <>", value, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidGreaterThan(String value) {
      addCriterion("student_fid >", value, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidGreaterThanOrEqualTo(String value) {
      addCriterion("student_fid >=", value, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidLessThan(String value) {
      addCriterion("student_fid <", value, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidLessThanOrEqualTo(String value) {
      addCriterion("student_fid <=", value, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidLike(String value) {
      addCriterion("student_fid like", value, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidNotLike(String value) {
      addCriterion("student_fid not like", value, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidIn(List<String> values) {
      addCriterion("student_fid in", values, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidNotIn(List<String> values) {
      addCriterion("student_fid not in", values, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidBetween(String value1, String value2) {
      addCriterion("student_fid between", value1, value2, "studentFid");
      return (Criteria) this;
    }

    public Criteria andStudentFidNotBetween(String value1, String value2) {
      addCriterion("student_fid not between", value1, value2, "studentFid");
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

    public Criteria andRemark3IsNull() {
      addCriterion("remark3 is null");
      return (Criteria) this;
    }

    public Criteria andRemark3IsNotNull() {
      addCriterion("remark3 is not null");
      return (Criteria) this;
    }

    public Criteria andRemark3EqualTo(String value) {
      addCriterion("remark3 =", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3NotEqualTo(String value) {
      addCriterion("remark3 <>", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3GreaterThan(String value) {
      addCriterion("remark3 >", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3GreaterThanOrEqualTo(String value) {
      addCriterion("remark3 >=", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3LessThan(String value) {
      addCriterion("remark3 <", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3LessThanOrEqualTo(String value) {
      addCriterion("remark3 <=", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3Like(String value) {
      addCriterion("remark3 like", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3NotLike(String value) {
      addCriterion("remark3 not like", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3In(List<String> values) {
      addCriterion("remark3 in", values, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3NotIn(List<String> values) {
      addCriterion("remark3 not in", values, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3Between(String value1, String value2) {
      addCriterion("remark3 between", value1, value2, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3NotBetween(String value1, String value2) {
      addCriterion("remark3 not between", value1, value2, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark4IsNull() {
      addCriterion("remark4 is null");
      return (Criteria) this;
    }

    public Criteria andRemark4IsNotNull() {
      addCriterion("remark4 is not null");
      return (Criteria) this;
    }

    public Criteria andRemark4EqualTo(String value) {
      addCriterion("remark4 =", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4NotEqualTo(String value) {
      addCriterion("remark4 <>", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4GreaterThan(String value) {
      addCriterion("remark4 >", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4GreaterThanOrEqualTo(String value) {
      addCriterion("remark4 >=", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4LessThan(String value) {
      addCriterion("remark4 <", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4LessThanOrEqualTo(String value) {
      addCriterion("remark4 <=", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4Like(String value) {
      addCriterion("remark4 like", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4NotLike(String value) {
      addCriterion("remark4 not like", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4In(List<String> values) {
      addCriterion("remark4 in", values, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4NotIn(List<String> values) {
      addCriterion("remark4 not in", values, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4Between(String value1, String value2) {
      addCriterion("remark4 between", value1, value2, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4NotBetween(String value1, String value2) {
      addCriterion("remark4 not between", value1, value2, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark5IsNull() {
      addCriterion("remark5 is null");
      return (Criteria) this;
    }

    public Criteria andRemark5IsNotNull() {
      addCriterion("remark5 is not null");
      return (Criteria) this;
    }

    public Criteria andRemark5EqualTo(String value) {
      addCriterion("remark5 =", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5NotEqualTo(String value) {
      addCriterion("remark5 <>", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5GreaterThan(String value) {
      addCriterion("remark5 >", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5GreaterThanOrEqualTo(String value) {
      addCriterion("remark5 >=", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5LessThan(String value) {
      addCriterion("remark5 <", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5LessThanOrEqualTo(String value) {
      addCriterion("remark5 <=", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5Like(String value) {
      addCriterion("remark5 like", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5NotLike(String value) {
      addCriterion("remark5 not like", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5In(List<String> values) {
      addCriterion("remark5 in", values, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5NotIn(List<String> values) {
      addCriterion("remark5 not in", values, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5Between(String value1, String value2) {
      addCriterion("remark5 between", value1, value2, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5NotBetween(String value1, String value2) {
      addCriterion("remark5 not between", value1, value2, "remark5");
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
