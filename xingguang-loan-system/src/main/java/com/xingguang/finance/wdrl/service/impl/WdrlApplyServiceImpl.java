package com.xingguang.finance.wdrl.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xingguang.credit.info.entity.CreditInfoEntity;
import com.xingguang.credit.info.entity.custom.CreditInfoEntityCustom;
import com.xingguang.credit.info.service.ICreditInfoService;
import com.xingguang.finance.plan.entity.RepymtPlanEntity;
import com.xingguang.finance.plan.service.IRepymtPlanService;
import com.xingguang.finance.wdrl.domain.WdrlDomain;
import com.xingguang.finance.wdrl.entity.WdrlApplyEntity;
import com.xingguang.finance.wdrl.entity.custom.ApplyAndPlanEntityCustom;
import com.xingguang.finance.wdrl.entity.custom.WdrlApplyEntityCustom;
import com.xingguang.finance.wdrl.mapper.WdrlApplyMapper;
import com.xingguang.finance.wdrl.service.IWdrlApplyService;
import com.xingguang.product.info.entity.custom.ProductInfoEntityCustom;
import com.xingguang.product.info.service.IProductInfoService;
import com.xingguang.product.term.entity.ProductTermInfoEntity;
import com.xingguang.product.term.service.IProductTermInfoService;
import com.xingguang.utils.FinanceUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by admin on 2017/10/15.
 */
@Service
public class WdrlApplyServiceImpl implements IWdrlApplyService {

    @Autowired
    private WdrlApplyMapper wdrlApplyMapper;
    @Autowired
    private IProductInfoService productInfoService;
    @Autowired
    private IProductTermInfoService productTermInfoService;
    @Autowired
    private IRepymtPlanService repymtPlanService;
    @Autowired
    private ICreditInfoService creditInfoService;

    @Override
    public Map<String, Object> findAuditApplyList(WdrlDomain domain) throws Exception {
        WdrlApplyEntity entity = new WdrlApplyEntity();
        entity.setCusUserName(domain.getCusUserName());
        PageHelper.startPage(domain.getPager().get("page"), domain.getPager().get("pageSize"));
        List<WdrlApplyEntityCustom> applies = wdrlApplyMapper.findAuditApplyList(entity);
        Map<String,Object> map = new HashMap<>();
        map.put("applies" , applies);
        map.put("total" , ((Page) applies).getTotal());
        return map;
    }

    @Override
    public void updateWdrlApply(WdrlDomain domain) throws Exception {
        WdrlApplyEntity entity = new WdrlApplyEntity();
        BeanUtils.copyProperties(domain,entity);
        wdrlApplyMapper.updateWdrlApply(entity);
    }

    @Override
    public Map<String, Object> findPayApplyList(WdrlDomain domain) throws Exception {
        WdrlApplyEntity entity = new WdrlApplyEntity();
        entity.setCusUserName(domain.getCusUserName());
        PageHelper.startPage(domain.getPager().get("page"), domain.getPager().get("pageSize"));
        List<WdrlApplyEntityCustom> applies = wdrlApplyMapper.findPayApplyList(entity);
        Map<String,Object> map = new HashMap<>();
        map.put("applies" , applies);
        map.put("total" , ((Page) applies).getTotal());
        return map;
    }

    @Override
    public Map<String, Object> findPayDoneList(WdrlDomain domain) throws Exception {
        WdrlApplyEntity entity = new WdrlApplyEntity();
        entity.setCusUserName(domain.getCusUserName());
        PageHelper.startPage(domain.getPager().get("page"), domain.getPager().get("pageSize"));
        List<WdrlApplyEntityCustom> applies = wdrlApplyMapper.findPayDoneList(entity);
        Map<String,Object> map = new HashMap<>();
        map.put("applies" , applies);
        map.put("total" , ((Page) applies).getTotal());
        return map;
    }

    @Override
    public WdrlApplyEntityCustom findWdrlApplyById(Long id) throws Exception {
        return wdrlApplyMapper.findWdrlApplyById(id);
    }

    @Override
    public List<WdrlApplyEntityCustom> findWdrlApplyByCusId(Long cusUserId) throws Exception {
        return wdrlApplyMapper.findWdrlApplyByCusId(cusUserId);
    }

