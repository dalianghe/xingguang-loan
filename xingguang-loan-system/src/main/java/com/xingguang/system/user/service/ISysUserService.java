package com.xingguang.system.user.service;

import com.xingguang.system.user.entity.SysUserEntity;

/**
 * Created by admin on 2017/9/24.
 */
public interface ISysUserService {
    public SysUserEntity findUserByLoginId(String loginId) throws Exception;
}
