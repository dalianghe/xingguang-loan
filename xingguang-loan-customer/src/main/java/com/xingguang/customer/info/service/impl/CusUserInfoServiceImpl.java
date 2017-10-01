package com.xingguang.customer.info.service.impl;

import com.xingguang.customer.info.entity.CusUserInfoEntity;
import com.xingguang.customer.info.mapper.CusUserInfoMapper;
import com.xingguang.customer.info.params.InfoBean;
import com.xingguang.customer.info.service.ICusUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2017/10/1.
 */
@Service
public class CusUserInfoServiceImpl implements ICusUserInfoService {
    @Autowired
    private CusUserInfoMapper cusUserInfoMapper;

    @Override
    @Transactional
    public CusUserInfoEntity addCusUserInfo(InfoBean infoBean) throws Exception {
        CusUserInfoEntity entity = new CusUserInfoEntity();
        entity.setPhone(infoBean.getPhone());
        cusUserInfoMapper.insertCusUserInfo(entity);
        return entity;
    }
}
