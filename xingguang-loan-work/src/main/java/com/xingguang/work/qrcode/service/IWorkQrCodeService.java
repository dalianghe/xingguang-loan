package com.xingguang.work.qrcode.service;

import com.xingguang.work.qrcode.entity.WorkQrCodeEntity;
import com.xingguang.work.qrcode.entity.custom.WorkQrCodeEntityCustom;
import com.xingguang.work.qrcode.params.QrCodeBean;

/**
 * Created by admin on 2017/10/2.
 */
public interface IWorkQrCodeService {

    public WorkQrCodeEntityCustom findQrCodeByWorkUserId(Long workUserId) throws Exception;

    public WorkQrCodeEntityCustom insertWorkQrCode(QrCodeBean qrCodeBean) throws Exception;

    public void updateWorkQrCode(WorkQrCodeEntityCustom workQrCodeEntity) throws Exception;

    public WorkQrCodeEntityCustom createWorkQrCode(QrCodeBean qrCodeBean) throws Exception;

    public WorkQrCodeEntityCustom createBizQrCode(Long ownerId) throws Exception;
}
