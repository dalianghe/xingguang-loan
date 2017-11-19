package com.xingguang.work.qrcode.mapper;

import com.xingguang.work.qrcode.entity.WorkQrCodeEntity;

import java.util.List;

/**
 * Created by admin on 2017/11/19.
 */
public interface WorkQrCodeMapper {

    List<WorkQrCodeEntity> findWorkQrCodeList() throws Exception;

}
