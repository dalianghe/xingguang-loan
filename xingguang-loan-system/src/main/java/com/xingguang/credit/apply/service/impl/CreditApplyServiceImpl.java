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

import java.util.Date;

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
                entity.setCreditTime(new Date());
                creditInfoService.insertCreditInfo(entity);
            }else{
                entity.setCusUserId(domain.getCusUserId());
                entity.setFinalAmount(domain.getAmount());
                entity.setCreditTime(new Date());
                creditInfoService.updateCusCreditInfo(entity);
            }
        }
    }
}
