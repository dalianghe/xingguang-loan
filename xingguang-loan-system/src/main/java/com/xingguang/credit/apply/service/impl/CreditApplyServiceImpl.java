package com.xingguang.credit.apply.service.impl;

import com.xingguang.credit.apply.entity.custom.CreditApplyEntityCustom;
import com.xingguang.credit.apply.mapper.CreditApplyMapper;
import com.xingguang.credit.apply.service.ICreditApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/10/12.
 */
@Service
public class CreditApplyServiceImpl implements ICreditApplyService {

    @Autowired
    private CreditApplyMapper creditApplyMapper;

    @Override
    public CreditApplyEntityCustom findCreditApplyById(Long id) throws Exception {
        return creditApplyMapper.findCreditApplyById(id);
    }
}
