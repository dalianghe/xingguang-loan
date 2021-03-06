package com.xingguang.customer.info.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CusUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CusUserInfoExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("id_no is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("id_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("id_no =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("id_no <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("id_no >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_no >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("id_no <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("id_no <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("id_no like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("id_no not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("id_no in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("id_no not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("id_no between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("id_no not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andRealStatusIsNull() {
            addCriterion("real_status is null");
            return (Criteria) this;
        }

        public Criteria andRealStatusIsNotNull() {
            addCriterion("real_status is not null");
            return (Criteria) this;
        }

        public Criteria andRealStatusEqualTo(Integer value) {
            addCriterion("real_status =", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotEqualTo(Integer value) {
            addCriterion("real_status <>", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusGreaterThan(Integer value) {
            addCriterion("real_status >", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_status >=", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusLessThan(Integer value) {
            addCriterion("real_status <", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusLessThanOrEqualTo(Integer value) {
            addCriterion("real_status <=", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusIn(List<Integer> values) {
            addCriterion("real_status in", values, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotIn(List<Integer> values) {
            addCriterion("real_status not in", values, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusBetween(Integer value1, Integer value2) {
            addCriterion("real_status between", value1, value2, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("real_status not between", value1, value2, "realStatus");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Integer value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Integer value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Integer value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Integer value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Integer> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Integer> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Integer value1, Integer value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(Integer value) {
            addCriterion("occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(Integer value) {
            addCriterion("occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(Integer value) {
            addCriterion("occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(Integer value) {
            addCriterion("occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(Integer value) {
            addCriterion("occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(Integer value) {
            addCriterion("occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<Integer> values) {
            addCriterion("occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<Integer> values) {
            addCriterion("occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(Integer value1, Integer value2) {
            addCriterion("occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(Integer value1, Integer value2) {
            addCriterion("occupation not between", value1, value2, "occupation");
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

        public Criteria andWorkUserIdIsNull() {
            addCriterion("work_user_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdIsNotNull() {
            addCriterion("work_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdEqualTo(Long value) {
            addCriterion("work_user_id =", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdNotEqualTo(Long value) {
            addCriterion("work_user_id <>", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdGreaterThan(Long value) {
            addCriterion("work_user_id >", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("work_user_id >=", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdLessThan(Long value) {
            addCriterion("work_user_id <", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdLessThanOrEqualTo(Long value) {
            addCriterion("work_user_id <=", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdIn(List<Long> values) {
            addCriterion("work_user_id in", values, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdNotIn(List<Long> values) {
            addCriterion("work_user_id not in", values, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdBetween(Long value1, Long value2) {
            addCriterion("work_user_id between", value1, value2, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdNotBetween(Long value1, Long value2) {
            addCriterion("work_user_id not between", value1, value2, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameIsNull() {
            addCriterion("work_user_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameIsNotNull() {
            addCriterion("work_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameEqualTo(String value) {
            addCriterion("work_user_name =", value, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameNotEqualTo(String value) {
            addCriterion("work_user_name <>", value, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameGreaterThan(String value) {
            addCriterion("work_user_name >", value, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_user_name >=", value, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameLessThan(String value) {
            addCriterion("work_user_name <", value, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameLessThanOrEqualTo(String value) {
            addCriterion("work_user_name <=", value, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameLike(String value) {
            addCriterion("work_user_name like", value, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameNotLike(String value) {
            addCriterion("work_user_name not like", value, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameIn(List<String> values) {
            addCriterion("work_user_name in", values, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameNotIn(List<String> values) {
            addCriterion("work_user_name not in", values, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameBetween(String value1, String value2) {
            addCriterion("work_user_name between", value1, value2, "workUserName");
            return (Criteria) this;
        }

        public Criteria andWorkUserNameNotBetween(String value1, String value2) {
            addCriterion("work_user_name not between", value1, value2, "workUserName");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIsNull() {
            addCriterion("head_img_url is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIsNotNull() {
            addCriterion("head_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlEqualTo(String value) {
            addCriterion("head_img_url =", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotEqualTo(String value) {
            addCriterion("head_img_url <>", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlGreaterThan(String value) {
            addCriterion("head_img_url >", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("head_img_url >=", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLessThan(String value) {
            addCriterion("head_img_url <", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLessThanOrEqualTo(String value) {
            addCriterion("head_img_url <=", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLike(String value) {
            addCriterion("head_img_url like", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotLike(String value) {
            addCriterion("head_img_url not like", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIn(List<String> values) {
            addCriterion("head_img_url in", values, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotIn(List<String> values) {
            addCriterion("head_img_url not in", values, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlBetween(String value1, String value2) {
            addCriterion("head_img_url between", value1, value2, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotBetween(String value1, String value2) {
            addCriterion("head_img_url not between", value1, value2, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlIsNull() {
            addCriterion("real_img1_url is null");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlIsNotNull() {
            addCriterion("real_img1_url is not null");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlEqualTo(String value) {
            addCriterion("real_img1_url =", value, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlNotEqualTo(String value) {
            addCriterion("real_img1_url <>", value, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlGreaterThan(String value) {
            addCriterion("real_img1_url >", value, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlGreaterThanOrEqualTo(String value) {
            addCriterion("real_img1_url >=", value, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlLessThan(String value) {
            addCriterion("real_img1_url <", value, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlLessThanOrEqualTo(String value) {
            addCriterion("real_img1_url <=", value, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlLike(String value) {
            addCriterion("real_img1_url like", value, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlNotLike(String value) {
            addCriterion("real_img1_url not like", value, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlIn(List<String> values) {
            addCriterion("real_img1_url in", values, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlNotIn(List<String> values) {
            addCriterion("real_img1_url not in", values, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlBetween(String value1, String value2) {
            addCriterion("real_img1_url between", value1, value2, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg1UrlNotBetween(String value1, String value2) {
            addCriterion("real_img1_url not between", value1, value2, "realImg1Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlIsNull() {
            addCriterion("real_img2_url is null");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlIsNotNull() {
            addCriterion("real_img2_url is not null");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlEqualTo(String value) {
            addCriterion("real_img2_url =", value, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlNotEqualTo(String value) {
            addCriterion("real_img2_url <>", value, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlGreaterThan(String value) {
            addCriterion("real_img2_url >", value, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlGreaterThanOrEqualTo(String value) {
            addCriterion("real_img2_url >=", value, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlLessThan(String value) {
            addCriterion("real_img2_url <", value, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlLessThanOrEqualTo(String value) {
            addCriterion("real_img2_url <=", value, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlLike(String value) {
            addCriterion("real_img2_url like", value, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlNotLike(String value) {
            addCriterion("real_img2_url not like", value, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlIn(List<String> values) {
            addCriterion("real_img2_url in", values, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlNotIn(List<String> values) {
            addCriterion("real_img2_url not in", values, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlBetween(String value1, String value2) {
            addCriterion("real_img2_url between", value1, value2, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg2UrlNotBetween(String value1, String value2) {
            addCriterion("real_img2_url not between", value1, value2, "realImg2Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlIsNull() {
            addCriterion("real_img3_url is null");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlIsNotNull() {
            addCriterion("real_img3_url is not null");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlEqualTo(String value) {
            addCriterion("real_img3_url =", value, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlNotEqualTo(String value) {
            addCriterion("real_img3_url <>", value, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlGreaterThan(String value) {
            addCriterion("real_img3_url >", value, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlGreaterThanOrEqualTo(String value) {
            addCriterion("real_img3_url >=", value, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlLessThan(String value) {
            addCriterion("real_img3_url <", value, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlLessThanOrEqualTo(String value) {
            addCriterion("real_img3_url <=", value, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlLike(String value) {
            addCriterion("real_img3_url like", value, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlNotLike(String value) {
            addCriterion("real_img3_url not like", value, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlIn(List<String> values) {
            addCriterion("real_img3_url in", values, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlNotIn(List<String> values) {
            addCriterion("real_img3_url not in", values, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlBetween(String value1, String value2) {
            addCriterion("real_img3_url between", value1, value2, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andRealImg3UrlNotBetween(String value1, String value2) {
            addCriterion("real_img3_url not between", value1, value2, "realImg3Url");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andHomeAddrIsNull() {
            addCriterion("home_addr is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddrIsNotNull() {
            addCriterion("home_addr is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddrEqualTo(String value) {
            addCriterion("home_addr =", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotEqualTo(String value) {
            addCriterion("home_addr <>", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrGreaterThan(String value) {
            addCriterion("home_addr >", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrGreaterThanOrEqualTo(String value) {
            addCriterion("home_addr >=", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrLessThan(String value) {
            addCriterion("home_addr <", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrLessThanOrEqualTo(String value) {
            addCriterion("home_addr <=", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrLike(String value) {
            addCriterion("home_addr like", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotLike(String value) {
            addCriterion("home_addr not like", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrIn(List<String> values) {
            addCriterion("home_addr in", values, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotIn(List<String> values) {
            addCriterion("home_addr not in", values, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrBetween(String value1, String value2) {
            addCriterion("home_addr between", value1, value2, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotBetween(String value1, String value2) {
            addCriterion("home_addr not between", value1, value2, "homeAddr");
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

        public Criteria andCompanyAddrIsNull() {
            addCriterion("company_addr is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIsNotNull() {
            addCriterion("company_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrEqualTo(String value) {
            addCriterion("company_addr =", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotEqualTo(String value) {
            addCriterion("company_addr <>", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrGreaterThan(String value) {
            addCriterion("company_addr >", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("company_addr >=", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLessThan(String value) {
            addCriterion("company_addr <", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLessThanOrEqualTo(String value) {
            addCriterion("company_addr <=", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrLike(String value) {
            addCriterion("company_addr like", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotLike(String value) {
            addCriterion("company_addr not like", value, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrIn(List<String> values) {
            addCriterion("company_addr in", values, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotIn(List<String> values) {
            addCriterion("company_addr not in", values, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrBetween(String value1, String value2) {
            addCriterion("company_addr between", value1, value2, "companyAddr");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrNotBetween(String value1, String value2) {
            addCriterion("company_addr not between", value1, value2, "companyAddr");
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