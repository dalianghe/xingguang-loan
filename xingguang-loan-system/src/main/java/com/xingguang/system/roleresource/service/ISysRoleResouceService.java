package com.xingguang.system.roleresource.service;

import java.util.List;

/**
 * Created by admin on 2017/10/8.
 */
public interface ISysRoleResouceService {

    public void deleteRoleResourceByRoleId(Long roleId) throws Exception;

    public void insertRoleResource(Long roleId, List<Long> resList) throws Exception;

    public void addRoleResource(Long roleId, List<Long> resList) throws Exception;

}
