package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xingguang.grid.entity.JxlGridUserBlackListEntity;
import com.xingguang.grid.mapper.JxlGridUserBlackListMapper;
import com.xingguang.grid.service.IJxlGridUserBlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  17:42
 * @Version v1.0.0
 */
@Service
public class JxlGridUserBlackListServiceImpl implements IJxlGridUserBlackListService {

    @Autowired
    private JxlGridUserBlackListMapper gridUserBlackListMapper;

    @Override
    public void deleteGridUserBlackListByBizId(Long bizId) throws Exception {
        gridUserBlackListMapper.deleteUserBlackListByBizId(bizId);
    }

    @Override
    public void insertGridUserBlackList(JxlGridUserBlackListEntity entity) throws Exception {
        gridUserBlackListMapper.insertUserBlackList(entity);
    }

    @Override
    public JxlGridUserBlackListEntity addGridUserBlackList(Long bizId, Long gridId, String json) throws Exception {
        JSONObject object = JSON.parseObject(json);
        this.deleteGridUserBlackListByBizId(bizId);
        JxlGridUserBlackListEntity entity = JSON.parseObject(json , JxlGridUserBlackListEntity.class);
        entity.setBizId(bizId);
        entity.setGridId(gridId);
        this.insertGridUserBlackList(entity);
        return entity;
    }
}
