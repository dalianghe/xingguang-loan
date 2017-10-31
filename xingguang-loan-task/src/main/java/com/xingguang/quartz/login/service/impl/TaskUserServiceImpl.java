package com.xingguang.quartz.login.service.impl;

import com.xingguang.quartz.login.domain.TaskUser;
import com.xingguang.quartz.login.repository.TaskUserRepository;
import com.xingguang.quartz.login.service.ITaskUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/10/31.
 */
@Service
public class TaskUserServiceImpl implements ITaskUserService {

    @Autowired
    private TaskUserRepository taskUserRepository;

    @Override
    public TaskUser findUserByAccount(String account) throws Exception {
        return taskUserRepository.findUserByAccount(account);
    }

}
