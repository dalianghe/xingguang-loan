package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridContactsClosestEntity;
import com.xingguang.grid.entity.JxlGridContactsRfmEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  15:36
 * @Version v1.0.0
 */
public interface IJxlGridContactsClosestService {

    public void deleteContactsClosestByBizId(Long bizId) throws Exception;

    public void insertContactsClosest(JxlGridContactsClosestEntity entity) throws Exception;

    public JxlGridContactsClosestEntity addContactsClosest(Long bizId, JxlGridContactsClosestEntity entity) throws Exception;

}
