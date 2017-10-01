package com.xingguang.customer.login.service;

import com.xingguang.customer.login.entity.CusUserAuthEntity;

/**
 * Created by admin on 2017/10/1.
 */
public interface ICusUserAuthService {
    public CusUserAuthEntity findUserByPhone(String phone) throws Exception;
}
