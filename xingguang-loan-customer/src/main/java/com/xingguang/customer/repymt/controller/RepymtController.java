package com.xingguang.customer.repymt.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.config.JWTParam;
import com.xingguang.customer.repymt.entity.RepymtApply;
import com.xingguang.customer.repymt.entity.RepymtPlan;
import com.xingguang.customer.repymt.entity.RepymtPlanExample;
import com.xingguang.customer.repymt.service.IRepymtApplyService;
import com.xingguang.customer.repymt.service.IRepymtPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/repymt/apply", method = RequestMethod.POST)
    public ResultBean<?> createCreditApply(@RequestBody RepymtApply repymtApply,
                                           @RequestBody List<Long> repymtPlanList,
                                           @JWTParam(key = "userId", required = true) Long userId) {
        RepymtPlanExample example = new RepymtPlanExample();
        example.createCriteria().andIdIn(repymtPlanList).andCusUserIdEqualTo(userId);
        List<RepymtPlan> list = this.repymtPlanService.getRepymtPlanList(example);
        List<Long> listSelf  = list.stream().map(repymtPlan -> repymtPlan.getId()).collect(Collectors.toList());
        this.repymtApplyService.create(repymtApply, listSelf);
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
