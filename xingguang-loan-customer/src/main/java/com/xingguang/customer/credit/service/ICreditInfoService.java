package com.xingguang.customer.credit.service;

import com.xingguang.customer.credit.entity.CreditInfo;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface ICreditInfoService {

    CreditInfo findByCusUserId(Long cusUserId);

    void update(CreditInfo creditInfo);
    
}
