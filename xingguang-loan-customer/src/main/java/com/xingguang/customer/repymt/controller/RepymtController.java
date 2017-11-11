package com.xingguang.customer.repymt.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.config.JWTParam;
import com.xingguang.customer.repymt.entity.RepymtApply;
import com.xingguang.customer.repymt.entity.RepymtPlan;
import com.xingguang.customer.repymt.entity.RepymtPlanExample;
import com.xingguang.customer.repymt.service.IRepymtApplyService;
import com.xingguang.customer.repymt.service.IRepymtPlanService;
import com.xingguang.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class RepymtController {

    @Autowired
    IRepymtApplyService repymtApplyService;
    @Autowired
    IRepymtPlanService repymtPlanService;

    @RequestMapping(value = "/repymt/apply/{wdrlId}", method = RequestMethod.POST)
    public ResultBean<?> createCreditApply(@PathVariable Long wdrlId,
                                           @JWTParam(key = "userId", required = true) Long userId) {
        RepymtPlanExample example = new RepymtPlanExample();
        example.createCriteria().andWdrlIdEqualTo(wdrlId).andCusUserIdEqualTo(userId).andStautsEqualTo(40);
        List<RepymtPlan> list = this.repymtPlanService.getRepymtPlanList(example);
        if(list.size() == 0){
            throw new CustomException("选择的还款计划不匹配");
        }
        BigDecimal principalTotal = list.stream().map(RepymtPlan::getPrincipal).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal interestTotal = list.stream().map(RepymtPlan::getInterest).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal penaltyTotal = list.stream().map(RepymtPlan::getPenalty).reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal totalMoney  = principalTotal.add(interestTotal).add(penaltyTotal);
        List<Long> listSelf  = list.stream().map(repymtPlan -> repymtPlan.getId()).collect(Collectors.toList());
        RepymtApply repymtApply = new RepymtApply();
        repymtApply.setAmount(totalMoney);
        repymtApply.setCusUserId(userId);
        repymtApply.setStatus(10);
        repymtApply.setCreateTime(new Date());
        this.repymtApplyService.create(repymtApply, listSelf, wdrlId);
        return  new ResultBean();
    }

    @RequestMapping(value = "/repymt/plans/{wdrlId}", method = RequestMethod.GET)
    public ResultBean<?> getPlans(@JWTParam(key = "userId", required = true) Long userId,
                                  @PathVariable Long wdrlId) {

        RepymtPlanExample example = new RepymtPlanExample();
        example.createCriteria().andWdrlIdEqualTo(wdrlId).andCusUserIdEqualTo(userId);
        example.setOrderByClause("plan_date");
        List<RepymtPlan> list = this.repymtPlanService.getRepymtPlanList(example);
        return new ResultBean(list);
    }

}
