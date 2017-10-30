package com.xingguang.finance.wdrl.entity.custom;

import com.xingguang.finance.wdrl.entity.WdrlApplyEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by admin on 2017/10/15.
 */
public class WdrlApplyEntityCustom extends WdrlApplyEntity implements Serializable {

    private String statusName;
    private Integer creditStatus;
    private String creditStatusName;
    private String productName;
    private String termName;
    private BigDecimal payAmount;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }
}
