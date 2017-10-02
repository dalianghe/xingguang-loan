package com.xingguang.work.qrcode.service.impl;

import com.xingguang.utils.qrcode.MatrixToBgImageConfig;
import com.xingguang.utils.qrcode.QrcodeUtils;
import com.xingguang.work.qrcode.entity.WorkQrCodeEntity;
import com.xingguang.work.qrcode.entity.custom.WorkQrCodeEntityCustom;
import com.xingguang.work.qrcode.mapper.WorkQrCodeMapper;
import com.xingguang.work.qrcode.params.QrCodeBean;
import com.xingguang.work.qrcode.service.IWorkQrCodeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by admin on 2017/10/2.
 */
@Service
public class WorkQrCodeServiceImpl implements IWorkQrCodeService {

    @Autowired
    private WorkQrCodeMapper workQrCodeMapper;

    @Override
    public WorkQrCodeEntityCustom createWorkQrCode(QrCodeBean qrCodeBean) throws Exception {
        WorkQrCodeEntityCustom entity = new WorkQrCodeEntityCustom();

        // 生成二维码
        MatrixToBgImageConfig config = new MatrixToBgImageConfig();
        config.setQrcode_url("http://baidu.com");
        config.setRealname("何大亮");
        byte[] bytes = QrcodeUtils.createQrcode(config);
        // 保存业务员二维码信息
        if(bytes!=null){
            BeanUtils.copyProperties(qrCodeBean,entity);
            entity.setCreateTime(new Date());
            workQrCodeMapper.insertWorkQrCode(entity);
        }
        entity.setQrCode(bytes);
        return entity;
    }
}