    @Override
    @Transactional
    public void paypal(WdrlDomain domain) throws Exception {

        for(Long id : domain.getIds()){
            domain.setId(id);
            WdrlApplyEntityCustom applyEntity = this.findWdrlApplyById(domain.getId());
            if(null == applyEntity){
                throw new Exception("无付款记录！");
            }
            // step 1: 计算服务费和账户管理费
            ProductInfoEntityCustom product = productInfoService.findProductInfoById(applyEntity.getProductId());
            BigDecimal serviceCharge = FinanceUtils.getServiceCharge(applyEntity.getAmount() , product.getServiceRate());
            //BigDecimal accMgmtCharge = FinanceUtils.getAccMgmtCharge(applyEntity.getAmount() , product.getAccMgmtRate());
            // step 2: 生成还款计划
            List<RepymtPlanEntity> list = new ArrayList<>();
            ProductTermInfoEntity termInfoEntity = productTermInfoService.findTermById(applyEntity.getTermId());
            for(int i=0 ; i<termInfoEntity.getTermNumber() ; i++){
                RepymtPlanEntity planEntity = new RepymtPlanEntity();
                planEntity.setWdrlId(applyEntity.getId());
                planEntity.setCusUserId(applyEntity.getCusUserId());
                planEntity.setTerm(i+1);
                planEntity.setPrincipal(FinanceUtils.getPrincipalAmount(applyEntity.getAmount() , termInfoEntity.getTermNumber()));
                planEntity.setInterest(FinanceUtils.getInterestAmount(applyEntity.getAmount() , termInfoEntity.getRate() , termInfoEntity.getTermDays()));
                planEntity.setPlanDate(FinanceUtils.getPlanRepymtDate(domain.getIssueTime() , termInfoEntity.getTermDays()));
                planEntity.setStauts(10);
                list.add(planEntity);
            }
            repymtPlanService.addRepymtPlan(applyEntity.getId() , list);
            // step 3: 更新提现记录表
            WdrlApplyEntity entity = new WdrlApplyEntity();
            BeanUtils.copyProperties(domain,entity);
            entity.setServiceCharge(serviceCharge);
            //entity.setAccMgmtCharge(accMgmtCharge);
            wdrlApplyMapper.updateWdrlApply(entity);
        }

    }

    @Override
    public ApplyAndPlanEntityCustom viewPlanAndCharge(Long id) throws Exception {
        ApplyAndPlanEntityCustom entity = new ApplyAndPlanEntityCustom();
        WdrlApplyEntityCustom applyEntity = this.findWdrlApplyById(id);
        if(null == applyEntity){
            throw new Exception("无付款记录！");
        }
        ProductInfoEntityCustom product = productInfoService.findProductInfoById(applyEntity.getProductId());
        BigDecimal serviceCharge = FinanceUtils.getServiceCharge(applyEntity.getAmount() , product.getServiceRate());
        List<RepymtPlanEntity> list = new ArrayList<>();
        ProductTermInfoEntity termInfoEntity = productTermInfoService.findTermById(applyEntity.getTermId());
        for(int i=0 ; i<termInfoEntity.getTermNumber() ; i++){
            RepymtPlanEntity planEntity = new RepymtPlanEntity();
            planEntity.setWdrlId(applyEntity.getId());
            planEntity.setCusUserId(applyEntity.getCusUserId());
            planEntity.setTerm(i+1);
            planEntity.setPrincipal(FinanceUtils.getPrincipalAmount(applyEntity.getAmount() , termInfoEntity.getTermNumber()));
            planEntity.setInterest(FinanceUtils.getInterestAmount(applyEntity.getAmount() , termInfoEntity.getRate() , termInfoEntity.getTermDays()));
            planEntity.setPlanDate(FinanceUtils.getPlanRepymtDate(new Date(), termInfoEntity.getTermDays()));
            list.add(planEntity);
        }
        entity.setServiceCharge(serviceCharge);
        entity.setPlans(list);
        return entity;
    }

    @Override
    @Transactional
    public void stopPaypal(WdrlDomain domain) throws Exception {

        WdrlApplyEntityCustom wdrlApplyEntityCustom = wdrlApplyMapper.findWdrlApplyById(domain.getId());
        CreditInfoEntityCustom creditInfoEntityCustom = creditInfoService.findCreditInfoByCusId(domain.getCusUserId());
        CreditInfoEntity creditInfoEntity = new CreditInfoEntity();
        creditInfoEntity.setCusUserId(domain.getCusUserId());
        BigDecimal unusedAmout = creditInfoEntityCustom.getUnusedAmount().add(wdrlApplyEntityCustom.getAmount());
        BigDecimal usedAmount = creditInfoEntityCustom.getUsedAmount().subtract(wdrlApplyEntityCustom.getAmount());
        creditInfoEntity.setUnusedAmount(unusedAmout);
        creditInfoEntity.setUsedAmount(usedAmount);
        creditInfoService.updateCusCreditInfo(creditInfoEntity);
        WdrlApplyEntity entity = new WdrlApplyEntity();
        BeanUtils.copyProperties(domain,entity);
        wdrlApplyMapper.updateWdrlApply(entity);
    }

}
