package com.xingguang.credit.info.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/13  16:05
 * @Version v1.0.0
 */
public class CreditInfoEntity implements Serializable {

    private Long id;
    private Long cusUserId;
    private BigDecimal finalAmount; // 授信金额
    private BigDecimal unusedAmount; // 可用额度
    private BigDecimal usedAmount; // 已用额度
    private Date creditTime;
    private Integer status; // 状态(1:正常, 2:锁定)

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

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public BigDecimal getUnusedAmount() {
        return unusedAmount;
    }

    public void setUnusedAmount(BigDecimal unusedAmount) {
        this.unusedAmount = unusedAmount;
    }

    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }

    public Date getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Date creditTime) {
        this.creditTime = creditTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
