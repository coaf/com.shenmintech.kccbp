package com.shenmintech.cbp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TKcHomeworkExample {
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

  public TKcHomeworkExample() {
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

    public Criteria andTeacherFidIsNull() {
      addCriterion("teacher_fid is null");
      return (Criteria) this;
    }

    public Criteria andTeacherFidIsNotNull() {
      addCriterion("teacher_fid is not null");
      return (Criteria) this;
    }

    public Criteria andTeacherFidEqualTo(String value) {
      addCriterion("teacher_fid =", value, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidNotEqualTo(String value) {
      addCriterion("teacher_fid <>", value, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidGreaterThan(String value) {
      addCriterion("teacher_fid >", value, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidGreaterThanOrEqualTo(String value) {
      addCriterion("teacher_fid >=", value, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidLessThan(String value) {
      addCriterion("teacher_fid <", value, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidLessThanOrEqualTo(String value) {
      addCriterion("teacher_fid <=", value, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidLike(String value) {
      addCriterion("teacher_fid like", value, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidNotLike(String value) {
      addCriterion("teacher_fid not like", value, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidIn(List<String> values) {
      addCriterion("teacher_fid in", values, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidNotIn(List<String> values) {
      addCriterion("teacher_fid not in", values, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidBetween(String value1, String value2) {
      addCriterion("teacher_fid between", value1, value2, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andTeacherFidNotBetween(String value1, String value2) {
      addCriterion("teacher_fid not between", value1, value2, "teacherFid");
      return (Criteria) this;
    }

    public Criteria andWorkNameIsNull() {
      addCriterion("work_name is null");
      return (Criteria) this;
    }

    public Criteria andWorkNameIsNotNull() {
      addCriterion("work_name is not null");
      return (Criteria) this;
    }

    public Criteria andWorkNameEqualTo(String value) {
      addCriterion("work_name =", value, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameNotEqualTo(String value) {
      addCriterion("work_name <>", value, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameGreaterThan(String value) {
      addCriterion("work_name >", value, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameGreaterThanOrEqualTo(String value) {
      addCriterion("work_name >=", value, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameLessThan(String value) {
      addCriterion("work_name <", value, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameLessThanOrEqualTo(String value) {
      addCriterion("work_name <=", value, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameLike(String value) {
      addCriterion("work_name like", value, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameNotLike(String value) {
      addCriterion("work_name not like", value, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameIn(List<String> values) {
      addCriterion("work_name in", values, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameNotIn(List<String> values) {
      addCriterion("work_name not in", values, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameBetween(String value1, String value2) {
      addCriterion("work_name between", value1, value2, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkNameNotBetween(String value1, String value2) {
      addCriterion("work_name not between", value1, value2, "workName");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidIsNull() {
      addCriterion("work_type_fid is null");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidIsNotNull() {
      addCriterion("work_type_fid is not null");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidEqualTo(String value) {
      addCriterion("work_type_fid =", value, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidNotEqualTo(String value) {
      addCriterion("work_type_fid <>", value, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidGreaterThan(String value) {
      addCriterion("work_type_fid >", value, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidGreaterThanOrEqualTo(String value) {
      addCriterion("work_type_fid >=", value, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidLessThan(String value) {
      addCriterion("work_type_fid <", value, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidLessThanOrEqualTo(String value) {
      addCriterion("work_type_fid <=", value, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidLike(String value) {
      addCriterion("work_type_fid like", value, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidNotLike(String value) {
      addCriterion("work_type_fid not like", value, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidIn(List<String> values) {
      addCriterion("work_type_fid in", values, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidNotIn(List<String> values) {
      addCriterion("work_type_fid not in", values, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidBetween(String value1, String value2) {
      addCriterion("work_type_fid between", value1, value2, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkTypeFidNotBetween(String value1, String value2) {
      addCriterion("work_type_fid not between", value1, value2, "workTypeFid");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeIsNull() {
      addCriterion("work_describe is null");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeIsNotNull() {
      addCriterion("work_describe is not null");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeEqualTo(String value) {
      addCriterion("work_describe =", value, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeNotEqualTo(String value) {
      addCriterion("work_describe <>", value, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeGreaterThan(String value) {
      addCriterion("work_describe >", value, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeGreaterThanOrEqualTo(String value) {
      addCriterion("work_describe >=", value, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeLessThan(String value) {
      addCriterion("work_describe <", value, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeLessThanOrEqualTo(String value) {
      addCriterion("work_describe <=", value, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeLike(String value) {
      addCriterion("work_describe like", value, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeNotLike(String value) {
      addCriterion("work_describe not like", value, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeIn(List<String> values) {
      addCriterion("work_describe in", values, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeNotIn(List<String> values) {
      addCriterion("work_describe not in", values, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeBetween(String value1, String value2) {
      addCriterion("work_describe between", value1, value2, "workDescribe");
      return (Criteria) this;
    }

    public Criteria andWorkDescribeNotBetween(String value1, String value2) {
      addCriterion("work_describe not between", value1, value2, "workDescribe");
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