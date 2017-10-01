package com.xingguang.customer.auth.mapper;

import com.xingguang.customer.auth.entity.CusUserAuthEntity;

/**
 * Created by admin on 2017/10/1.
 */
public interface CusUserAuthMapper {

    CusUserAuthEntity findCusUserByPhone(String phone) throws Exception;

    void insertCusUserAuth(CusUserAuthEntity cusUserAuthEntity) throws Exception;

}
