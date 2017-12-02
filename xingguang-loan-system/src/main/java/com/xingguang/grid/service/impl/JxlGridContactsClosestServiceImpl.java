package com.xingguang.grid.service.impl;

import com.xingguang.grid.entity.JxlGridContactsClosestEntity;
import com.xingguang.grid.entity.JxlGridContactsRfmEntity;
import com.xingguang.grid.mapper.JxlGridContactsClosestMapper;
import com.xingguang.grid.mapper.JxlGridContactsRfmMapper;
import com.xingguang.grid.service.IJxlGridContactsClosestService;
import com.xingguang.grid.service.IJxlGridContactsRfmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  15:38
 * @Version v1.0.0
 */
@Service
public class JxlGridContactsClosestServiceImpl implements IJxlGridContactsClosestService {

    @Autowired
    private JxlGridContactsClosestMapper contactsClosestMapper;

    @Override
    @Transactional
    public void deleteContactsClosestByBizId(Long bizId) throws Exception {
        contactsClosestMapper.deleteContactsClosestByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertContactsClosest(JxlGridContactsClosestEntity entity) throws Exception {
        contactsClosestMapper.insertContactsClosest(entity);
    }

    @Override
    @Transactional
    public JxlGridContactsClosestEntity addContactsClosest(Long bizId, JxlGridContactsClosestEntity entity) throws Exception {
        this.deleteContactsClosestByBizId(bizId);
        this.insertContactsClosest(entity);
        return entity;
    }
}
