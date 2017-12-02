package com.xingguang.grid.mapper;

import com.xingguang.grid.entity.JxlGridContactsNumberStatisticEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  14:15
 * @Version v1.0.0
 */
public interface JxlGridContactsNumberStatisticMapper {

    void deleteContactsNumberStatisticByBizId(Long bizId) throws Exception;

    void insertContactsNumberStatistic(JxlGridContactsNumberStatisticEntity entity) throws Exception;

}
