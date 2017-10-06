package com.xingguang.system.role.mapper;

import com.xingguang.system.role.entity.SysRoleEntity;
import com.xingguang.system.role.entity.custom.SysRoleEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/10/6.
 */
public interface SysRoleMapper {

    List<SysRoleEntityCustom> findSysRoleListByRoleName(SysRoleEntity sysRoleEntity) throws Exception;

    void insertSysRole(SysRoleEntity sysRoleEntity) throws Exception;

    void updateSysRole(SysRoleEntity sysRoleEntity) throws Exception;

}
