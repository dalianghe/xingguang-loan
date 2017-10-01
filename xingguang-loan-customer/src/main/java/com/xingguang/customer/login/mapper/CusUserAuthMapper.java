package com.xingguang.customer.login.mapper;

import com.xingguang.customer.login.entity.CusUserAuthEntity;

/**
 * Created by admin on 2017/10/1.
 */
public interface CusUserAuthMapper {
    CusUserAuthEntity findUserByPhone(String phone) throws Exception;
}
