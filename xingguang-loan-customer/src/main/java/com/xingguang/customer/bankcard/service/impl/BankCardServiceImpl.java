package com.xingguang.customer.bankcard.service.impl;

import com.xingguang.customer.bankcard.entity.CusBankCard;
import com.xingguang.customer.bankcard.entity.CusBankCardExample;
import com.xingguang.customer.bankcard.mapper.CusBankCardMapper;
import com.xingguang.customer.bankcard.service.IBankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class BankCardServiceImpl implements IBankCardService {

    @Autowired
    private CusBankCardMapper cusBankCardMapper;

    @Override
    public int create(CusBankCard cusBankCard) {
        return this.cusBankCardMapper.insertSelective(cusBankCard);
    }

    @Override
    public int update(CusBankCard cusBankCard) {
        return this.cusBankCardMapper.updateByPrimaryKeySelective(cusBankCard);
    }

    @Override
    public List<CusBankCard> getBankCardList(CusBankCardExample example) {
        return this.cusBankCardMapper.selectByExample(example);
    }

    @Override
    public CusBankCard getBankCardById(Long id) {
        return this.cusBankCardMapper.selectByPrimaryKey(id);
    }
}
