package com.xingguang.customer.bankcard.service.impl;

import com.xingguang.customer.bank.entity.CusBank;
import com.xingguang.customer.bank.service.ICusBankService;
import com.xingguang.customer.bankcard.entity.CusBankCard;
import com.xingguang.customer.bankcard.entity.CusBankCardExample;
import com.xingguang.customer.bankcard.entity.CusBankCardForList;
import com.xingguang.customer.bankcard.mapper.CusBankCardMapper;
import com.xingguang.customer.bankcard.service.IBankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    public int update(Long id, Long userId, CusBankCard cusBankCard) {
        CusBankCardExample example = new CusBankCardExample();
        example.createCriteria().andIdEqualTo(id).andCusUserIdEqualTo(userId);
        return this.cusBankCardMapper.updateByExampleSelective(cusBankCard, example);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CusBankCard> getBankCardList(CusBankCardExample example) {
        return this.cusBankCardMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public CusBankCard getBankCardById(Long id, Long userId) {
        CusBankCardExample example = new CusBankCardExample();
        example.createCriteria().andIdEqualTo(id).andCusUserIdEqualTo(userId);
        List<CusBankCard> list = this.cusBankCardMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)){
            return null;
        }
        return list.get(0);
    }

    @Override
    @Transactional(readOnly = true)
    public long countByExample(CusBankCardExample example) {
        return this.cusBankCardMapper.countByExample(example);
    }

    @Override
    public int updateDef(Long id, Long userId) {
        CusBankCardExample example = new CusBankCardExample();
        example.createCriteria().andCusUserIdEqualTo(userId);
        CusBankCard unDefCusBankCard = new CusBankCard();
        unDefCusBankCard.setIsDefault(2);
        this.cusBankCardMapper.updateByExampleSelective(unDefCusBankCard, example);
        CusBankCard defCusBankCard = new CusBankCard();
        defCusBankCard.setId(id);
        defCusBankCard.setIsDefault(1);
        return this.cusBankCardMapper.updateByPrimaryKeySelective(defCusBankCard);
    }
}
