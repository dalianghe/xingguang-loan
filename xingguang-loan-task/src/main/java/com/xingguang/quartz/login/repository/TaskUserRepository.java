package com.xingguang.quartz.login.repository;

import com.xingguang.quartz.login.domain.TaskUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2017/10/31.
 */
public interface TaskUserRepository extends JpaRepository<TaskUser, Integer> {

    TaskUser findUserByAccount(String account) throws Exception;

}
