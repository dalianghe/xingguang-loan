package com.xingguang.credit.apply.service;

import com.xingguang.credit.apply.domain.AuditDomain;
import com.xingguang.credit.apply.entity.custom.CreditApplyEntityCustom;

/**
 * Created by admin on 2017/10/12.
 */
public interface ICreditApplyService {

    public CreditApplyEntityCustom findCreditApplyById(Long id) throws Exception;

    public void auditCreditApply(AuditDomain domain) throws Exception;

}
