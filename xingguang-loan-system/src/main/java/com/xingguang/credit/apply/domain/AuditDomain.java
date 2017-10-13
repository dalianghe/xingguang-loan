package com.xingguang.credit.apply.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/13  14:44
 * @Version v1.0.0
 */
public class AuditDomain implements Serializable {

    private Long id;
    private Integer status;
    private BigDecimal amount;
    private Date creditTime; // 授信时间
    private Long creditUserId; // 授信操作人ID
    private String creditUserName; // 授信操作人姓名
    private String refuseCode; // 拒代码

    private Long cusUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRefuseCode() {
        return refuseCode;
    }

    public void setRefuseCode(String refuseCode) {
        this.refuseCode = refuseCode;
    }

    public Date getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Date creditTime) {
        this.creditTime = creditTime;
    }

    public Long getCreditUserId() {
        return creditUserId;
    }

    public void setCreditUserId(Long creditUserId) {
        this.creditUserId = creditUserId;
    }

    public String getCreditUserName() {
        return creditUserName;
    }

    public void setCreditUserName(String creditUserName) {
        this.creditUserName = creditUserName;
    }

    public Long getCusUserId() {
        return cusUserId;
    }

    public void setCusUserId(Long cusUserId) {
        this.cusUserId = cusUserId;
    }

}
