package com.xingguang.customer.repymt.service.impl;

import com.xingguang.customer.repymt.entity.RepymtPlan;
import com.xingguang.customer.repymt.entity.RepymtPlanExample;
import com.xingguang.customer.repymt.mapper.RepymtPlanMapper;
import com.xingguang.customer.repymt.service.IRepymtPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class RepymtPlanServiceImpl implements IRepymtPlanService {

    @Autowired
    private RepymtPlanMapper repymtPlanMapper;

    @Override
    @Transactional(readOnly = true)
    public long countRepymtPlan(RepymtPlanExample example) {
        return this.repymtPlanMapper.countByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public List<RepymtPlan> getRepymtPlanList(RepymtPlanExample example) {
        return this.repymtPlanMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public RepymtPlan getRepymtPlanById(Long id) {
        return this.repymtPlanMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateRepymtPlanExample(RepymtPlan repymtPlan, RepymtPlanExample example) {
        return this.repymtPlanMapper.updateByExampleSelective(repymtPlan, example);
    }
}
