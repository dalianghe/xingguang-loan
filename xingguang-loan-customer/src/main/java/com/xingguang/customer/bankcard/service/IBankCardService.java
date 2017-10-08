package com.xingguang.customer.bankcard.service;

import com.xingguang.customer.bankcard.entity.CusBankCard;
import com.xingguang.customer.bankcard.entity.CusBankCardExample;

import java.util.List;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface IBankCardService {

    int create(CusBankCard cusBankCard);
    int update(CusBankCard cusBankCard);
    List<CusBankCard> getBankCardList(CusBankCardExample example);
    CusBankCard getBankCardById(Long id);

}
