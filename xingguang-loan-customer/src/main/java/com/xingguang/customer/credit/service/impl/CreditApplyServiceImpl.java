package com.xingguang.customer.credit.service.impl;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.credit.mapper.CreditApplyMapper;
import com.xingguang.customer.credit.params.CreditApplyParam;
import com.xingguang.customer.credit.service.ICreditApplyService;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.service.ICusUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class CreditApplyServiceImpl implements ICreditApplyService {

    @Autowired
    private CreditApplyMapper creditApplyMapper;

    @Autowired
    private ICusUserInfoService cusUserInfoService;

    @Override
    public void create(CreditApplyParam creditApplyParam){
        CreditApply creditApply = creditApplyParam.getCreditApply();
        CusUserInfo cusUserInfo = creditApplyParam.getCusUserInfo();
        this.creditApplyMapper.insertSelective(creditApply);
        this.cusUserInfoService.update(cusUserInfo);
    }
}
