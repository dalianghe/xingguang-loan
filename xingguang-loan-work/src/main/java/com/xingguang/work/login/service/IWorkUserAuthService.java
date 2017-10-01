package com.xingguang.work.login.service;

import com.xingguang.work.login.entity.WorkUserAuthEntity;

/**
 * Created by admin on 2017/10/1.
 */
public interface IWorkUserAuthService {
    public WorkUserAuthEntity findUserByPhone(String phone) throws Exception;
}
