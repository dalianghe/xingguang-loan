package com.xingguang.credit.apply.entity.custom;

import com.xingguang.credit.apply.entity.CreditApplyEntity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/12  14:18
 * @Version v1.0.0
 */
public class CreditApplyEntityCustom extends CreditApplyEntity implements Serializable {

    private String statusName;
    private String productName;
    private String termName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
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
}
