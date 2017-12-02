package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xingguang.grid.entity.*;
import com.xingguang.grid.mapper.JxlGridUserGrayMapper;
import com.xingguang.grid.mapper.JxlGridUserRegisterOrgsMapper;
import com.xingguang.grid.service.*;
import com.xingguang.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  13:45
 * @Version v1.0.0
 */
@Service
public class JxlGridUserRegisterOrgsServiceImpl implements IJxlGridUserRegisterOrgsService {

    @Autowired
    private JxlGridUserRegisterOrgsMapper registerOrgsMapper;
    @Autowired
    private IJxlGridRegisterOrgsStatisticsService registerOrgsStatisticsService;

    @Override
    @Transactional
    public void deleteGridUserRegisterOrgsByBizId(Long bizId) throws Exception {
        registerOrgsMapper.deleteGridUserRegisterOrgsByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertGridUserRegisterOrgs(JxlGridUserRegisterOrgsEntity entity) throws Exception {
        registerOrgsMapper.insertGridUserRegisterOrgs(entity);
    }

    @Override
    @Transactional
    public void addGridUserRegisterOrgs(Long bizId, Long gridId , String json) throws Exception {

        JSONObject object = JSON.parseObject(json);

        this.deleteGridUserRegisterOrgsByBizId(bizId);

        JxlGridUserRegisterOrgsEntity gridUserRegisterOrgsEntity = JSON.parseObject(json , JxlGridUserRegisterOrgsEntity.class);
        gridUserRegisterOrgsEntity.setBizId(bizId);
        gridUserRegisterOrgsEntity.setGridId(gridId);
        this.insertGridUserRegisterOrgs(gridUserRegisterOrgsEntity);

        String orgsJson = object.getString("register_orgs_statistics");
        registerOrgsStatisticsService.addRegisterOrgsStatistics(bizId , gridUserRegisterOrgsEntity.getId() , orgsJson);
    }
}
