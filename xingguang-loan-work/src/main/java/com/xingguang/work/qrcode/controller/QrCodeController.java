package com.xingguang.work.qrcode.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.work.qrcode.entity.custom.WorkQrCodeEntityCustom;
import com.xingguang.work.qrcode.params.QrCodeBean;
import com.xingguang.work.qrcode.service.IWorkQrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/10/2.
 */
@RestController
public class QrCodeController {

    @Autowired
    private IWorkQrCodeService workQrCodeService;

    @RequestMapping(value = "/qrcode/code" , method = RequestMethod.POST)
    public ResultBean<?> code(@RequestBody QrCodeBean qrCodeBean) throws Exception{
        ResultBean<?> resultBean = null;
        WorkQrCodeEntityCustom entityCustom = workQrCodeService.createWorkQrCode(qrCodeBean);
        resultBean = new ResultBean<>(entityCustom);
        return resultBean;
    }
}
