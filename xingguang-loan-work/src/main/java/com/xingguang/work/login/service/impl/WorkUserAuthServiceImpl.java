package com.xingguang.work.login.service.impl;

import com.xingguang.work.login.entity.WorkUserAuthEntity;
import com.xingguang.work.login.mapper.WorkUserAuthMapper;
import com.xingguang.work.login.service.IWorkUserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/10/1.
 */
@Service
public class WorkUserAuthServiceImpl implements IWorkUserAuthService {
    @Autowired
    private WorkUserAuthMapper workUserAuthMapper;

    @Override
    public WorkUserAuthEntity findUserByPhone(String phone) throws Exception {
        return workUserAuthMapper.findUserByPhone(phone);
    }
}
