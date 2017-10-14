package com.xingguang.customer.auth.service;

import com.xingguang.customer.auth.entity.CusUserAuthEntity;
import com.xingguang.customer.auth.params.AuthBean;
import com.xingguang.customer.info.entity.CusUserInfo;

/**
 * Created by admin on 2017/10/1.
 */
public interface ICusUserAuthService {

    CusUserAuthEntity findUserByPhone(String phone) throws Exception;

    CusUserAuthEntity addCusUserAuth(AuthBean authBean) throws Exception;

    CusUserInfo registerCusUser(AuthBean authBean) throws Exception;

}
