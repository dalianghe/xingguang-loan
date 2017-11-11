package com.xingguang.customer.info.service;

import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.params.UserInfoParam;

/**
 * Created by admin on 2017/10/1.
 */
public interface ICusUserInfoService {

    int create(CusUserInfo cusUserInfo);

    int update(CusUserInfo cusUserInfo);

    int update(UserInfoParam userInfoParam);

    CusUserInfo findById(Long id);

    CusUserInfo findByPhone(String phone);

}
