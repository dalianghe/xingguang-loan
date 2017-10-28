package com.xingguang.credit.mng.service;

import com.xingguang.credit.mng.domain.CreditDomain;

import java.util.Map;

/**
 * Created by admin on 2017/10/18.
 */
public interface ICreditService {

    public Map<String , Object> findCreditList(CreditDomain creditDomain) throws Exception;

    public void lockCreditByCusId(Long cusUserId) throws Exception;

    public void unLockCreditByCusId(Long cusUserId) throws Exception;

}
