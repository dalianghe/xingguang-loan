package com.xingguang.log.service;

import com.xingguang.log.entity.SysInterfaceLogEntity;

/**
 * Created by admin on 2017/12/11.
 */
public interface ISysInterfaceLogService {

    public SysInterfaceLogEntity getLogByBizId(Long bizId) throws Exception;

    public SysInterfaceLogEntity insertLog(Long userId,String userName,String idCard,String phone,String receiveData,Long bizId) throws Exception;

}
