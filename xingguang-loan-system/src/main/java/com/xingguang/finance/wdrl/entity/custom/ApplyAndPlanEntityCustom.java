package com.xingguang.finance.wdrl.entity.custom;

import com.xingguang.finance.plan.entity.RepymtPlanEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by admin on 2017/10/29.
 */
public class ApplyAndPlanEntityCustom implements Serializable {

    private BigDecimal serviceCharge;
    private List<RepymtPlanEntity> plans;

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public List<RepymtPlanEntity> getPlans() {
        return plans;
    }

    public void setPlans(List<RepymtPlanEntity> plans) {
        this.plans = plans;
    }
}
