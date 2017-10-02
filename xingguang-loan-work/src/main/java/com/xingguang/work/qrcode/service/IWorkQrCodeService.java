package com.xingguang.work.qrcode.service;

import com.xingguang.work.qrcode.entity.custom.WorkQrCodeEntityCustom;
import com.xingguang.work.qrcode.params.QrCodeBean;

/**
 * Created by admin on 2017/10/2.
 */
public interface IWorkQrCodeService {

    public WorkQrCodeEntityCustom createWorkQrCode(QrCodeBean qrCodeBean) throws Exception;
}
