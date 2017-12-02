package com.xingguang.grid.mapper;

import com.xingguang.grid.entity.JxlGridRegisterOrgsStatisticsEntity;
import com.xingguang.grid.entity.JxlGridUserRegisterOrgsEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:33
 * @Version v1.0.0
 */
public interface JxlGridRegisterOrgsStatisticsMapper {

    void deleteRegisterOrgsStatisticsByBizId(Long bizId) throws Exception;

    void insertRegisterOrgsStatistics(List<JxlGridRegisterOrgsStatisticsEntity> list) throws Exception;

}
