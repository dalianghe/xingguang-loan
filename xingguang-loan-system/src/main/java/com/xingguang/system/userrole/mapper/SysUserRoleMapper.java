package com.xingguang.system.userrole.mapper;

import com.xingguang.system.userrole.entity.SysUserRoleEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/7.
 */
public interface SysUserRoleMapper {

    void deleteUserRoleByUserId(Long sysUserId) throws Exception;

    void insertUserRole(List<SysUserRoleEntity> list) throws Exception;
}
