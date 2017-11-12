package com.xingguang.finance.plan.mapper;

import com.xingguang.finance.plan.entity.RepymtPlanEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/23.
 */
public interface RepymtPlanMapper {

    void deleteRepymtPlanByWdrlId(Long wdrlId) throws Exception;

    void insertRepymtPlan(List<RepymtPlanEntity> list) throws Exception;

    void updateNormalRepymtPlan(RepymtPlanEntity entity) throws Exception;

    void updateOverdueRepymtPlan(RepymtPlanEntity entity) throws Exception;

}
