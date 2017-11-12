package com.xingguang.customer.qrcode.service;

import com.xingguang.customer.link.entity.CusUserLink;
import com.xingguang.customer.link.entity.CusUserLinkExample;
import com.xingguang.customer.qrcode.entity.WorkQrCode;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface ICusQrCodeService {

    WorkQrCode findByWorkUserId(Long workUserId);

    void update(WorkQrCode workQrCode);

}
