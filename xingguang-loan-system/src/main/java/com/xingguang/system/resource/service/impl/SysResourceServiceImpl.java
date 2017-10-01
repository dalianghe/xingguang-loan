package com.xingguang.system.resource.service.impl;

import com.xingguang.system.resource.entity.SysResourceEntity;
import com.xingguang.system.resource.entity.custom.SysResourceEntityCustom;
import com.xingguang.system.resource.mapper.SysResourceMapper;
import com.xingguang.system.resource.service.ISysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/9/30.
 */
@Service
public class SysResourceServiceImpl implements ISysResourceService {

    @Autowired
    private SysResourceMapper sysResourceMapper;

    @Override
    public List<SysResourceEntityCustom> findMenusByUserId(int userId) throws Exception {
        return sysResourceMapper.findMenusByUserId(userId);
    }
}
