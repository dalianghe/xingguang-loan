package com.xingguang.grid.service.impl;

import com.xingguang.grid.entity.JxlGridContactsRfmEntity;
import com.xingguang.grid.mapper.JxlGridContactsRfmMapper;
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
public class JxlGridContactsRfmServiceImpl implements IJxlGridContactsRfmService {

    @Autowired
    private JxlGridContactsRfmMapper contactsRfmMapper;

    @Override
    @Transactional
    public void deleteContactsRfmByBizId(Long bizId) throws Exception {
        contactsRfmMapper.deleteContactsRfmByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertContactsRfm(JxlGridContactsRfmEntity entity) throws Exception {
        contactsRfmMapper.insertContactsRfm(entity);
    }

    @Override
    @Transactional
    public JxlGridContactsRfmEntity addContactsRfm(Long bizId, JxlGridContactsRfmEntity entity) throws Exception {
        this.deleteContactsRfmByBizId(bizId);
        this.insertContactsRfm(entity);
        return entity;
    }
}
