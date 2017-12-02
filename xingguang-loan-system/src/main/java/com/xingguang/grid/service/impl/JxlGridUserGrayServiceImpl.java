package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xingguang.grid.entity.JxlGridContactsClosestEntity;
import com.xingguang.grid.entity.JxlGridContactsNumberStatisticEntity;
import com.xingguang.grid.entity.JxlGridContactsRfmEntity;
import com.xingguang.grid.entity.JxlGridUserGrayEntity;
import com.xingguang.grid.mapper.JxlGridUserGrayMapper;
import com.xingguang.grid.service.IJxlGridContactsClosestService;
import com.xingguang.grid.service.IJxlGridContactsNumberStatisticService;
import com.xingguang.grid.service.IJxlGridContactsRfmService;
import com.xingguang.grid.service.IJxlGridUserGrayService;
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
public class JxlGridUserGrayServiceImpl implements IJxlGridUserGrayService {

    @Autowired
    private JxlGridUserGrayMapper gridUserGrayMapper;
    @Autowired
    private IJxlGridContactsNumberStatisticService contactsNumberStatisticService;
    @Autowired
    private IJxlGridContactsRfmService contactsRfmService;
    @Autowired
    private IJxlGridContactsClosestService contactsClosestService;

    @Override
    @Transactional
    public void deleteGridUserGrayByBizId(Long bizId) throws Exception {
        gridUserGrayMapper.deleteGridUserGrayByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertGridUserGray(JxlGridUserGrayEntity entity) throws Exception {
        gridUserGrayMapper.insertGridUserGray(entity);
    }

    @Override
    @Transactional
    public void addGridUserGray(Long bizId, Long gridId , String json) throws Exception {

        JSONObject object = JSON.parseObject(json);

        this.deleteGridUserGrayByBizId(bizId);

        JxlGridUserGrayEntity gridUserGrayEntity = JSON.parseObject(json , JxlGridUserGrayEntity.class);
        gridUserGrayEntity.setBizId(bizId);
        gridUserGrayEntity.setGridId(gridId);
        gridUserGrayEntity.setRecentActiveTime(DateUtils.convertTimeStr(gridUserGrayEntity.getRecentActiveTime()));
        this.insertGridUserGray(gridUserGrayEntity);

        JxlGridContactsNumberStatisticEntity contactsNumberStatisticEntity = JSON.parseObject(object.getString("contacts_number_statistic") , JxlGridContactsNumberStatisticEntity.class);
        contactsNumberStatisticEntity.setBizId(bizId);
        contactsNumberStatisticEntity.setGrayId(gridUserGrayEntity.getId());
        contactsNumberStatisticService.addContactsNumberStatistic(bizId , contactsNumberStatisticEntity);

        JxlGridContactsRfmEntity contactsRfmEntity = JSON.parseObject(object.getString("contacts_rfm") , JxlGridContactsRfmEntity.class);
        contactsRfmEntity.setBizId(bizId);
        contactsRfmEntity.setGrayId(gridUserGrayEntity.getId());
        contactsRfmEntity.setRecentTimeBeAll(DateUtils.convertTimeStr(contactsRfmEntity.getRecentTimeBeAll()));
        contactsRfmEntity.setRecentTimeToAll(DateUtils.convertTimeStr(contactsRfmEntity.getRecentTimeToAll()));
        contactsRfmEntity.setRecentTimeBeApplied(DateUtils.convertTimeStr(contactsRfmEntity.getRecentTimeBeApplied()));
        contactsRfmEntity.setRecentTimeToApplied(DateUtils.convertTimeStr(contactsRfmEntity.getRecentTimeToApplied()));
        contactsRfmService.addContactsRfm(bizId , contactsRfmEntity);

        JxlGridContactsClosestEntity contactsClosestEntity = JSON.parseObject(object.getString("contacts_closest") , JxlGridContactsClosestEntity.class);
        contactsClosestEntity.setBizId(bizId);
        contactsClosestEntity.setGrayId(gridUserGrayEntity.getId());
        contactsClosestService.addContactsClosest(bizId , contactsClosestEntity);
    }
}
