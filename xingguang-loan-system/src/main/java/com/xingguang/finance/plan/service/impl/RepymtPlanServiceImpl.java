package com.xingguang.finance.plan.service.impl;

import com.xingguang.finance.plan.entity.RepymtPlanEntity;
import com.xingguang.finance.plan.mapper.RepymtPlanMapper;
import com.xingguang.finance.plan.service.IRepymtPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2017/10/29.
 */
@Service
public class RepymtPlanServiceImpl implements IRepymtPlanService{

    @Autowired
    private RepymtPlanMapper repymtPlanMapper;

    @Override
    @Transactional
    public void deleteRepymtPlanByWdrlId(Long id) throws Exception {
        repymtPlanMapper.deleteRepymtPlanByWdrlId(id);
    }

    @Override
    @Transactional
    public void insertRepymtPlan(List<RepymtPlanEntity> list) throws Exception {
        repymtPlanMapper.insertRepymtPlan(list);
    }

    @Override
    @Transactional
    public void addRepymtPlan(Long id, List<RepymtPlanEntity> list) throws Exception {
        // step 1: 删除还款计划
        this.deleteRepymtPlanByWdrlId(id);
        // step 2:插入还款计划
        this.insertRepymtPlan(list);
    }

    @Override
    @Transactional
    public void updateNormalRepymtPlan(RepymtPlanEntity entity) throws Exception {
        repymtPlanMapper.updateNormalRepymtPlan(entity);
    }
}
