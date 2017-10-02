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
    public WorkQrCodeEntityCustom findQrCodeByWorkUserId(Long workUserId) throws Exception {
        return workQrCodeMapper.findQrCodeByWorkUserId(workUserId);
    }

    @Override
    public WorkQrCodeEntityCustom insertWorkQrCode(QrCodeBean qrCodeBean) throws Exception {
        WorkQrCodeEntityCustom entity = new WorkQrCodeEntityCustom();
        BeanUtils.copyProperties(qrCodeBean, entity);
        entity.setCreateTime(new Date());
        entity.setUpdateTime(new Date());
        workQrCodeMapper.insertWorkQrCode(entity);
        return entity;
    }

    @Override
    public void updateWorkQrCode(WorkQrCodeEntityCustom workQrCodeEntity) throws Exception {
        workQrCodeMapper.updateWorkQrCode(workQrCodeEntity);
    }

    @Override
    public WorkQrCodeEntityCustom createWorkQrCode(QrCodeBean qrCodeBean) throws Exception {

        WorkQrCodeEntityCustom entity = null ;
        // 生成二维码
        MatrixToBgImageConfig config = new MatrixToBgImageConfig();
        config.setQrcode_url("http://baidu.com");
        config.setRealname("何大亮");
        byte[] bytes = QrcodeUtils.createQrcode(config);

        // step 1: 检查业务员是否已存在二维码（包括已用和未用）
        // step 2: 判断二维码状态
        //            1）状态为已用，更新二维码表中的经纬度并把状态设置为未使用
        //            2）状态为未使用，只更新二维码表中的经纬度，不做状态更新
        if(bytes!=null) { // 二维码生成成功，做数据库保存操作
            entity = this.findQrCodeByWorkUserId(qrCodeBean.getWorkUserId());
            if (entity == null) { // 不存在业务员二维码 ,做插入
                entity = this.insertWorkQrCode(qrCodeBean);
            } else { // 不存在业务员二维码，做更新
                if (entity.getStatus() == 2) {
                    entity.setStatus(1);
                }
                entity.setLng(qrCodeBean.getLng());
                entity.setLat(qrCodeBean.getLat());
                entity.setUpdateTime(new Date());
                this.updateWorkQrCode(entity);
            }
        }
        entity.setQrCode(bytes);
        return entity;
    }
}
