package com.xingguang.work.login.mapper;

import com.xingguang.work.login.entity.WorkUserAuthEntity;

/**
 * Created by admin on 2017/10/1.
 */
public interface WorkUserAuthMapper {

    WorkUserAuthEntity findUserByPhone(String phone) throws Exception;
}
