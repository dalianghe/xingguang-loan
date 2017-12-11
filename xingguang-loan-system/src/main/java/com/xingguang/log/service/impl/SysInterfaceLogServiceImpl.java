package com.xingguang.log.service.impl;

import com.xingguang.grid.service.IJxlGridReportService;
import com.xingguang.log.entity.SysInterfaceLogEntity;
import com.xingguang.log.mapper.SysInterfaceLogMapper;
import com.xingguang.log.service.ISysInterfaceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by admin on 2017/12/11.
 */
@Service
public class SysInterfaceLogServiceImpl implements ISysInterfaceLogService {

    @Autowired
    private SysInterfaceLogMapper sysInterfaceLogMapper;
    @Autowired
    IJxlGridReportService gridReportService;

    @Override
    public SysInterfaceLogEntity getLogByBizId(Long bizId) throws Exception {
        return sysInterfaceLogMapper.getLogByBiz(bizId);
    }

    @Override
    @Transactional
    public SysInterfaceLogEntity insertLog(Long userId,String userName, String idCard, String phone, String receiveData, Long bizId) throws Exception {
        SysInterfaceLogEntity entity = new SysInterfaceLogEntity();
        entity.setType(5);
        entity.setStatus(2);
        entity.setCreateTime(new Date());
        entity.setUpdateTime(new Date());
        entity.setRoleType(1);
        entity.setUserId(userId);
        entity.setName(userName);
        entity.setIdNo(idCard);
        entity.setPhone(phone);
        entity.setReceiveData(receiveData);
        entity.setBizId(bizId);
        sysInterfaceLogMapper.insertLog(entity);
        gridReportService.resolveGridReport(bizId,receiveData);
        return entity;
    }
}
