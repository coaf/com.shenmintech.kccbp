package com.shenmintech.cbp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TKcEmployeeExample {
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

  public TKcEmployeeExample() {
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

    public Criteria andUserIdIsNull() {
      addCriterion("user_id is null");
      return (Criteria) this;
    }

    public Criteria andUserIdIsNotNull() {
      addCriterion("user_id is not null");
      return (Criteria) this;
    }

    public Criteria andUserIdEqualTo(String value) {
      addCriterion("user_id =", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotEqualTo(String value) {
      addCriterion("user_id <>", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdGreaterThan(String value) {
      addCriterion("user_id >", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdGreaterThanOrEqualTo(String value) {
      addCriterion("user_id >=", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdLessThan(String value) {
      addCriterion("user_id <", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdLessThanOrEqualTo(String value) {
      addCriterion("user_id <=", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdLike(String value) {
      addCriterion("user_id like", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotLike(String value) {
      addCriterion("user_id not like", value, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdIn(List<String> values) {
      addCriterion("user_id in", values, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotIn(List<String> values) {
      addCriterion("user_id not in", values, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdBetween(String value1, String value2) {
      addCriterion("user_id between", value1, value2, "userId");
      return (Criteria) this;
    }

    public Criteria andUserIdNotBetween(String value1, String value2) {
      addCriterion("user_id not between", value1, value2, "userId");
      return (Criteria) this;
    }

    public Criteria andCompanyFidIsNull() {
      addCriterion("company_fid is null");
      return (Criteria) this;
    }

    public Criteria andCompanyFidIsNotNull() {
      addCriterion("company_fid is not null");
      return (Criteria) this;
    }

    public Criteria andCompanyFidEqualTo(String value) {
      addCriterion("company_fid =", value, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidNotEqualTo(String value) {
      addCriterion("company_fid <>", value, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidGreaterThan(String value) {
      addCriterion("company_fid >", value, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidGreaterThanOrEqualTo(String value) {
      addCriterion("company_fid >=", value, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidLessThan(String value) {
      addCriterion("company_fid <", value, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidLessThanOrEqualTo(String value) {
      addCriterion("company_fid <=", value, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidLike(String value) {
      addCriterion("company_fid like", value, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidNotLike(String value) {
      addCriterion("company_fid not like", value, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidIn(List<String> values) {
      addCriterion("company_fid in", values, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidNotIn(List<String> values) {
      addCriterion("company_fid not in", values, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidBetween(String value1, String value2) {
      addCriterion("company_fid between", value1, value2, "companyFid");
      return (Criteria) this;
    }

    public Criteria andCompanyFidNotBetween(String value1, String value2) {
      addCriterion("company_fid not between", value1, value2, "companyFid");
      return (Criteria) this;
    }

    public Criteria andRealNameIsNull() {
      addCriterion("real_name is null");
      return (Criteria) this;
    }

    public Criteria andRealNameIsNotNull() {
      addCriterion("real_name is not null");
      return (Criteria) this;
    }

    public Criteria andRealNameEqualTo(String value) {
      addCriterion("real_name =", value, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameNotEqualTo(String value) {
      addCriterion("real_name <>", value, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameGreaterThan(String value) {
      addCriterion("real_name >", value, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameGreaterThanOrEqualTo(String value) {
      addCriterion("real_name >=", value, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameLessThan(String value) {
      addCriterion("real_name <", value, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameLessThanOrEqualTo(String value) {
      addCriterion("real_name <=", value, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameLike(String value) {
      addCriterion("real_name like", value, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameNotLike(String value) {
      addCriterion("real_name not like", value, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameIn(List<String> values) {
      addCriterion("real_name in", values, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameNotIn(List<String> values) {
      addCriterion("real_name not in", values, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameBetween(String value1, String value2) {
      addCriterion("real_name between", value1, value2, "realName");
      return (Criteria) this;
    }

    public Criteria andRealNameNotBetween(String value1, String value2) {
      addCriterion("real_name not between", value1, value2, "realName");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoIsNull() {
      addCriterion("employee_no is null");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoIsNotNull() {
      addCriterion("employee_no is not null");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoEqualTo(String value) {
      addCriterion("employee_no =", value, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoNotEqualTo(String value) {
      addCriterion("employee_no <>", value, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoGreaterThan(String value) {
      addCriterion("employee_no >", value, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoGreaterThanOrEqualTo(String value) {
      addCriterion("employee_no >=", value, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoLessThan(String value) {
      addCriterion("employee_no <", value, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoLessThanOrEqualTo(String value) {
      addCriterion("employee_no <=", value, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoLike(String value) {
      addCriterion("employee_no like", value, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoNotLike(String value) {
      addCriterion("employee_no not like", value, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoIn(List<String> values) {
      addCriterion("employee_no in", values, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoNotIn(List<String> values) {
      addCriterion("employee_no not in", values, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoBetween(String value1, String value2) {
      addCriterion("employee_no between", value1, value2, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andEmployeeNoNotBetween(String value1, String value2) {
      addCriterion("employee_no not between", value1, value2, "employeeNo");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdIsNull() {
      addCriterion("ntes_acc_id is null");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdIsNotNull() {
      addCriterion("ntes_acc_id is not null");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdEqualTo(String value) {
      addCriterion("ntes_acc_id =", value, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdNotEqualTo(String value) {
      addCriterion("ntes_acc_id <>", value, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdGreaterThan(String value) {
      addCriterion("ntes_acc_id >", value, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdGreaterThanOrEqualTo(String value) {
      addCriterion("ntes_acc_id >=", value, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdLessThan(String value) {
      addCriterion("ntes_acc_id <", value, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdLessThanOrEqualTo(String value) {
      addCriterion("ntes_acc_id <=", value, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdLike(String value) {
      addCriterion("ntes_acc_id like", value, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdNotLike(String value) {
      addCriterion("ntes_acc_id not like", value, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdIn(List<String> values) {
      addCriterion("ntes_acc_id in", values, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdNotIn(List<String> values) {
      addCriterion("ntes_acc_id not in", values, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdBetween(String value1, String value2) {
      addCriterion("ntes_acc_id between", value1, value2, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesAccIdNotBetween(String value1, String value2) {
      addCriterion("ntes_acc_id not between", value1, value2, "ntesAccId");
      return (Criteria) this;
    }

    public Criteria andNtesTokenIsNull() {
      addCriterion("ntes_token is null");
      return (Criteria) this;
    }

    public Criteria andNtesTokenIsNotNull() {
      addCriterion("ntes_token is not null");
      return (Criteria) this;
    }

    public Criteria andNtesTokenEqualTo(String value) {
      addCriterion("ntes_token =", value, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenNotEqualTo(String value) {
      addCriterion("ntes_token <>", value, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenGreaterThan(String value) {
      addCriterion("ntes_token >", value, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenGreaterThanOrEqualTo(String value) {
      addCriterion("ntes_token >=", value, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenLessThan(String value) {
      addCriterion("ntes_token <", value, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenLessThanOrEqualTo(String value) {
      addCriterion("ntes_token <=", value, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenLike(String value) {
      addCriterion("ntes_token like", value, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenNotLike(String value) {
      addCriterion("ntes_token not like", value, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenIn(List<String> values) {
      addCriterion("ntes_token in", values, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenNotIn(List<String> values) {
      addCriterion("ntes_token not in", values, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenBetween(String value1, String value2) {
      addCriterion("ntes_token between", value1, value2, "ntesToken");
      return (Criteria) this;
    }

    public Criteria andNtesTokenNotBetween(String value1, String value2) {
      addCriterion("ntes_token not between", value1, value2, "ntesToken");
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
