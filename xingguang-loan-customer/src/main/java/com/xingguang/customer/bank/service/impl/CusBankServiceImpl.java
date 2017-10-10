package com.xingguang.customer.bank.service.impl;

import com.xingguang.customer.bank.entity.CusBank;
import com.xingguang.customer.bank.entity.CusBankExample;
import com.xingguang.customer.bank.mapper.CusBankMapper;
import com.xingguang.customer.bank.service.ICusBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Transactional
public class CusBankServiceImpl implements ICusBankService {

    @Autowired
    private CusBankMapper cusBankMapper;

    @Override
    @Transactional(readOnly = true)
    public List<CusBank> findAll() {
        CusBankExample example = new CusBankExample();
        return this.cusBankMapper.selectByExample(example);
    }

    @Override
    public Map<Long, CusBank> findAllToMap() {
        List<CusBank> list = this.findAll();
        return list.stream().collect(Collectors.toMap(CusBank::getId, bank -> bank));
    }

}
