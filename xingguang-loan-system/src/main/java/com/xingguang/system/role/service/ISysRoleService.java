package com.xingguang.system.role.service;

import com.xingguang.system.role.domain.RoleDomain;
import com.xingguang.system.role.entity.SysRoleEntity;
import com.xingguang.system.role.entity.custom.SysRoleEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/10/6.
 */
public interface ISysRoleService {

    public List<SysRoleEntityCustom> findSysRoleList(String roleName) throws Exception;

    public SysRoleEntity addSysRole(RoleDomain roleDomain) throws Exception;

    public SysRoleEntity updateSysRole(RoleDomain roleDomain) throws Exception;

    public List<SysRoleEntityCustom> findSysRoleResources(String roleName) throws Exception;

    public List<SysRoleEntityCustom> findResourcesByRoleId(Long roleId) throws Exception;

}
