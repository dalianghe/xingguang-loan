package com.xingguang.finance.wdrl.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by admin on 2017/10/15.
 */
public class WdrlApplyEntity implements Serializable {

    private Long id;
    private Long cusUserId; // 客户ID
    private String cusUserName; // 客户姓名
    private Long bankCardId; // 银行卡ID
    private String reservePhone; // 预留手机号
    private BigDecimal amount; // 提款额度
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime; // 提款时间
    private Integer status; // 状态(1:待处理, 2:已放款, 3:结清)
    private Long auditorId; // 提现审核人ID
    private String auditorName; // 提现审核人姓名
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditorTime; // 提现审核时间
    private Long operatorId; // 操作人ID
    private String operatorName; // 操作人姓名
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date issueTime; // 放款时间
    private Long productId; // 产品ID
    private Long termId; // 产品期限ID
    private BigDecimal serviceCharge; // 服务费
    private BigDecimal accMgmtCharge; // 账户管理费

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

    public String getCusUserName() {
        return cusUserName;
    }

    public void setCusUserName(String cusUserName) {
        this.cusUserName = cusUserName;
    }

    public Long getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Long bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getReservePhone() {
        return reservePhone;
    }

    public void setReservePhone(String reservePhone) {
        this.reservePhone = reservePhone;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public Date getAuditorTime() {
        return auditorTime;
    }

    public void setAuditorTime(Date auditorTime) {
        this.auditorTime = auditorTime;
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

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getTermId() {
        return termId;
    }

    public void setTermId(Long termId) {
        this.termId = termId;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public BigDecimal getAccMgmtCharge() {
        return accMgmtCharge;
    }

    public void setAccMgmtCharge(BigDecimal accMgmtCharge) {
        this.accMgmtCharge = accMgmtCharge;
    }
}
