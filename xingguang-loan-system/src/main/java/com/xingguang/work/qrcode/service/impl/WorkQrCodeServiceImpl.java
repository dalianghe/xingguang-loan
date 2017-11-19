package com.xingguang.work.qrcode.service.impl;

import com.xingguang.work.qrcode.entity.WorkQrCodeEntity;
import com.xingguang.work.qrcode.mapper.WorkQrCodeMapper;
import com.xingguang.work.qrcode.service.IWorkQrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/11/19.
 */
@Service
public class WorkQrCodeServiceImpl implements IWorkQrCodeService {

    @Autowired
    private WorkQrCodeMapper workQrCodeMapper;

    @Override
    public List<WorkQrCodeEntity> findWorkQrCodeList() throws Exception {
        return workQrCodeMapper.findWorkQrCodeList();
    }
}
