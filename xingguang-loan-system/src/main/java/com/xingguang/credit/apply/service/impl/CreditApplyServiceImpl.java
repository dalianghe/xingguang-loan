package com.xingguang.credit.apply.service.impl;

import com.xingguang.credit.apply.domain.AuditDomain;
import com.xingguang.credit.apply.entity.CreditApplyEntity;
import com.xingguang.credit.apply.entity.custom.CreditApplyEntityCustom;
import com.xingguang.credit.apply.mapper.CreditApplyMapper;
import com.xingguang.credit.apply.service.ICreditApplyService;
import com.xingguang.credit.info.entity.custom.CreditInfoEntityCustom;
import com.xingguang.credit.info.service.ICreditInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/10/12.
 */
@Service
public class CreditApplyServiceImpl implements ICreditApplyService {

    @Autowired
    private CreditApplyMapper creditApplyMapper;
    @Autowired
    private ICreditInfoService creditInfoService;

    @Override
    public CreditApplyEntityCustom findCreditApplyById(Long id) throws Exception {
        return creditApplyMapper.findCreditApplyById(id);
    }

    @Override
    public List<CreditApplyEntityCustom> findCreditApplyByCusId(Long cusId) throws Exception {
        return creditApplyMapper.findCreditApplyByCusId(cusId);
    }

    @Transactional
    public void updateCreditApply(AuditDomain domain) throws Exception {
        CreditApplyEntity entity = new CreditApplyEntity();
        BeanUtils.copyProperties(domain , entity);
        creditApplyMapper.updateCreditApply(entity);
    }

    @Override
    @Transactional
    public void auditCreditApply(AuditDomain domain) throws Exception {
        this.updateCreditApply(domain);
        if(domain.getStatus() == 2){ // 授信通过
            CreditInfoEntityCustom entity = creditInfoService.findCreditInfoByCusId(domain.getCusUserId());
            if(entity == null){
                entity = new CreditInfoEntityCustom();
                entity.setCusUserId(domain.getCusUserId());
                entity.setFinalAmount(domain.getAmount());
                entity.setUnusedAmount(domain.getAmount());
                entity.setCreditTime(new Date());
                creditInfoService.insertCreditInfo(entity);
            }else{
                entity.setCusUserId(domain.getCusUserId());
                entity.setFinalAmount(domain.getAmount());
                BigDecimal finalAmount = domain.getAmount()==null ? BigDecimal.ZERO : domain.getAmount();
                BigDecimal usedAmount = entity.getUsedAmount()==null ? BigDecimal.ZERO : entity.getUsedAmount();
                BigDecimal unusedAmount = finalAmount.compareTo(usedAmount)==1 ? finalAmount.subtract(usedAmount) : BigDecimal.ZERO;
                entity.setUnusedAmount(unusedAmount);
                entity.setCreditTime(new Date());
                creditInfoService.updateCusCreditInfo(entity);
            }
        }
    }
}
