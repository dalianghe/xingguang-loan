package com.xingguang.work.qrcode.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.work.qrcode.entity.custom.WorkQrCodeEntityCustom;
import com.xingguang.work.qrcode.params.QrCodeBean;
import com.xingguang.work.qrcode.service.IWorkQrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by admin on 2017/10/2.
 */
@RestController
public class QrCodeController {

    @Autowired
    private IWorkQrCodeService workQrCodeService;

    @RequestMapping(value = "/qrcode/code/{workUserId}/{lng}/{lat}" , method = RequestMethod.GET)
    public void code(HttpServletResponse response, @PathVariable Long workUserId,
                     @PathVariable String lng, @PathVariable String lat) throws Exception{
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        QrCodeBean qrCodeBean = new QrCodeBean(workUserId, lng, lat);
        WorkQrCodeEntityCustom entityCustom = workQrCodeService.createWorkQrCode(qrCodeBean);
//        resultBean = new ResultBean<>(entityCustom);
//        resultBean.setBizCode(ResultBean.SUCCESS);
        response.getOutputStream().write(entityCustom.getQrCode());
    }
}
