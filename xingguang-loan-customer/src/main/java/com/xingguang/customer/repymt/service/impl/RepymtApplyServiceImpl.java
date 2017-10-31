package com.xingguang.customer.repymt.service.impl;

import com.xingguang.customer.repymt.entity.RepymtApply;
import com.xingguang.customer.repymt.entity.RepymtPlan;
import com.xingguang.customer.repymt.entity.RepymtPlanExample;
import com.xingguang.customer.repymt.mapper.RepymtApplyMapper;
import com.xingguang.customer.repymt.service.IRepymtApplyService;
import com.xingguang.customer.repymt.service.IRepymtPlanService;
import com.xingguang.customer.wdrl.entity.WdrlApply;
import com.xingguang.customer.wdrl.mapper.WdrlApplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class RepymtApplyServiceImpl implements IRepymtApplyService {

    @Autowired
    private RepymtApplyMapper repymtApplyMapper;

    @Autowired
    private IRepymtPlanService repymtPlanService;

    @Override
    public void create(RepymtApply repymtApply, List<Long> RepymtPlanIdList){
        this.repymtApplyMapper.insertSelective(repymtApply);
        RepymtPlanExample repymtPlanExample = new RepymtPlanExample();
        repymtPlanExample.createCriteria().andIdIn(RepymtPlanIdList);
        RepymtPlan repymtPlan = new RepymtPlan();
        repymtPlan.setRepymtApplyId(repymtApply.getId());
        this.repymtPlanService.updateRepymtPlanExample(repymtPlan, repymtPlanExample);
    }
}
