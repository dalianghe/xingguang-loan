package com.xingguang.quartz.login.service;

import com.xingguang.quartz.login.domain.TaskUser;

/**
 * Created by admin on 2017/10/31.
 */
public interface ITaskUserService {

    TaskUser findUserByAccount(String account) throws Exception;

}
