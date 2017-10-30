package com.xingguang.customer.credit.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CreditApplyExample() {
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

        public Criteria andApplyNoIsNull() {
            addCriterion("apply_no is null");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNotNull() {
            addCriterion("apply_no is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNoEqualTo(String value) {
            addCriterion("apply_no =", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotEqualTo(String value) {
            addCriterion("apply_no <>", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThan(String value) {
            addCriterion("apply_no >", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThanOrEqualTo(String value) {
            addCriterion("apply_no >=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThan(String value) {
            addCriterion("apply_no <", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThanOrEqualTo(String value) {
            addCriterion("apply_no <=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLike(String value) {
            addCriterion("apply_no like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotLike(String value) {
            addCriterion("apply_no not like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoIn(List<String> values) {
            addCriterion("apply_no in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotIn(List<String> values) {
            addCriterion("apply_no not in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoBetween(String value1, String value2) {
            addCriterion("apply_no between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotBetween(String value1, String value2) {
            addCriterion("apply_no not between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andCusUserIdIsNull() {
            addCriterion("cus_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCusUserIdIsNotNull() {
            addCriterion("cus_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusUserIdEqualTo(Long value) {
            addCriterion("cus_user_id =", value, "cusUserId");
            return (Criteria) this;
        }

        public Criteria andCusUserIdNotEqualTo(Long value) {
            addCriterion("cus_user_id <>", value, "cusUserId");
            return (Criteria) this;
        }

        public Criteria andCusUserIdGreaterThan(Long value) {
            addCriterion("cus_user_id >", value, "cusUserId");
            return (Criteria) this;
        }

        public Criteria andCusUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cus_user_id >=", value, "cusUserId");
            return (Criteria) this;
        }

        public Criteria andCusUserIdLessThan(Long value) {
            addCriterion("cus_user_id <", value, "cusUserId");
            return (Criteria) this;
        }

        public Criteria andCusUserIdLessThanOrEqualTo(Long value) {
            addCriterion("cus_user_id <=", value, "cusUserId");
            return (Criteria) this;
        }

        public Criteria andCusUserIdIn(List<Long> values) {
            addCriterion("cus_user_id in", values, "cusUserId");
            return (Criteria) this;
        }

        public Criteria andCusUserIdNotIn(List<Long> values) {
            addCriterion("cus_user_id not in", values, "cusUserId");
            return (Criteria) this;
        }

        public Criteria andCusUserIdBetween(Long value1, Long value2) {
            addCriterion("cus_user_id between", value1, value2, "cusUserId");
            return (Criteria) this;
        }

        public Criteria andCusUserIdNotBetween(Long value1, Long value2) {
            addCriterion("cus_user_id not between", value1, value2, "cusUserId");
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andTermIdIsNull() {
            addCriterion("term_id is null");
            return (Criteria) this;
        }

        public Criteria andTermIdIsNotNull() {
            addCriterion("term_id is not null");
            return (Criteria) this;
        }

        public Criteria andTermIdEqualTo(Long value) {
            addCriterion("term_id =", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotEqualTo(Long value) {
            addCriterion("term_id <>", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdGreaterThan(Long value) {
            addCriterion("term_id >", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdGreaterThanOrEqualTo(Long value) {
            addCriterion("term_id >=", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLessThan(Long value) {
            addCriterion("term_id <", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdLessThanOrEqualTo(Long value) {
            addCriterion("term_id <=", value, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdIn(List<Long> values) {
            addCriterion("term_id in", values, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotIn(List<Long> values) {
            addCriterion("term_id not in", values, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdBetween(Long value1, Long value2) {
            addCriterion("term_id between", value1, value2, "termId");
            return (Criteria) this;
        }

        public Criteria andTermIdNotBetween(Long value1, Long value2) {
            addCriterion("term_id not between", value1, value2, "termId");
            return (Criteria) this;
        }

        public Criteria andCreditTimeIsNull() {
            addCriterion("credit_time is null");
            return (Criteria) this;
        }

        public Criteria andCreditTimeIsNotNull() {
            addCriterion("credit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreditTimeEqualTo(Date value) {
            addCriterion("credit_time =", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeNotEqualTo(Date value) {
            addCriterion("credit_time <>", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeGreaterThan(Date value) {
            addCriterion("credit_time >", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("credit_time >=", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeLessThan(Date value) {
            addCriterion("credit_time <", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeLessThanOrEqualTo(Date value) {
            addCriterion("credit_time <=", value, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeIn(List<Date> values) {
            addCriterion("credit_time in", values, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeNotIn(List<Date> values) {
            addCriterion("credit_time not in", values, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeBetween(Date value1, Date value2) {
            addCriterion("credit_time between", value1, value2, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditTimeNotBetween(Date value1, Date value2) {
            addCriterion("credit_time not between", value1, value2, "creditTime");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdIsNull() {
            addCriterion("credit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdIsNotNull() {
            addCriterion("credit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdEqualTo(Long value) {
            addCriterion("credit_user_id =", value, "creditUserId");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdNotEqualTo(Long value) {
            addCriterion("credit_user_id <>", value, "creditUserId");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdGreaterThan(Long value) {
            addCriterion("credit_user_id >", value, "creditUserId");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_user_id >=", value, "creditUserId");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdLessThan(Long value) {
            addCriterion("credit_user_id <", value, "creditUserId");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdLessThanOrEqualTo(Long value) {
            addCriterion("credit_user_id <=", value, "creditUserId");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdIn(List<Long> values) {
            addCriterion("credit_user_id in", values, "creditUserId");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdNotIn(List<Long> values) {
            addCriterion("credit_user_id not in", values, "creditUserId");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdBetween(Long value1, Long value2) {
            addCriterion("credit_user_id between", value1, value2, "creditUserId");
            return (Criteria) this;
        }

        public Criteria andCreditUserIdNotBetween(Long value1, Long value2) {
            addCriterion("credit_user_id not between", value1, value2, "creditUserId");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameIsNull() {
            addCriterion("credit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameIsNotNull() {
            addCriterion("credit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameEqualTo(String value) {
            addCriterion("credit_user_name =", value, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameNotEqualTo(String value) {
            addCriterion("credit_user_name <>", value, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameGreaterThan(String value) {
            addCriterion("credit_user_name >", value, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("credit_user_name >=", value, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameLessThan(String value) {
            addCriterion("credit_user_name <", value, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameLessThanOrEqualTo(String value) {
            addCriterion("credit_user_name <=", value, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameLike(String value) {
            addCriterion("credit_user_name like", value, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameNotLike(String value) {
            addCriterion("credit_user_name not like", value, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameIn(List<String> values) {
            addCriterion("credit_user_name in", values, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameNotIn(List<String> values) {
            addCriterion("credit_user_name not in", values, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameBetween(String value1, String value2) {
            addCriterion("credit_user_name between", value1, value2, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andCreditUserNameNotBetween(String value1, String value2) {
            addCriterion("credit_user_name not between", value1, value2, "creditUserName");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeIsNull() {
            addCriterion("refuse_code is null");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeIsNotNull() {
            addCriterion("refuse_code is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeEqualTo(String value) {
            addCriterion("refuse_code =", value, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeNotEqualTo(String value) {
            addCriterion("refuse_code <>", value, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeGreaterThan(String value) {
            addCriterion("refuse_code >", value, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("refuse_code >=", value, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeLessThan(String value) {
            addCriterion("refuse_code <", value, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeLessThanOrEqualTo(String value) {
            addCriterion("refuse_code <=", value, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeLike(String value) {
            addCriterion("refuse_code like", value, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeNotLike(String value) {
            addCriterion("refuse_code not like", value, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeIn(List<String> values) {
            addCriterion("refuse_code in", values, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeNotIn(List<String> values) {
            addCriterion("refuse_code not in", values, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeBetween(String value1, String value2) {
            addCriterion("refuse_code between", value1, value2, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andRefuseCodeNotBetween(String value1, String value2) {
            addCriterion("refuse_code not between", value1, value2, "refuseCode");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkIsNull() {
            addCriterion("credit_remark is null");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkIsNotNull() {
            addCriterion("credit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkEqualTo(String value) {
            addCriterion("credit_remark =", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotEqualTo(String value) {
            addCriterion("credit_remark <>", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkGreaterThan(String value) {
            addCriterion("credit_remark >", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("credit_remark >=", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkLessThan(String value) {
            addCriterion("credit_remark <", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkLessThanOrEqualTo(String value) {
            addCriterion("credit_remark <=", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkLike(String value) {
            addCriterion("credit_remark like", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotLike(String value) {
            addCriterion("credit_remark not like", value, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkIn(List<String> values) {
            addCriterion("credit_remark in", values, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotIn(List<String> values) {
            addCriterion("credit_remark not in", values, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkBetween(String value1, String value2) {
            addCriterion("credit_remark between", value1, value2, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCreditRemarkNotBetween(String value1, String value2) {
            addCriterion("credit_remark not between", value1, value2, "creditRemark");
            return (Criteria) this;
        }

        public Criteria andCusLngIsNull() {
            addCriterion("cus_lng is null");
            return (Criteria) this;
        }

        public Criteria andCusLngIsNotNull() {
            addCriterion("cus_lng is not null");
            return (Criteria) this;
        }

        public Criteria andCusLngEqualTo(String value) {
            addCriterion("cus_lng =", value, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngNotEqualTo(String value) {
            addCriterion("cus_lng <>", value, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngGreaterThan(String value) {
            addCriterion("cus_lng >", value, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngGreaterThanOrEqualTo(String value) {
            addCriterion("cus_lng >=", value, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngLessThan(String value) {
            addCriterion("cus_lng <", value, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngLessThanOrEqualTo(String value) {
            addCriterion("cus_lng <=", value, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngLike(String value) {
            addCriterion("cus_lng like", value, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngNotLike(String value) {
            addCriterion("cus_lng not like", value, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngIn(List<String> values) {
            addCriterion("cus_lng in", values, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngNotIn(List<String> values) {
            addCriterion("cus_lng not in", values, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngBetween(String value1, String value2) {
            addCriterion("cus_lng between", value1, value2, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLngNotBetween(String value1, String value2) {
            addCriterion("cus_lng not between", value1, value2, "cusLng");
            return (Criteria) this;
        }

        public Criteria andCusLatIsNull() {
            addCriterion("cus_lat is null");
            return (Criteria) this;
        }

        public Criteria andCusLatIsNotNull() {
            addCriterion("cus_lat is not null");
            return (Criteria) this;
        }

        public Criteria andCusLatEqualTo(String value) {
            addCriterion("cus_lat =", value, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatNotEqualTo(String value) {
            addCriterion("cus_lat <>", value, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatGreaterThan(String value) {
            addCriterion("cus_lat >", value, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatGreaterThanOrEqualTo(String value) {
            addCriterion("cus_lat >=", value, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatLessThan(String value) {
            addCriterion("cus_lat <", value, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatLessThanOrEqualTo(String value) {
            addCriterion("cus_lat <=", value, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatLike(String value) {
            addCriterion("cus_lat like", value, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatNotLike(String value) {
            addCriterion("cus_lat not like", value, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatIn(List<String> values) {
            addCriterion("cus_lat in", values, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatNotIn(List<String> values) {
            addCriterion("cus_lat not in", values, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatBetween(String value1, String value2) {
            addCriterion("cus_lat between", value1, value2, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusLatNotBetween(String value1, String value2) {
            addCriterion("cus_lat not between", value1, value2, "cusLat");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdIsNull() {
            addCriterion("cus_province_id is null");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdIsNotNull() {
            addCriterion("cus_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdEqualTo(Long value) {
            addCriterion("cus_province_id =", value, "cusProvinceId");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdNotEqualTo(Long value) {
            addCriterion("cus_province_id <>", value, "cusProvinceId");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdGreaterThan(Long value) {
            addCriterion("cus_province_id >", value, "cusProvinceId");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cus_province_id >=", value, "cusProvinceId");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdLessThan(Long value) {
            addCriterion("cus_province_id <", value, "cusProvinceId");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("cus_province_id <=", value, "cusProvinceId");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdIn(List<Long> values) {
            addCriterion("cus_province_id in", values, "cusProvinceId");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdNotIn(List<Long> values) {
            addCriterion("cus_province_id not in", values, "cusProvinceId");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdBetween(Long value1, Long value2) {
            addCriterion("cus_province_id between", value1, value2, "cusProvinceId");
            return (Criteria) this;
        }

        public Criteria andCusProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("cus_province_id not between", value1, value2, "cusProvinceId");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameIsNull() {
            addCriterion("cus_province_name is null");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameIsNotNull() {
            addCriterion("cus_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameEqualTo(String value) {
            addCriterion("cus_province_name =", value, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameNotEqualTo(String value) {
            addCriterion("cus_province_name <>", value, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameGreaterThan(String value) {
            addCriterion("cus_province_name >", value, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_province_name >=", value, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameLessThan(String value) {
            addCriterion("cus_province_name <", value, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("cus_province_name <=", value, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameLike(String value) {
            addCriterion("cus_province_name like", value, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameNotLike(String value) {
            addCriterion("cus_province_name not like", value, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameIn(List<String> values) {
            addCriterion("cus_province_name in", values, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameNotIn(List<String> values) {
            addCriterion("cus_province_name not in", values, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameBetween(String value1, String value2) {
            addCriterion("cus_province_name between", value1, value2, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusProvinceNameNotBetween(String value1, String value2) {
            addCriterion("cus_province_name not between", value1, value2, "cusProvinceName");
            return (Criteria) this;
        }

        public Criteria andCusCityIdIsNull() {
            addCriterion("cus_city_id is null");
            return (Criteria) this;
        }

        public Criteria andCusCityIdIsNotNull() {
            addCriterion("cus_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusCityIdEqualTo(Long value) {
            addCriterion("cus_city_id =", value, "cusCityId");
            return (Criteria) this;
        }

        public Criteria andCusCityIdNotEqualTo(Long value) {
            addCriterion("cus_city_id <>", value, "cusCityId");
            return (Criteria) this;
        }

        public Criteria andCusCityIdGreaterThan(Long value) {
            addCriterion("cus_city_id >", value, "cusCityId");
            return (Criteria) this;
        }

        public Criteria andCusCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cus_city_id >=", value, "cusCityId");
            return (Criteria) this;
        }

        public Criteria andCusCityIdLessThan(Long value) {
            addCriterion("cus_city_id <", value, "cusCityId");
            return (Criteria) this;
        }

        public Criteria andCusCityIdLessThanOrEqualTo(Long value) {
            addCriterion("cus_city_id <=", value, "cusCityId");
            return (Criteria) this;
        }

        public Criteria andCusCityIdIn(List<Long> values) {
            addCriterion("cus_city_id in", values, "cusCityId");
            return (Criteria) this;
        }

        public Criteria andCusCityIdNotIn(List<Long> values) {
            addCriterion("cus_city_id not in", values, "cusCityId");
            return (Criteria) this;
        }

        public Criteria andCusCityIdBetween(Long value1, Long value2) {
            addCriterion("cus_city_id between", value1, value2, "cusCityId");
            return (Criteria) this;
        }

        public Criteria andCusCityIdNotBetween(Long value1, Long value2) {
            addCriterion("cus_city_id not between", value1, value2, "cusCityId");
            return (Criteria) this;
        }

        public Criteria andCusCityNameIsNull() {
            addCriterion("cus_city_name is null");
            return (Criteria) this;
        }

        public Criteria andCusCityNameIsNotNull() {
            addCriterion("cus_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusCityNameEqualTo(String value) {
            addCriterion("cus_city_name =", value, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameNotEqualTo(String value) {
            addCriterion("cus_city_name <>", value, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameGreaterThan(String value) {
            addCriterion("cus_city_name >", value, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_city_name >=", value, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameLessThan(String value) {
            addCriterion("cus_city_name <", value, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameLessThanOrEqualTo(String value) {
            addCriterion("cus_city_name <=", value, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameLike(String value) {
            addCriterion("cus_city_name like", value, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameNotLike(String value) {
            addCriterion("cus_city_name not like", value, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameIn(List<String> values) {
            addCriterion("cus_city_name in", values, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameNotIn(List<String> values) {
            addCriterion("cus_city_name not in", values, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameBetween(String value1, String value2) {
            addCriterion("cus_city_name between", value1, value2, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusCityNameNotBetween(String value1, String value2) {
            addCriterion("cus_city_name not between", value1, value2, "cusCityName");
            return (Criteria) this;
        }

        public Criteria andCusAddrIsNull() {
            addCriterion("cus_addr is null");
            return (Criteria) this;
        }

        public Criteria andCusAddrIsNotNull() {
            addCriterion("cus_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCusAddrEqualTo(String value) {
            addCriterion("cus_addr =", value, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrNotEqualTo(String value) {
            addCriterion("cus_addr <>", value, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrGreaterThan(String value) {
            addCriterion("cus_addr >", value, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrGreaterThanOrEqualTo(String value) {
            addCriterion("cus_addr >=", value, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrLessThan(String value) {
            addCriterion("cus_addr <", value, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrLessThanOrEqualTo(String value) {
            addCriterion("cus_addr <=", value, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrLike(String value) {
            addCriterion("cus_addr like", value, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrNotLike(String value) {
            addCriterion("cus_addr not like", value, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrIn(List<String> values) {
            addCriterion("cus_addr in", values, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrNotIn(List<String> values) {
            addCriterion("cus_addr not in", values, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrBetween(String value1, String value2) {
            addCriterion("cus_addr between", value1, value2, "cusAddr");
            return (Criteria) this;
        }

        public Criteria andCusAddrNotBetween(String value1, String value2) {
            addCriterion("cus_addr not between", value1, value2, "cusAddr");
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

        public Criteria andWorkLngIsNull() {
            addCriterion("work_lng is null");
            return (Criteria) this;
        }

        public Criteria andWorkLngIsNotNull() {
            addCriterion("work_lng is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLngEqualTo(String value) {
            addCriterion("work_lng =", value, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngNotEqualTo(String value) {
            addCriterion("work_lng <>", value, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngGreaterThan(String value) {
            addCriterion("work_lng >", value, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngGreaterThanOrEqualTo(String value) {
            addCriterion("work_lng >=", value, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngLessThan(String value) {
            addCriterion("work_lng <", value, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngLessThanOrEqualTo(String value) {
            addCriterion("work_lng <=", value, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngLike(String value) {
            addCriterion("work_lng like", value, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngNotLike(String value) {
            addCriterion("work_lng not like", value, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngIn(List<String> values) {
            addCriterion("work_lng in", values, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngNotIn(List<String> values) {
            addCriterion("work_lng not in", values, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngBetween(String value1, String value2) {
            addCriterion("work_lng between", value1, value2, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLngNotBetween(String value1, String value2) {
            addCriterion("work_lng not between", value1, value2, "workLng");
            return (Criteria) this;
        }

        public Criteria andWorkLatIsNull() {
            addCriterion("work_lat is null");
            return (Criteria) this;
        }

        public Criteria andWorkLatIsNotNull() {
            addCriterion("work_lat is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLatEqualTo(String value) {
            addCriterion("work_lat =", value, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatNotEqualTo(String value) {
            addCriterion("work_lat <>", value, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatGreaterThan(String value) {
            addCriterion("work_lat >", value, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatGreaterThanOrEqualTo(String value) {
            addCriterion("work_lat >=", value, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatLessThan(String value) {
            addCriterion("work_lat <", value, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatLessThanOrEqualTo(String value) {
            addCriterion("work_lat <=", value, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatLike(String value) {
            addCriterion("work_lat like", value, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatNotLike(String value) {
            addCriterion("work_lat not like", value, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatIn(List<String> values) {
            addCriterion("work_lat in", values, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatNotIn(List<String> values) {
            addCriterion("work_lat not in", values, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatBetween(String value1, String value2) {
            addCriterion("work_lat between", value1, value2, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkLatNotBetween(String value1, String value2) {
            addCriterion("work_lat not between", value1, value2, "workLat");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdIsNull() {
            addCriterion("work_province_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdIsNotNull() {
            addCriterion("work_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdEqualTo(Long value) {
            addCriterion("work_province_id =", value, "workProvinceId");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdNotEqualTo(Long value) {
            addCriterion("work_province_id <>", value, "workProvinceId");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdGreaterThan(Long value) {
            addCriterion("work_province_id >", value, "workProvinceId");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("work_province_id >=", value, "workProvinceId");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdLessThan(Long value) {
            addCriterion("work_province_id <", value, "workProvinceId");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("work_province_id <=", value, "workProvinceId");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdIn(List<Long> values) {
            addCriterion("work_province_id in", values, "workProvinceId");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdNotIn(List<Long> values) {
            addCriterion("work_province_id not in", values, "workProvinceId");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdBetween(Long value1, Long value2) {
            addCriterion("work_province_id between", value1, value2, "workProvinceId");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("work_province_id not between", value1, value2, "workProvinceId");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameIsNull() {
            addCriterion("work_province_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameIsNotNull() {
            addCriterion("work_province_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameEqualTo(String value) {
            addCriterion("work_province_name =", value, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameNotEqualTo(String value) {
            addCriterion("work_province_name <>", value, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameGreaterThan(String value) {
            addCriterion("work_province_name >", value, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_province_name >=", value, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameLessThan(String value) {
            addCriterion("work_province_name <", value, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("work_province_name <=", value, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameLike(String value) {
            addCriterion("work_province_name like", value, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameNotLike(String value) {
            addCriterion("work_province_name not like", value, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameIn(List<String> values) {
            addCriterion("work_province_name in", values, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameNotIn(List<String> values) {
            addCriterion("work_province_name not in", values, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameBetween(String value1, String value2) {
            addCriterion("work_province_name between", value1, value2, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkProvinceNameNotBetween(String value1, String value2) {
            addCriterion("work_province_name not between", value1, value2, "workProvinceName");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdIsNull() {
            addCriterion("work_city_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdIsNotNull() {
            addCriterion("work_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdEqualTo(Long value) {
            addCriterion("work_city_id =", value, "workCityId");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdNotEqualTo(Long value) {
            addCriterion("work_city_id <>", value, "workCityId");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdGreaterThan(Long value) {
            addCriterion("work_city_id >", value, "workCityId");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("work_city_id >=", value, "workCityId");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdLessThan(Long value) {
            addCriterion("work_city_id <", value, "workCityId");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdLessThanOrEqualTo(Long value) {
            addCriterion("work_city_id <=", value, "workCityId");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdIn(List<Long> values) {
            addCriterion("work_city_id in", values, "workCityId");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdNotIn(List<Long> values) {
            addCriterion("work_city_id not in", values, "workCityId");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdBetween(Long value1, Long value2) {
            addCriterion("work_city_id between", value1, value2, "workCityId");
            return (Criteria) this;
        }

        public Criteria andWorkCityIdNotBetween(Long value1, Long value2) {
            addCriterion("work_city_id not between", value1, value2, "workCityId");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameIsNull() {
            addCriterion("work_city_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameIsNotNull() {
            addCriterion("work_city_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameEqualTo(String value) {
            addCriterion("work_city_name =", value, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameNotEqualTo(String value) {
            addCriterion("work_city_name <>", value, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameGreaterThan(String value) {
            addCriterion("work_city_name >", value, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_city_name >=", value, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameLessThan(String value) {
            addCriterion("work_city_name <", value, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameLessThanOrEqualTo(String value) {
            addCriterion("work_city_name <=", value, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameLike(String value) {
            addCriterion("work_city_name like", value, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameNotLike(String value) {
            addCriterion("work_city_name not like", value, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameIn(List<String> values) {
            addCriterion("work_city_name in", values, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameNotIn(List<String> values) {
            addCriterion("work_city_name not in", values, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameBetween(String value1, String value2) {
            addCriterion("work_city_name between", value1, value2, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkCityNameNotBetween(String value1, String value2) {
            addCriterion("work_city_name not between", value1, value2, "workCityName");
            return (Criteria) this;
        }

        public Criteria andWorkAddrIsNull() {
            addCriterion("work_addr is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddrIsNotNull() {
            addCriterion("work_addr is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddrEqualTo(String value) {
            addCriterion("work_addr =", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrNotEqualTo(String value) {
            addCriterion("work_addr <>", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrGreaterThan(String value) {
            addCriterion("work_addr >", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrGreaterThanOrEqualTo(String value) {
            addCriterion("work_addr >=", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLessThan(String value) {
            addCriterion("work_addr <", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLessThanOrEqualTo(String value) {
            addCriterion("work_addr <=", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLike(String value) {
            addCriterion("work_addr like", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrNotLike(String value) {
            addCriterion("work_addr not like", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrIn(List<String> values) {
            addCriterion("work_addr in", values, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrNotIn(List<String> values) {
            addCriterion("work_addr not in", values, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrBetween(String value1, String value2) {
            addCriterion("work_addr between", value1, value2, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrNotBetween(String value1, String value2) {
            addCriterion("work_addr not between", value1, value2, "workAddr");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceIsNull() {
            addCriterion("cus_work_distance is null");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceIsNotNull() {
            addCriterion("cus_work_distance is not null");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceEqualTo(String value) {
            addCriterion("cus_work_distance =", value, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceNotEqualTo(String value) {
            addCriterion("cus_work_distance <>", value, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceGreaterThan(String value) {
            addCriterion("cus_work_distance >", value, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceGreaterThanOrEqualTo(String value) {
            addCriterion("cus_work_distance >=", value, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceLessThan(String value) {
            addCriterion("cus_work_distance <", value, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceLessThanOrEqualTo(String value) {
            addCriterion("cus_work_distance <=", value, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceLike(String value) {
            addCriterion("cus_work_distance like", value, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceNotLike(String value) {
            addCriterion("cus_work_distance not like", value, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceIn(List<String> values) {
            addCriterion("cus_work_distance in", values, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceNotIn(List<String> values) {
            addCriterion("cus_work_distance not in", values, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceBetween(String value1, String value2) {
            addCriterion("cus_work_distance between", value1, value2, "cusWorkDistance");
            return (Criteria) this;
        }

        public Criteria andCusWorkDistanceNotBetween(String value1, String value2) {
            addCriterion("cus_work_distance not between", value1, value2, "cusWorkDistance");
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