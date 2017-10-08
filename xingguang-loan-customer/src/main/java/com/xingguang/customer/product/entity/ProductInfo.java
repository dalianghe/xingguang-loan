package com.xingguang.customer.product.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductInfo {
    private Long id;

    private String name;

    private BigDecimal serviceRate;

    private BigDecimal accMgmtRate;

    private BigDecimal penaltyRatio;

    private Integer status;

    private Long createUserId;

    private String createUserName;

    private Date createTime;

    private Date upTime;

    private Date downTime;

    private List<ProductTermInfo> productTermInfoList = new ArrayList<>();

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
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(BigDecimal serviceRate) {
        this.serviceRate = serviceRate;
    }

    public BigDecimal getAccMgmtRate() {
        return accMgmtRate;
    }

    public void setAccMgmtRate(BigDecimal accMgmtRate) {
        this.accMgmtRate = accMgmtRate;
    }

    public BigDecimal getPenaltyRatio() {
        return penaltyRatio;
    }

    public void setPenaltyRatio(BigDecimal penaltyRatio) {
        this.penaltyRatio = penaltyRatio;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public Date getDownTime() {
        return downTime;
    }

    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }

    public List<ProductTermInfo> getProductTermInfoList() {
        return productTermInfoList;
    }

    public void setProductTermInfoList(List<ProductTermInfo> productTermInfoList) {
        this.productTermInfoList = productTermInfoList;
    }
}