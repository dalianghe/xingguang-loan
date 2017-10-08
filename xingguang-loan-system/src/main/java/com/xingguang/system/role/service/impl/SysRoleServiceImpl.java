package com.xingguang.system.role.service.impl;

import com.xingguang.constant.SystemConstant;
import com.xingguang.system.role.domain.RoleDomain;
import com.xingguang.system.role.entity.SysRoleEntity;
import com.xingguang.system.role.entity.custom.SysRoleEntityCustom;
import com.xingguang.system.role.mapper.SysRoleMapper;
import com.xingguang.system.role.service.ISysRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/10/6.
 */
@Service
public class SysRoleServiceImpl implements ISysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRoleEntityCustom> findSysRoleList(String roleName) throws Exception {
        SysRoleEntity sysRoleEntity = new SysRoleEntity();
        if(!StringUtils.isEmpty(roleName)){
            sysRoleEntity.setRoleName(roleName);
        }
        return sysRoleMapper.findSysRoleListByRoleName(sysRoleEntity);
    }

    @Override
    public SysRoleEntity addSysRole(RoleDomain roleDomain) throws Exception {
        SysRoleEntity sysRoleEntity = new SysRoleEntity();
        sysRoleEntity.setRoleCode(roleDomain.getRoleCode());
        sysRoleEntity.setRoleName(roleDomain.getRoleName());
        sysRoleEntity.setRoleType(roleDomain.getRoleType());
        sysRoleEntity.setStatus(roleDomain.getStatus());
        sysRoleEntity.setCreateTime(new Date());
        sysRoleEntity.setUpdateTime(new Date());
        sysRoleMapper.insertSysRole(sysRoleEntity);
        return sysRoleEntity;
    }

    @Override
    public SysRoleEntity updateSysRole(RoleDomain roleDomain) throws Exception {
        SysRoleEntity sysRoleEntity = new SysRoleEntity();
        BeanUtils.copyProperties(roleDomain,sysRoleEntity);
        if(roleDomain.getDeleteFlag().equals(SystemConstant.DELETE_Y)){
            sysRoleEntity.setDeleteFlag(SystemConstant.DELETE_Y);
            sysRoleEntity.setDeleteTime(new Date());
        }
        sysRoleEntity.setUpdateTime(new Date());
        sysRoleMapper.updateSysRole(sysRoleEntity);
        return sysRoleEntity;
    }

    @Override
    public List<SysRoleEntityCustom> findSysRoleResources(String roleName) throws Exception {
        SysRoleEntity sysRoleEntity = new SysRoleEntity();
        sysRoleEntity.setRoleName(roleName);
        List<SysRoleEntityCustom> list = sysRoleMapper.findSysRoleResources(sysRoleEntity);
        return list;
    }

    @Override
    public List<SysRoleEntityCustom> findResourcesByRoleId(Long roleId) throws Exception {
        return sysRoleMapper.findSysRoleHaveResources(roleId);
    }
}
