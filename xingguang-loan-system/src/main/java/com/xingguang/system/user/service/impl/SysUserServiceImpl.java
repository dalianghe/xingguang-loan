package com.xingguang.system.user.service.impl;

import com.xingguang.system.user.domain.SysUserDomain;
import com.xingguang.system.user.entity.custom.SysUserEntityCustom;
import com.xingguang.system.user.mapper.SysUserMapper;
import com.xingguang.system.user.service.ISysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/9/22.
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserEntityCustom findSysUserById(Long userId) throws Exception {
        return sysUserMapper.findSysUserById(userId);
    }


    @Override
    public SysUserEntityCustom findSysUserByLoginId(String loginId) throws Exception {
        return sysUserMapper.findSysUserByLoginId(loginId);
    }

    @Override
    public List<SysUserEntityCustom> findSysUserList() throws Exception {
        return sysUserMapper.findSysUserList();
    }

    @Override
    public SysUserEntityCustom updateSysUserById(SysUserDomain domain) throws Exception {
        SysUserEntityCustom entity = new SysUserEntityCustom();
        BeanUtils.copyProperties(domain,entity);
        entity.setUpdateTime(new Date());
        sysUserMapper.updateSysUserById(entity);
        return entity;
    }
}
