package com.xingguang.system.roleresource.service.impl;

import com.xingguang.system.roleresource.entity.SysRoleResourceEntity;
import com.xingguang.system.roleresource.mapper.SysRoleResourceMapper;
import com.xingguang.system.roleresource.service.ISysRoleResouceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/10/8.
 */
@Service
public class SysRoleResourceServiceImpl implements ISysRoleResouceService {

    @Autowired
    private SysRoleResourceMapper sysRoleResourceMapper;

    @Override
    @Transactional
    public void deleteRoleResourceByRoleId(Long roleId) throws Exception {
        sysRoleResourceMapper.deleteRoleResouceByRoleId(roleId);
    }

    @Override
    @Transactional
    public void insertRoleResource(Long roleId, List<Long> resList) throws Exception {
        List<SysRoleResourceEntity> list = new ArrayList<>();
        for(long resId : resList){
            SysRoleResourceEntity entity = new SysRoleResourceEntity();
            entity.setSysRoleId(roleId);
            entity.setSysResourceId(resId);
            list.add(entity);
        }
        sysRoleResourceMapper.insertRoleResource(list);
    }

    @Override
    @Transactional
    public void addRoleResource(Long roleId, List<Long> resList) throws Exception {

        // step 1 : 删除角色资源
        this.deleteRoleResourceByRoleId(roleId);
        // step 2: 插入角色资源
        if(resList!=null){
            this.insertRoleResource(roleId,resList);
        }

    }
}
