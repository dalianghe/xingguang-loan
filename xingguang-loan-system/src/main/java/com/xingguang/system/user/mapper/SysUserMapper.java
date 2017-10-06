package com.xingguang.system.user.mapper;


import com.xingguang.system.user.entity.SysUserEntity;
import com.xingguang.system.user.entity.custom.SysUserEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/9/22.
 */
public interface SysUserMapper {

    SysUserEntityCustom findSysUserById(Long userId) throws Exception;

    SysUserEntityCustom findSysUserByLoginId(String loginId) throws Exception;

    List<SysUserEntityCustom> findSysUserList() throws Exception;

    void updateSysUserById(SysUserEntityCustom sysUserEntityCustom) throws Exception;

    void insertSysUser(SysUserEntityCustom sysUserEntityCustom) throws Exception;
}
