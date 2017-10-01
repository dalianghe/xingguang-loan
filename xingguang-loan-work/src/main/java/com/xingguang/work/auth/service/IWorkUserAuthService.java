package com.xingguang.work.auth.service;


import com.xingguang.work.auth.entity.WorkUserAuthEntity;
import com.xingguang.work.auth.params.AuthBean;

/**
 * Created by admin on 2017/10/1.
 */
public interface IWorkUserAuthService {

    public WorkUserAuthEntity findUserByPhone(String phone) throws Exception;

    public WorkUserAuthEntity addWorkUserAuth(AuthBean authBean) throws Exception;

    public WorkUserAuthEntity registerWorkUser(AuthBean authBean) throws Exception;
}
