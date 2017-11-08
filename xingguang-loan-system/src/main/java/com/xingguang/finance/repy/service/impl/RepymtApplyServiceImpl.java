package com.xingguang.finance.repy.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xingguang.finance.plan.entity.RepymtPlanEntity;
import com.xingguang.finance.plan.entity.custom.RepymtPlanEntityCustom;
import com.xingguang.finance.plan.service.IRepymtPlanService;
import com.xingguang.finance.repy.domain.RepyDomain;
import com.xingguang.finance.repy.entity.RepymtApplyEntity;
import com.xingguang.finance.repy.entity.custom.RepymtApplyEntityCustom;
import com.xingguang.finance.repy.mapper.RepymtApplyMapper;
import com.xingguang.finance.repy.service.IRepymtApplyService;
import com.xingguang.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/1  18:03
 * @Version v1.0.0
 */
@Service
public class RepymtApplyServiceImpl implements IRepymtApplyService {

    @Autowired
    private RepymtApplyMapper repymtApplyMapper;
    @Autowired
    private IRepymtPlanService repymtPlanService;

    @Override
    public Map<String, Object> findNormalRepymtList(RepyDomain repyDemain) throws Exception {
        PageHelper.startPage(repyDemain.getPager().get("page"), repyDemain.getPager().get("pageSize"));
        RepymtApplyEntityCustom entity = new RepymtApplyEntityCustom();
        entity.setName(repyDemain.getCusUserName());
        entity.setPlanDate(DateUtils.getCurrentDate());
        List<RepymtApplyEntityCustom> list = repymtApplyMapper.findNormalRepymtList(entity);
        Map<String,Object> map = new HashMap<>();
        map.put("applies" , list);
        map.put("total" , ((Page) list).getTotal());
        return map;
    }

    @Override
    @Transactional
    public void repaymentNormal(RepyDomain domain) throws Exception {
        List<RepymtApplyEntity> applies = new ArrayList<>();
        RepymtApplyEntityCustom entityCustom = new RepymtApplyEntityCustom();
        int status = domain.getRepymtType()==4 ? 20 : 30;
        for(Long id : domain.getIds()){
            entityCustom.setCusUserId(id);
            entityCustom.setPlanDate(DateUtils.getCurrentDate());
            RepymtApplyEntityCustom entity = repymtApplyMapper.findNormalRepymtByUserId(entityCustom);
            RepymtApplyEntity apply = new RepymtApplyEntity();
            apply.setCusUserId(id);
            apply.setAmount(entity.getAmount());
            apply.setStatus(status);
            apply.setRepymtType(domain.getRepymtType());
            apply.setCreateTime(new Date());
            apply.setOperatorTime(new Date());
            apply.setOperatorId(domain.getOperatorId());
            apply.setOperatorName(domain.getOperatorName());
            applies.add(apply);
        }
        repymtApplyMapper.insertRepymtApply(applies);
        for(RepymtApplyEntity entity : applies){
            RepymtPlanEntity plan = new RepymtPlanEntity();
            plan.setCusUserId(entity.getCusUserId());
            plan.setRepymtApplyId(entity.getId());
            plan.setStauts(status);
            repymtPlanService.updateNormalRepymtPlan(plan);
        }
    }
}
