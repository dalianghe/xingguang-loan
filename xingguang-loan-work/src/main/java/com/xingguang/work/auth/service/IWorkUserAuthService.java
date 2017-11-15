package com.xingguang.work.auth.service;


import com.xingguang.work.auth.entity.WorkUserAuthEntity;
import com.xingguang.work.auth.params.AuthBean;
import com.xingguang.work.info.entity.WorkUserInfoEntity;

/**
 * Created by admin on 2017/10/1.
 */
public interface IWorkUserAuthService {

    public WorkUserAuthEntity findUserByPhone(String phone) throws Exception;

    public WorkUserAuthEntity addWorkUserAuth(AuthBean authBean) throws Exception;

    public WorkUserInfoEntity registerWorkUser(AuthBean authBean) throws Exception;
}
