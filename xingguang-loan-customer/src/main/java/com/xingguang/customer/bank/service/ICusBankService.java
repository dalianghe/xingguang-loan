package com.xingguang.customer.bank.service;

import com.xingguang.customer.bank.entity.CusBank;

import java.util.List;
import java.util.Map;

public interface ICusBankService {
    List<CusBank> findAll();
    Map<Long, CusBank> findAllToMap();
}
