package com.xingguang.customer.repymt.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RepymtPlan {
    private Long id;

    private Long wdrlId;

    private Long cusUserId;

    private Integer term;

    private BigDecimal principal;

    private BigDecimal interest;

    private Date planDate;

    private Date actualDate;

    private BigDecimal penalty;

    private Integer overdueDays;

    private Integer stauts;

    private Long repymtApplyId;

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