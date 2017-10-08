package com.xingguang.system.roleresource.mapper;

import com.xingguang.system.roleresource.entity.SysRoleResourceEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/8.
 */
public interface SysRoleResourceMapper {

    void deleteRoleResouceByRoleId(Long roleId) throws Exception;

    void insertRoleResource(List<SysRoleResourceEntity> list) throws Exception;

}
