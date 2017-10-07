package com.xingguang.system.userrole.service.impl;

import com.xingguang.system.userrole.entity.SysUserRoleEntity;
import com.xingguang.system.userrole.mapper.SysUserRoleMapper;
import com.xingguang.system.userrole.service.ISysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/10/7.
 */
@Service
public class SysUserRoleServiceImpl implements ISysUserRoleService {

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    @Transactional
    public void deleteUserRoleByUserId(Long userId) throws Exception {
        sysUserRoleMapper.deleteUserRoleByUserId(userId);
    }

    @Override
    @Transactional
    public void insertUserRole(Long userId, List<Long> roleList) throws Exception {
        List<SysUserRoleEntity> list = new ArrayList<>();
        for(long roleId : roleList){
            SysUserRoleEntity entity = new SysUserRoleEntity();
            entity.setSysUserId(userId);
            entity.setSysRoleId(roleId);
            list.add(entity);
        }
        sysUserRoleMapper.insertUserRole(list);
    }

    @Override
    @Transactional
    public void addUserRole(Long userId, List<Long> roleList) throws Exception {

        // step 1 : 删除用户已有角色
        this.deleteUserRoleByUserId(userId);

        // step 2: 插入用户新角色
        this.insertUserRole(userId,roleList);

    }

}
