package com.xingguang.customer.login.service.impl;

import com.xingguang.customer.login.entity.CusUserAuthEntity;
import com.xingguang.customer.login.mapper.CusUserAuthMapper;
import com.xingguang.customer.login.service.ICusUserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/10/1.
 */
@Service
public class CusUserAuthServiceImpl implements ICusUserAuthService {
    @Autowired
    private CusUserAuthMapper cusUserAuthMapper;

    @Override
    public CusUserAuthEntity findUserByPhone(String phone) throws Exception {
        return cusUserAuthMapper.findUserByPhone(phone);
    }
}
