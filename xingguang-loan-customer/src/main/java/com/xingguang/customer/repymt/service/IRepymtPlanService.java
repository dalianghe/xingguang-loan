package com.xingguang.customer.repymt.service;

import com.xingguang.customer.repymt.entity.RepymtPlan;
import com.xingguang.customer.repymt.entity.RepymtPlanExample;

import java.util.List;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface IRepymtPlanService {

    long countRepymtPlan(RepymtPlanExample example);

    List<RepymtPlan> getRepymtPlanList(RepymtPlanExample example);

    RepymtPlan getRepymtPlanById(Long id);

    int updateRepymtPlanExample(RepymtPlan repymtPlan, RepymtPlanExample example);

}
