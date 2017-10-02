package com.xingguang.work.qrcode.mapper;

import com.xingguang.work.qrcode.entity.custom.WorkQrCodeEntityCustom;

/**
 * Created by admin on 2017/10/2.
 */
public interface WorkQrCodeMapper {

    WorkQrCodeEntityCustom findQrCodeByWorkUserId(Long workUserId) throws Exception;

    void insertWorkQrCode(WorkQrCodeEntityCustom workQrCodeEntity) throws Exception;

    void updateWorkQrCode(WorkQrCodeEntityCustom workQrCodeEntity) throws Exception;
}
