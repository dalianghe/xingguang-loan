package com.xingguang.system.user.mapper;


import com.xingguang.system.user.entity.SysUserEntity;
import com.xingguang.system.user.entity.custom.SysUserEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/9/22.
 */
public interface SysUserMapper {

    SysUserEntityCustom findSysUserById(Long userId) throws Exception;

    SysUserEntity findSysUserByLoginId(String loginId) throws Exception;

    List<SysUserEntityCustom> findSysUserList(SysUserEntity sysUserEntity) throws Exception;

    void updateSysUserById(SysUserEntity sysUserEntity) throws Exception;

    void insertSysUser(SysUserEntity sysUserEntity) throws Exception;

    List<SysUserEntityCustom> findSysUserRoles(SysUserEntity sysUserEntity) throws Exception;
}
