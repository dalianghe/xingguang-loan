package com.xingguang.work.qrcode.entity.custom;

import com.xingguang.work.qrcode.entity.WorkQrCodeEntity;

/**
 * Created by admin on 2017/10/2.
 */
public class WorkQrCodeEntityCustom extends WorkQrCodeEntity {

    private byte[] qrCode;

    public byte[] getQrCode() {
        return qrCode;
    }

    public void setQrCode(byte[] qrCode) {
        this.qrCode = qrCode;
    }
}
