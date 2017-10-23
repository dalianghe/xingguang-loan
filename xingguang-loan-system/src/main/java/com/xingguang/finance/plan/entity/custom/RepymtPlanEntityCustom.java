package com.xingguang.finance.plan.entity.custom;

import com.xingguang.finance.plan.entity.RepymtPlanEntity;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/23.
 */
public class RepymtPlanEntityCustom extends RepymtPlanEntity implements Serializable {

    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
