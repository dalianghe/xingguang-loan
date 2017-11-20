package com.xingguang.work.qrcode.service.impl;

import com.xingguang.exception.CustomException;
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
        config.setQrcode_url("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx56e3a34a9f127f04&redirect_uri=http://www.xingguangqb.com/web/cus/index.html%23/register/" + qrCodeBean.getWorkUserId() + "&response_type=code&scope=snsapi_base&state=1#wechat_redirect");
        //config.setRealname("何大亮");
        byte[] bytes = QrcodeUtils.createQrcode(config);

        if(bytes!=null) { // 二维码生成成功，做数据库保存操作
            entity = this.findQrCodeByWorkUserId(qrCodeBean.getWorkUserId());
            if (entity == null) { // 不存在业务员二维码 ,做插入
                entity = this.insertWorkQrCode(qrCodeBean);
            } else { // 存在业务员二维码，做更新
                entity.setLng(qrCodeBean.getLng());
                entity.setLat(qrCodeBean.getLat());
                entity.setUpdateTime(new Date());
                this.updateWorkQrCode(entity);
            }
        }
        entity.setQrCode(bytes);
        return entity;
    }

    @Override
    public WorkQrCodeEntityCustom createBizQrCode(Long ownerId) throws Exception {
        WorkQrCodeEntityCustom entity = null ;
        // 生成二维码
        MatrixToBgImageConfig config = new MatrixToBgImageConfig();
        config.setQrcode_url("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx56e3a34a9f127f04&redirect_uri=http://www.xingguangqb.com/web/work/index.html%23/register/"+ownerId+"&response_type=code&scope=snsapi_base&state=1#wechat_redirect");
        byte[] bytes = QrcodeUtils.createQrcode(config);
        if(bytes==null) {
            throw new CustomException("生成二维码错误！");
        }
        entity.setQrCode(bytes);
        return entity;
    }
}
