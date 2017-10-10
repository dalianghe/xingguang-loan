package com.xingguang.customer.info.service;

import com.xingguang.customer.info.entity.CusUserInfo;

/**
 * Created by admin on 2017/10/1.
 */
public interface ICusUserInfoService {

    int create(CusUserInfo cusUserInfo);

    int update(CusUserInfo cusUserInfo);

    CusUserInfo findById(Long id);

    CusUserInfo findByPhone(String phone);

}
