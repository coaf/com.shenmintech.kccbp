package com.shenmintech.cbp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TKcCompanyExample {
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

  public TKcCompanyExample() {
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

    public Criteria andCompanyNameIsNull() {
      addCriterion("company_name is null");
      return (Criteria) this;
    }

    public Criteria andCompanyNameIsNotNull() {
      addCriterion("company_name is not null");
      return (Criteria) this;
    }

    public Criteria andCompanyNameEqualTo(String value) {
      addCriterion("company_name =", value, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameNotEqualTo(String value) {
      addCriterion("company_name <>", value, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameGreaterThan(String value) {
      addCriterion("company_name >", value, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
      addCriterion("company_name >=", value, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameLessThan(String value) {
      addCriterion("company_name <", value, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameLessThanOrEqualTo(String value) {
      addCriterion("company_name <=", value, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameLike(String value) {
      addCriterion("company_name like", value, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameNotLike(String value) {
      addCriterion("company_name not like", value, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameIn(List<String> values) {
      addCriterion("company_name in", values, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameNotIn(List<String> values) {
      addCriterion("company_name not in", values, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameBetween(String value1, String value2) {
      addCriterion("company_name between", value1, value2, "companyName");
      return (Criteria) this;
    }

    public Criteria andCompanyNameNotBetween(String value1, String value2) {
      addCriterion("company_name not between", value1, value2, "companyName");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumIsNull() {
      addCriterion("estimated_students_num is null");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumIsNotNull() {
      addCriterion("estimated_students_num is not null");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumEqualTo(Integer value) {
      addCriterion("estimated_students_num =", value, "estimatedStudentsNum");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumNotEqualTo(Integer value) {
      addCriterion("estimated_students_num <>", value, "estimatedStudentsNum");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumGreaterThan(Integer value) {
      addCriterion("estimated_students_num >", value, "estimatedStudentsNum");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumGreaterThanOrEqualTo(Integer value) {
      addCriterion("estimated_students_num >=", value, "estimatedStudentsNum");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumLessThan(Integer value) {
      addCriterion("estimated_students_num <", value, "estimatedStudentsNum");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumLessThanOrEqualTo(Integer value) {
      addCriterion("estimated_students_num <=", value, "estimatedStudentsNum");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumIn(List<Integer> values) {
      addCriterion("estimated_students_num in", values, "estimatedStudentsNum");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumNotIn(List<Integer> values) {
      addCriterion("estimated_students_num not in", values, "estimatedStudentsNum");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumBetween(Integer value1, Integer value2) {
      addCriterion("estimated_students_num between", value1, value2, "estimatedStudentsNum");
      return (Criteria) this;
    }

    public Criteria andEstimatedStudentsNumNotBetween(Integer value1, Integer value2) {
      addCriterion("estimated_students_num not between", value1, value2, "estimatedStudentsNum");
      return (Criteria) this;
    }

    public Criteria andCreateByUidIsNull() {
      addCriterion("create_by_uid is null");
      return (Criteria) this;
    }

    public Criteria andCreateByUidIsNotNull() {
      addCriterion("create_by_uid is not null");
      return (Criteria) this;
    }

    public Criteria andCreateByUidEqualTo(String value) {
      addCriterion("create_by_uid =", value, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidNotEqualTo(String value) {
      addCriterion("create_by_uid <>", value, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidGreaterThan(String value) {
      addCriterion("create_by_uid >", value, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidGreaterThanOrEqualTo(String value) {
      addCriterion("create_by_uid >=", value, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidLessThan(String value) {
      addCriterion("create_by_uid <", value, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidLessThanOrEqualTo(String value) {
      addCriterion("create_by_uid <=", value, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidLike(String value) {
      addCriterion("create_by_uid like", value, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidNotLike(String value) {
      addCriterion("create_by_uid not like", value, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidIn(List<String> values) {
      addCriterion("create_by_uid in", values, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidNotIn(List<String> values) {
      addCriterion("create_by_uid not in", values, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidBetween(String value1, String value2) {
      addCriterion("create_by_uid between", value1, value2, "createByUid");
      return (Criteria) this;
    }

    public Criteria andCreateByUidNotBetween(String value1, String value2) {
      addCriterion("create_by_uid not between", value1, value2, "createByUid");
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
      addCriterion("remark_1 is null");
      return (Criteria) this;
    }

    public Criteria andRemark1IsNotNull() {
      addCriterion("remark_1 is not null");
      return (Criteria) this;
    }

    public Criteria andRemark1EqualTo(String value) {
      addCriterion("remark_1 =", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1NotEqualTo(String value) {
      addCriterion("remark_1 <>", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1GreaterThan(String value) {
      addCriterion("remark_1 >", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1GreaterThanOrEqualTo(String value) {
      addCriterion("remark_1 >=", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1LessThan(String value) {
      addCriterion("remark_1 <", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1LessThanOrEqualTo(String value) {
      addCriterion("remark_1 <=", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1Like(String value) {
      addCriterion("remark_1 like", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1NotLike(String value) {
      addCriterion("remark_1 not like", value, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1In(List<String> values) {
      addCriterion("remark_1 in", values, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1NotIn(List<String> values) {
      addCriterion("remark_1 not in", values, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1Between(String value1, String value2) {
      addCriterion("remark_1 between", value1, value2, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark1NotBetween(String value1, String value2) {
      addCriterion("remark_1 not between", value1, value2, "remark1");
      return (Criteria) this;
    }

    public Criteria andRemark2IsNull() {
      addCriterion("remark_2 is null");
      return (Criteria) this;
    }

    public Criteria andRemark2IsNotNull() {
      addCriterion("remark_2 is not null");
      return (Criteria) this;
    }

    public Criteria andRemark2EqualTo(String value) {
      addCriterion("remark_2 =", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2NotEqualTo(String value) {
      addCriterion("remark_2 <>", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2GreaterThan(String value) {
      addCriterion("remark_2 >", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2GreaterThanOrEqualTo(String value) {
      addCriterion("remark_2 >=", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2LessThan(String value) {
      addCriterion("remark_2 <", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2LessThanOrEqualTo(String value) {
      addCriterion("remark_2 <=", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2Like(String value) {
      addCriterion("remark_2 like", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2NotLike(String value) {
      addCriterion("remark_2 not like", value, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2In(List<String> values) {
      addCriterion("remark_2 in", values, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2NotIn(List<String> values) {
      addCriterion("remark_2 not in", values, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2Between(String value1, String value2) {
      addCriterion("remark_2 between", value1, value2, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark2NotBetween(String value1, String value2) {
      addCriterion("remark_2 not between", value1, value2, "remark2");
      return (Criteria) this;
    }

    public Criteria andRemark3IsNull() {
      addCriterion("remark_3 is null");
      return (Criteria) this;
    }

    public Criteria andRemark3IsNotNull() {
      addCriterion("remark_3 is not null");
      return (Criteria) this;
    }

    public Criteria andRemark3EqualTo(String value) {
      addCriterion("remark_3 =", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3NotEqualTo(String value) {
      addCriterion("remark_3 <>", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3GreaterThan(String value) {
      addCriterion("remark_3 >", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3GreaterThanOrEqualTo(String value) {
      addCriterion("remark_3 >=", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3LessThan(String value) {
      addCriterion("remark_3 <", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3LessThanOrEqualTo(String value) {
      addCriterion("remark_3 <=", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3Like(String value) {
      addCriterion("remark_3 like", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3NotLike(String value) {
      addCriterion("remark_3 not like", value, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3In(List<String> values) {
      addCriterion("remark_3 in", values, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3NotIn(List<String> values) {
      addCriterion("remark_3 not in", values, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3Between(String value1, String value2) {
      addCriterion("remark_3 between", value1, value2, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark3NotBetween(String value1, String value2) {
      addCriterion("remark_3 not between", value1, value2, "remark3");
      return (Criteria) this;
    }

    public Criteria andRemark4IsNull() {
      addCriterion("remark_4 is null");
      return (Criteria) this;
    }

    public Criteria andRemark4IsNotNull() {
      addCriterion("remark_4 is not null");
      return (Criteria) this;
    }

    public Criteria andRemark4EqualTo(String value) {
      addCriterion("remark_4 =", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4NotEqualTo(String value) {
      addCriterion("remark_4 <>", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4GreaterThan(String value) {
      addCriterion("remark_4 >", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4GreaterThanOrEqualTo(String value) {
      addCriterion("remark_4 >=", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4LessThan(String value) {
      addCriterion("remark_4 <", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4LessThanOrEqualTo(String value) {
      addCriterion("remark_4 <=", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4Like(String value) {
      addCriterion("remark_4 like", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4NotLike(String value) {
      addCriterion("remark_4 not like", value, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4In(List<String> values) {
      addCriterion("remark_4 in", values, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4NotIn(List<String> values) {
      addCriterion("remark_4 not in", values, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4Between(String value1, String value2) {
      addCriterion("remark_4 between", value1, value2, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark4NotBetween(String value1, String value2) {
      addCriterion("remark_4 not between", value1, value2, "remark4");
      return (Criteria) this;
    }

    public Criteria andRemark5IsNull() {
      addCriterion("remark_5 is null");
      return (Criteria) this;
    }

    public Criteria andRemark5IsNotNull() {
      addCriterion("remark_5 is not null");
      return (Criteria) this;
    }

    public Criteria andRemark5EqualTo(String value) {
      addCriterion("remark_5 =", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5NotEqualTo(String value) {
      addCriterion("remark_5 <>", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5GreaterThan(String value) {
      addCriterion("remark_5 >", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5GreaterThanOrEqualTo(String value) {
      addCriterion("remark_5 >=", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5LessThan(String value) {
      addCriterion("remark_5 <", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5LessThanOrEqualTo(String value) {
      addCriterion("remark_5 <=", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5Like(String value) {
      addCriterion("remark_5 like", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5NotLike(String value) {
      addCriterion("remark_5 not like", value, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5In(List<String> values) {
      addCriterion("remark_5 in", values, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5NotIn(List<String> values) {
      addCriterion("remark_5 not in", values, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5Between(String value1, String value2) {
      addCriterion("remark_5 between", value1, value2, "remark5");
      return (Criteria) this;
    }

    public Criteria andRemark5NotBetween(String value1, String value2) {
      addCriterion("remark_5 not between", value1, value2, "remark5");
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
