package com.xingguang.system.user.service;

import com.xingguang.system.role.entity.custom.SysRoleEntityCustom;
import com.xingguang.system.user.domain.SysUserDomain;
import com.xingguang.system.user.entity.SysUserEntity;
import com.xingguang.system.user.entity.custom.SysUserEntityCustom;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/9/24.
 */
public interface ISysUserService {

    public SysUserEntityCustom findSysUserById(Long userId) throws Exception;

    public SysUserEntity findSysUserByLoginId(String loginId) throws Exception;

    public Map<String , Object> findSysUserList(SysUserDomain domain) throws Exception;

    public SysUserEntity updateSysUserById(SysUserDomain sysUserDomain) throws Exception;

    public SysUserEntity addSysUser(SysUserDomain sysUserDomain) throws Exception;

    public List<SysUserEntityCustom> findSysUserRoles(String userName) throws Exception;

    public List<SysRoleEntityCustom> findSysUserHaveRoles(Long userId) throws Exception;
}
