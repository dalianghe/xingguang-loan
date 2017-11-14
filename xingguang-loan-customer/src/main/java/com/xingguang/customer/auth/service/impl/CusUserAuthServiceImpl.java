package com.xingguang.customer.auth.service.impl;

import com.xingguang.customer.auth.entity.CusUserAuthEntity;
import com.xingguang.customer.auth.mapper.CusUserAuthMapper;
import com.xingguang.customer.auth.params.AuthBean;
import com.xingguang.customer.auth.service.ICusUserAuthService;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.service.ICusUserInfoService;
import com.xingguang.customer.worker.entity.WorkUserInfo;
import com.xingguang.customer.worker.service.IWorkUserInfoService;
import com.xingguang.exception.CustomException;
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
    @Autowired
    private IWorkUserInfoService workUserInfoService;

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
    public CusUserInfo registerCusUser(AuthBean authBean) throws Exception {
        this.addCusUserAuth(authBean);
        WorkUserInfo workUserInfo = this.workUserInfoService.getWorkUserInfoById(authBean.getWorkUserId());
        if(workUserInfo == null){
            throw new CustomException("业务员不存在");
        }
        CusUserInfo cusUserInfo = new CusUserInfo();
        cusUserInfo.setPhone(authBean.getPhone());
        cusUserInfo.setWorkUserId(authBean.getWorkUserId());
        cusUserInfo.setWorkUserName(workUserInfo.getName());
        cusUserInfo.setOpenId(authBean.getOpenId());
        this.cusUserInfoService.create(cusUserInfo);
        return cusUserInfo;
    }

}
