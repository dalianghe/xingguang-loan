package com.xingguang.qrcode;

import com.xingguang.work.qrcode.entity.WorkQrCodeEntity;
import com.xingguang.work.qrcode.entity.custom.WorkQrCodeEntityCustom;
import com.xingguang.work.qrcode.params.QrCodeBean;
import com.xingguang.work.qrcode.service.IWorkQrCodeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by admin on 2017/10/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QrCodeTest {

    @Autowired
    private IWorkQrCodeService workQrCodeService;

    @Test
    public void testFindQrCodeByWorkUserId() throws Exception{
        WorkQrCodeEntityCustom entityCustom = workQrCodeService.findQrCodeByWorkUserId(8L);
        System.out.println(entityCustom);
    }

    @Test
    public void testCreateWorkQrCode() throws Exception{
        QrCodeBean bean = new QrCodeBean(8L, "3000", "3000");
        WorkQrCodeEntity entity = workQrCodeService.createWorkQrCode(bean);
        System.out.println(entity.toString());
    }
}
