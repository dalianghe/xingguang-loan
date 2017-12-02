package com.xingguang.grid.mapper;

import com.xingguang.grid.entity.JxlGridReportEntity;
import com.xingguang.grid.entity.JxlGridUserBasicEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  11:09
 * @Version v1.0.0
 */
public interface JxlGridUserBasicMapper {

    void deleteGridUserBasicByBizId(Long bizId) throws Exception;

    void insertUserBasic(JxlGridUserBasicEntity entity) throws Exception;

}
