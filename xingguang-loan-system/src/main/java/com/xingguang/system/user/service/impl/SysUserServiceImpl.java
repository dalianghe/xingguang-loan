package com.xingguang.system.user.service.impl;

import com.xingguang.system.user.entity.SysUserEntity;
import com.xingguang.system.user.mapper.SysUserMapper;
import com.xingguang.system.user.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/9/22.
 */
@Service
public class SysUserServiceImpl implements ISysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUserEntity findUserByLoginId(String loginId) throws Exception {
        return sysUserMapper.findUserByLoginId(loginId);
    }
}
