package com.xingguang.work.auth.mapper;

import com.xingguang.work.auth.entity.WorkUserAuthEntity;

/**
 * Created by admin on 2017/10/1.
 */
public interface WorkUserAuthMapper {

    WorkUserAuthEntity findUserByPhone(String phone) throws Exception;

    void insertWorkUserAuth(WorkUserAuthEntity workUserAuthEntity) throws Exception;
}
