package com.xingguang.system.user.service;

import com.xingguang.system.user.domain.SysUserDomain;
import com.xingguang.system.user.entity.SysUserEntity;
import com.xingguang.system.user.entity.custom.SysUserEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/9/24.
 */
public interface ISysUserService {

    public SysUserEntityCustom findSysUserById(Long userId) throws Exception;

    public SysUserEntityCustom findSysUserByLoginId(String loginId) throws Exception;

    public List<SysUserEntityCustom> findSysUserList() throws Exception;

    public SysUserEntityCustom updateSysUserById(SysUserDomain sysUserDomain) throws Exception;

    public SysUserEntityCustom addSysUser(SysUserDomain sysUserDomain) throws Exception;
}
