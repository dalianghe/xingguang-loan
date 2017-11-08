package com.xingguang.finance.plan.service;

import com.xingguang.finance.plan.entity.RepymtPlanEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/29.
 */
public interface IRepymtPlanService {

    public void deleteRepymtPlanByWdrlId(Long id) throws Exception;

    public void insertRepymtPlan(List<RepymtPlanEntity> list) throws Exception;

    public void addRepymtPlan(Long id , List<RepymtPlanEntity> list) throws Exception;

    public void updateNormalRepymtPlan(RepymtPlanEntity entity) throws Exception;

}
