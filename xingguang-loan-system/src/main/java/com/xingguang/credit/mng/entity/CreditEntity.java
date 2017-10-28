package com.xingguang.credit.mng.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by admin on 2017/10/17.
 */
public class CreditEntity implements Serializable {

    private Long id;
    private String name;
    private String phone;
    private String idNo;
    @JSONField(format="yyyy-MM-dd")
    private Date applyTime;
    private Integer status;
    private String statusName;
    private BigDecimal amount;
    @JSONField(format="yyyy-MM-dd")
    private Date creditTime;
    private Integer creditStatus;
    private String creditStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Date creditTime) {
        this.creditTime = creditTime;
    }

    public Integer getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(Integer creditStatus) {
        this.creditStatus = creditStatus;
    }

    public String getCreditStatusName() {
        return creditStatusName;
    }

    public void setCreditStatusName(String creditStatusName) {
        this.creditStatusName = creditStatusName;
    }
}
