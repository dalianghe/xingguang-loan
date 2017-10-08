package com.xingguang.customer.credit.service.impl;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.credit.mapper.CreditApplyMapper;
import com.xingguang.customer.credit.service.ICreditApplyService;
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

    @Override
    public int create(CreditApply creditApply){

        return this.creditApplyMapper.insertSelective(creditApply);

    }
}
