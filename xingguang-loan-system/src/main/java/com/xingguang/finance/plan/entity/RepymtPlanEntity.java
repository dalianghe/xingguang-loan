package com.xingguang.finance.plan.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by admin on 2017/10/23.
 */
public class RepymtPlanEntity implements Serializable {

    private Long id;
    private Long wdrlId; // 提款ID
    private Long cusUserId; // 客户ID
    private Integer term; // 期数
    private BigDecimal principal; // 本金
    private BigDecimal interest; // 利息
    @JSONField(format="yyyy-MM-dd")
    private Date planDate; // 计划还款日期
    @JSONField(format="yyyy-MM-dd")
    private Date actualDate; // 实际还款日期
    private BigDecimal penalty; // 罚息
    private Integer overdueDays; // 逾期天数
    private Integer stauts; // 状态(1:未还款, 2:已逾期, 3:已还款, 4:逾期还款)
    private Long repymtApplyId; // 还款申请表ID

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWdrlId() {
        return wdrlId;
    }

    public void setWdrlId(Long wdrlId) {
        this.wdrlId = wdrlId;
    }

    public Long getCusUserId() {
        return cusUserId;
    }

    public void setCusUserId(Long cusUserId) {
        this.cusUserId = cusUserId;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public Date getActualDate() {
        return actualDate;
    }

    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }

    public BigDecimal getPenalty() {
        return penalty;
    }

    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Integer getStauts() {
        return stauts;
    }

    public void setStauts(Integer stauts) {
        this.stauts = stauts;
    }

    public Long getRepymtApplyId() {
        return repymtApplyId;
    }

    public void setRepymtApplyId(Long repymtApplyId) {
        this.repymtApplyId = repymtApplyId;
    }
}
