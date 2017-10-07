package com.xingguang.system.userrole.service;

import java.util.List;

/**
 * Created by admin on 2017/10/7.
 */
public interface ISysUserRoleService {

    public void deleteUserRoleByUserId(Long userId) throws Exception;

    public void insertUserRole(Long userId, List<Long> roleList) throws Exception;

    public void addUserRole(Long userId, List<Long> roleList) throws Exception;

}
