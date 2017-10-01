package com.xingguang.customer.auth.service;

import com.xingguang.customer.auth.entity.CusUserAuthEntity;
import com.xingguang.customer.auth.params.AuthBean;

/**
 * Created by admin on 2017/10/1.
 */
public interface ICusUserAuthService {

    public CusUserAuthEntity findUserByPhone(String phone) throws Exception;

    public CusUserAuthEntity addCusUserAuth(AuthBean authBean) throws Exception;

    public CusUserAuthEntity registerCusUser(AuthBean authBean) throws Exception;

}
