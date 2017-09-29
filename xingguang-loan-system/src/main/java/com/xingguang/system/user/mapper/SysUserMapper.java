package com.xingguang.system.user.mapper;


import com.xingguang.system.user.entity.SysUserEntity;

/**
 * Created by admin on 2017/9/22.
 */
public interface SysUserMapper {
    SysUserEntity findUserByLoginId(String loginId) throws Exception;
}
