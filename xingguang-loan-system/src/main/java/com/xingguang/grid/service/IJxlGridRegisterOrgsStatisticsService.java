package com.xingguang.grid.service;

import com.alibaba.fastjson.JSONArray;
import com.xingguang.grid.entity.JxlGridRegisterOrgsStatisticsEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:39
 * @Version v1.0.0
 */
public interface IJxlGridRegisterOrgsStatisticsService {

    public void deleteRegisterOrgsStatisticsBybizId(Long bizId) throws Exception;

    public void insertRegisterOrgsStatistics(List<JxlGridRegisterOrgsStatisticsEntity> list) throws Exception;

    public List<JxlGridRegisterOrgsStatisticsEntity> addRegisterOrgsStatistics(Long bizId , Long orgsId , String json) throws Exception;

}
