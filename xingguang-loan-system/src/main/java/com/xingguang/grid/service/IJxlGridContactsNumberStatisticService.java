package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridContactsNumberStatisticEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  14:35
 * @Version v1.0.0
 */
public interface IJxlGridContactsNumberStatisticService {

    public void deleteContactsNumberStatisticByBizId(Long bizId) throws Exception;

    public void insertContactsNumberStatistic(JxlGridContactsNumberStatisticEntity entity) throws Exception;

    public JxlGridContactsNumberStatisticEntity addContactsNumberStatistic(Long bizId , JxlGridContactsNumberStatisticEntity entity) throws Exception;

}
