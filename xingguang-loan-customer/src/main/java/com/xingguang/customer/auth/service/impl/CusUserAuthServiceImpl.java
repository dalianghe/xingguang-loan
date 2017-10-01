package com.xingguang.customer.auth.service.impl;

import com.xingguang.customer.auth.entity.CusUserAuthEntity;
import com.xingguang.customer.auth.mapper.CusUserAuthMapper;
import com.xingguang.customer.auth.params.AuthBean;
import com.xingguang.customer.auth.service.ICusUserAuthService;
import com.xingguang.customer.info.params.InfoBean;
import com.xingguang.customer.info.service.ICusUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2017/10/1.
 */
@Service
public class CusUserAuthServiceImpl implements ICusUserAuthService {

    @Autowired
    private CusUserAuthMapper cusUserAuthMapper;
    @Autowired
    private ICusUserInfoService cusUserInfoService;

    @Override
    public CusUserAuthEntity findUserByPhone(String phone) throws Exception {
        return cusUserAuthMapper.findCusUserByPhone(phone);
    }

    @Override
    @Transactional
    public CusUserAuthEntity addCusUserAuth(AuthBean authBean) throws Exception {
        CusUserAuthEntity entity = new CusUserAuthEntity();
        entity.setPhone(authBean.getPhone());
        cusUserAuthMapper.insertCusUserAuth(entity);
        return entity;
    }

    @Override
    @Transactional
    public CusUserAuthEntity registerCusUser(AuthBean authBean) throws Exception {
        CusUserAuthEntity entity = this.addCusUserAuth(authBean);
        InfoBean infoBean = new InfoBean();
        infoBean.setPhone(authBean.getPhone());
        cusUserInfoService.addCusUserInfo(infoBean);
        return entity;
    }

}
