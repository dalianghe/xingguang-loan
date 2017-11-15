package com.xingguang.work.auth.service.impl;

import com.xingguang.work.auth.entity.WorkUserAuthEntity;
import com.xingguang.work.auth.mapper.WorkUserAuthMapper;
import com.xingguang.work.auth.params.AuthBean;
import com.xingguang.work.auth.service.IWorkUserAuthService;
import com.xingguang.work.info.params.InfoBean;
import com.xingguang.work.info.service.IWorkUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by admin on 2017/10/1.
 */
@Service
public class WorkUserAuthServiceImpl implements IWorkUserAuthService {

    @Autowired
    private WorkUserAuthMapper workUserAuthMapper;
    @Autowired
    private IWorkUserInfoService workUserInfoService;

    @Override
    public WorkUserAuthEntity findUserByPhone(String phone) throws Exception {
        return workUserAuthMapper.findUserByPhone(phone);
    }

    @Override
    @Transactional
    public WorkUserAuthEntity addWorkUserAuth(AuthBean authBean) throws Exception {
        WorkUserAuthEntity entity = new WorkUserAuthEntity();
        entity.setPhone(authBean.getPhone());
        entity.setCreateTime(new Date());
        workUserAuthMapper.insertWorkUserAuth(entity);
        return entity;
    }

    @Override
    @Transactional
    public WorkUserAuthEntity registerWorkUser(AuthBean authBean) throws Exception {
        WorkUserAuthEntity entity = this.addWorkUserAuth(authBean);
        InfoBean infoBean = new InfoBean();
        infoBean.setPhone(authBean.getPhone());
        infoBean.setOpenId(authBean.getOpenId());
        workUserInfoService.addWorkUserInfo(infoBean);
        return entity;
    }
}
