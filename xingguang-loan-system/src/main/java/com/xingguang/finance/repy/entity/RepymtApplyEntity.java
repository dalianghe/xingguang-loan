package com.xingguang.finance.repy.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/1  17:57
 * @Version v1.0.0
 */
public class RepymtApplyEntity implements Serializable {

    private Long id;
    private Long cusUserId;
    private BigDecimal amount;
    private Integer status;
    private Integer repymtType;
    private Date createTime;
    private Date operatorTime;
    private Long operatorId;
    private String operatorName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusUserId() {
        return cusUserId;
    }

    public void setCusUserId(Long cusUserId) {
        this.cusUserId = cusUserId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Integer getRepymtType() {
        return repymtType;
    }

    public void setRepymtType(Integer repymtType) {
        this.repymtType = repymtType;
    }
}
