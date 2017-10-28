package com.xingguang.report.search.domain;

import com.xingguang.common.domain.BaseDomain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/26  20:31
 * @Version v1.0.0
 */
public class SearchUserDomain extends BaseDomain implements Serializable {

    private Long id;
    private String name;
    private String phone;
    private String idNo;
    private Date applyTime;
    private Integer status;
    private String statusName;
    private Integer amountScope;
    private Date creditTime;
    private Long productId;
    private String productName;
    private Long termId;
    private String termName;
    private Integer wdrlStatus;
    private Integer creditStatus;
    private String creditStatusName;
    private String applyDate;
    private String creditDate;
    private String payDate;

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

    public Integer getAmountScope() {
        return amountScope;
    }

    public void setAmountScope(Integer amountScope) {
        this.amountScope = amountScope;
    }

    public Date getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Date creditTime) {
        this.creditTime = creditTime;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public Integer getWdrlStatus() {
        return wdrlStatus;
    }

    public void setWdrlStatus(Integer wdrlStatus) {
        this.wdrlStatus = wdrlStatus;
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

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(String creditDate) {
        this.creditDate = creditDate;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }
}
