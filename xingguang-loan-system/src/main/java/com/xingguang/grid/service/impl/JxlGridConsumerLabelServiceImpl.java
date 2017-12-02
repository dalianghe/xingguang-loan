package com.xingguang.grid.service.impl;

import com.xingguang.grid.entity.JxlGridConsumerLabelEntity;
import com.xingguang.grid.entity.JxlGridUserBasicEntity;
import com.xingguang.grid.mapper.JxlGridConsumerLabelMapper;
import com.xingguang.grid.mapper.JxlGridUserBasicMapper;
import com.xingguang.grid.service.IJxlGridConsumerLabelService;
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
public class JxlGridConsumerLabelServiceImpl implements IJxlGridConsumerLabelService {

    @Autowired
    private JxlGridConsumerLabelMapper gridConsumerLabelMapper;

    @Override
    @Transactional
    public void deleteConsumerLabelByBizId(Long bizId) throws Exception {
        gridConsumerLabelMapper.deleteConsumerLabelBizId(bizId);
    }

    @Override
    @Transactional
    public void insertConsumerLabel(JxlGridConsumerLabelEntity entity) throws Exception {
        gridConsumerLabelMapper.insertConsumerLabel(entity);
    }

    @Override
    @Transactional
    public JxlGridConsumerLabelEntity addConsumerLabel(Long bizId, JxlGridConsumerLabelEntity entity) throws Exception {
        this.deleteConsumerLabelByBizId(bizId);
        this.insertConsumerLabel(entity);
        return entity;
    }
}
