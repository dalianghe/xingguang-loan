package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridContactsRfmEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  15:36
 * @Version v1.0.0
 */
public interface IJxlGridContactsRfmService {

    public void deleteContactsRfmByBizId(Long bizId) throws Exception;

    public void insertContactsRfm(JxlGridContactsRfmEntity entity) throws Exception;

    public JxlGridContactsRfmEntity addContactsRfm(Long bizId , JxlGridContactsRfmEntity entity) throws Exception;

}
