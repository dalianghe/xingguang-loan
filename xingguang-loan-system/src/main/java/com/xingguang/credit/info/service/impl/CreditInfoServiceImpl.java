package com.xingguang.credit.info.service.impl;

import com.xingguang.credit.info.entity.CreditInfoEntity;
import com.xingguang.credit.info.entity.custom.CreditInfoEntityCustom;
import com.xingguang.credit.info.mapper.CreditInfoMapper;
import com.xingguang.credit.info.service.ICreditInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/13  16:29
 * @Version v1.0.0
 */
@Service
public class CreditInfoServiceImpl implements ICreditInfoService {

    @Autowired
    private CreditInfoMapper creditInfoMapper;

    @Override
    public CreditInfoEntityCustom findCreditInfoByCusId(Long cusUserId) throws Exception {
        return creditInfoMapper.findCreditInfoByCusId(cusUserId);
    }

    @Override
    @Transactional
    public void insertCreditInfo(CreditInfoEntity creditInfoEntity) throws Exception {
        creditInfoMapper.insertCreditInfo(creditInfoEntity);
    }

    @Override
    public void updateCusCreditInfo(CreditInfoEntity creditInfoEntity) throws Exception {
        creditInfoMapper.updateCusCreditInfo(creditInfoEntity);
    }
}
