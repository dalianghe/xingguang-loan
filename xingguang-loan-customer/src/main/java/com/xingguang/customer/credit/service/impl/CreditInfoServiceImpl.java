package com.xingguang.customer.credit.service.impl;

import com.xingguang.customer.credit.entity.CreditInfo;
import com.xingguang.customer.credit.entity.CreditInfoExample;
import com.xingguang.customer.credit.mapper.CreditInfoMapper;
import com.xingguang.customer.credit.service.ICreditInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class CreditInfoServiceImpl implements ICreditInfoService {
    @Autowired
    private CreditInfoMapper creditInfoMapper;


    @Override
    @Transactional(readOnly = true)
    public CreditInfo findByCusUserId(Long cusUserId) {
        CreditInfoExample example = new CreditInfoExample();
        example.createCriteria().andCusUserIdEqualTo(cusUserId);
        List<CreditInfo> creditInfoList = this.creditInfoMapper.selectByExample(example);
        return CollectionUtils.isEmpty(creditInfoList) ? null : creditInfoList.get(0);
    }
}
