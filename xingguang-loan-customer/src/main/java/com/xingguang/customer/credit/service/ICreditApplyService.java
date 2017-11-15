package com.xingguang.customer.credit.service;

import com.xingguang.customer.credit.entity.CreditApply;

import java.util.List;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface ICreditApplyService {

    void create(CreditApply creditApply, Long appId);

    CreditApply getByUserId(Long userId);

}
