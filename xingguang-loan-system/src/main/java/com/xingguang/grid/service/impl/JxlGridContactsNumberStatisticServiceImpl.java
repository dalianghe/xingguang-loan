package com.xingguang.grid.service.impl;

import com.xingguang.grid.entity.JxlGridContactsNumberStatisticEntity;
import com.xingguang.grid.mapper.JxlGridContactsNumberStatisticMapper;
import com.xingguang.grid.service.IJxlGridContactsNumberStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  14:37
 * @Version v1.0.0
 */
@Service
public class JxlGridContactsNumberStatisticServiceImpl implements IJxlGridContactsNumberStatisticService {

    @Autowired
    private JxlGridContactsNumberStatisticMapper contactsNumberStatisticMapper;

    @Override
    @Transactional
    public void deleteContactsNumberStatisticByBizId(Long bizId) throws Exception {
        contactsNumberStatisticMapper.deleteContactsNumberStatisticByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertContactsNumberStatistic(JxlGridContactsNumberStatisticEntity entity) throws Exception {
        contactsNumberStatisticMapper.insertContactsNumberStatistic(entity);
    }

    @Override
    @Transactional
    public JxlGridContactsNumberStatisticEntity addContactsNumberStatistic(Long bizId, JxlGridContactsNumberStatisticEntity entity) throws Exception {
        this.deleteContactsNumberStatisticByBizId(bizId);
        this.insertContactsNumberStatistic(entity);
        return entity;
    }
}
