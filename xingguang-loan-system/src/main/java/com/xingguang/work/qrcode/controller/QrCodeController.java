package com.xingguang.work.qrcode.controller;

import com.xingguang.common.beans.ResultBean;
import com.xingguang.work.qrcode.entity.WorkQrCodeEntity;
import com.xingguang.work.qrcode.service.IWorkQrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/11/19.
 */
@RestController
public class QrCodeController {

    @Autowired
    private IWorkQrCodeService workQrCodeService;

    @RequestMapping(value = "/qrcode/all" , method = RequestMethod.GET)
    public ResultBean<?> all() throws Exception{
        ResultBean<?> resultBean = null;
        List<WorkQrCodeEntity> list = workQrCodeService.findWorkQrCodeList();
        resultBean = new ResultBean<>(list);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }

}
