package com.xingguang.grid.mapper;

import com.xingguang.grid.entity.JxlGridContactsRfmEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  15:21
 * @Version v1.0.0
 */
public interface JxlGridContactsRfmMapper {

    void deleteContactsRfmByBizId(Long bizId) throws Exception;

    void insertContactsRfm(JxlGridContactsRfmEntity entity) throws Exception;

}
