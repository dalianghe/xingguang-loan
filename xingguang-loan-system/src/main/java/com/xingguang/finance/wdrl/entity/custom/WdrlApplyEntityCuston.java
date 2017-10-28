package com.xingguang.finance.wdrl.entity.custom;

import com.xingguang.finance.wdrl.entity.WdrlApplyEntity;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/15.
 */
public class WdrlApplyEntityCuston extends WdrlApplyEntity implements Serializable {

    private String statusName;
    private Integer creditStatus;
    private String creditStatusName;

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
}
