package com.xingguang.log.mapper;

import com.xingguang.log.entity.SysInterfaceLogEntity;

/**
 * Created by admin on 2017/12/11.
 */
public interface SysInterfaceLogMapper {

    SysInterfaceLogEntity getLogByBiz(Long bizId) throws Exception;

    void insertLog(SysInterfaceLogEntity entity) throws Exception;

}
