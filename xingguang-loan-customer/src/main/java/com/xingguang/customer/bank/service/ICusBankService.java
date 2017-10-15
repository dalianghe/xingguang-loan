package com.xingguang.customer.bank.service;

import com.xingguang.customer.bank.entity.CusBank;

import java.util.List;
import java.util.Map;

public interface ICusBankService {
    CusBank findByKey(Long id);
    List<CusBank> findAll();
    List<CusBank> findAvail();
    Map<Long, CusBank> findAllToMap();
}
