package com.xingguang.utils.interfacelog.service.impl;

import com.xingguang.utils.interfacelog.entity.SysInterfaceLogWithBLOBs;
import com.xingguang.utils.interfacelog.mapper.SysInterfaceLogMapper;
import com.xingguang.utils.interfacelog.service.ISysInterfaceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class SysInterfaceLogServiceImpl implements ISysInterfaceLogService {

    @Autowired
    private SysInterfaceLogMapper sysInterfaceLogMapper;

    @Override
    public void create(SysInterfaceLogWithBLOBs sysInterfaceLogWithBLOBs) {
        this.sysInterfaceLogMapper.insertSelective(sysInterfaceLogWithBLOBs);
    }
}
