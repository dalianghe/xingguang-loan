package com.xingguang.grid.service.impl;

import com.xingguang.grid.entity.JxlGridUserBasicEntity;
import com.xingguang.grid.mapper.JxlGridUserBasicMapper;
import com.xingguang.grid.service.IJxlGridUserBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  13:05
 * @Version v1.0.0
 */
@Service
public class JxlGridUserBasicServiceImpl implements IJxlGridUserBasicService {

    @Autowired
    private JxlGridUserBasicMapper gridUserBasicMapper;

    @Override
    @Transactional
    public void deleteGridUserBasicByBizId(Long bizId) throws Exception {
        gridUserBasicMapper.deleteGridUserBasicByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertUserBasic(JxlGridUserBasicEntity entity) throws Exception {
        gridUserBasicMapper.insertUserBasic(entity);
    }

    @Override
    @Transactional
    public JxlGridUserBasicEntity addUserBasic(Long bizId, JxlGridUserBasicEntity entity) throws Exception {
        this.deleteGridUserBasicByBizId(bizId);
        this.insertUserBasic(entity);
        return entity;
    }
}
