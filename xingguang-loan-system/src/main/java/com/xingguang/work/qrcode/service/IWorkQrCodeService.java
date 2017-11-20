package com.xingguang.work.qrcode.service;

import com.xingguang.work.qrcode.entity.WorkQrCodeEntity;

import java.util.List;

/**
 * Created by admin on 2017/11/19.
 */
public interface IWorkQrCodeService {

    public List<WorkQrCodeEntity> findWorkQrCodeList() throws Exception;

}
