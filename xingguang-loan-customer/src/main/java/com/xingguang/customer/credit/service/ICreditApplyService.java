package com.xingguang.customer.credit.service;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.credit.params.CreditApplyParam;

import java.util.List;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface ICreditApplyService {

    void create(CreditApply creditApply, CreditApplyParam creditApplyParam);

    CreditApply getByUserId(Long userId);

}
