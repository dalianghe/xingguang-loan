package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.xingguang.grid.entity.JxlGridRegisterOrgsStatisticsEntity;
import com.xingguang.grid.mapper.JxlGridRegisterOrgsStatisticsMapper;
import com.xingguang.grid.service.IJxlGridRegisterOrgsStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:43
 * @Version v1.0.0
 */
@Service
public class JxlGridRegisterOrgsStatisticsServiceImpl implements IJxlGridRegisterOrgsStatisticsService {

    @Autowired
    private JxlGridRegisterOrgsStatisticsMapper registerOrgsStatisticsMapper;

    @Override
    public void deleteRegisterOrgsStatisticsBybizId(Long bizId) throws Exception {
        registerOrgsStatisticsMapper.deleteRegisterOrgsStatisticsByBizId(bizId);
    }

    @Override
    public void insertRegisterOrgsStatistics(List<JxlGridRegisterOrgsStatisticsEntity> list) throws Exception {
        registerOrgsStatisticsMapper.insertRegisterOrgsStatistics(list);
    }

    @Override
    public List<JxlGridRegisterOrgsStatisticsEntity> addRegisterOrgsStatistics(Long bizId, Long orgsId, String json) throws Exception {

        List<JxlGridRegisterOrgsStatisticsEntity> list = JSON.parseArray(json , JxlGridRegisterOrgsStatisticsEntity.class);
        if(list != null && list.size()>0){
            this.deleteRegisterOrgsStatisticsBybizId(bizId);
            for(JxlGridRegisterOrgsStatisticsEntity entity : list){
                entity.setBizId(bizId);
                entity.setOrgsId(orgsId);
            }
            this.insertRegisterOrgsStatistics(list);
        }
        return list;
    }
}
