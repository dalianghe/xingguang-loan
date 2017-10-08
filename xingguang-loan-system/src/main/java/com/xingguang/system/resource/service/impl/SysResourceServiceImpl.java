package com.xingguang.system.resource.service.impl;

import com.xingguang.constant.SystemConstant;
import com.xingguang.system.resource.domain.ResourceDomain;
import com.xingguang.system.resource.entity.SysResourceEntity;
import com.xingguang.system.resource.entity.custom.SysResourceEntityCustom;
import com.xingguang.system.resource.mapper.SysResourceMapper;
import com.xingguang.system.resource.service.ISysResourceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/9/30.
 */
@Service
public class SysResourceServiceImpl implements ISysResourceService {

    @Autowired
    private SysResourceMapper sysResourceMapper;

    @Override
    public List<SysResourceEntityCustom> findMenusByUserId(Long userId) throws Exception {
        return sysResourceMapper.findMenusByUserId(userId);
    }

    @Override
    public List<SysResourceEntityCustom> findResourceAll(String resName) throws Exception {
        SysResourceEntity sysResourceEntity = new SysResourceEntity();
        sysResourceEntity.setResName(resName);
        return sysResourceMapper.findResourceAll(sysResourceEntity);
    }

    @Override
    public SysResourceEntity addResource(ResourceDomain resourceDomain) throws Exception {
        SysResourceEntity sysResourceEntity = new SysResourceEntity();
        BeanUtils.copyProperties(resourceDomain,sysResourceEntity);
        sysResourceEntity.setCreateTime(new Date());
        sysResourceEntity.setUpdateTime(new Date());
        sysResourceMapper.insertSysResource(sysResourceEntity);
        return sysResourceEntity;
    }

    @Override
    public SysResourceEntity updateResource(ResourceDomain resourceDomain) throws Exception {
        SysResourceEntity sysResourceEntity = new SysResourceEntity();
        BeanUtils.copyProperties(resourceDomain,sysResourceEntity);
        if(sysResourceEntity.getDeleteFlag().equals(SystemConstant.DELETE_Y)){
            sysResourceEntity.setDeleteTime(new Date());
        }
        sysResourceEntity.setUpdateTime(new Date());
        sysResourceMapper.updateSysResource(sysResourceEntity);
        return sysResourceEntity;
    }
}
