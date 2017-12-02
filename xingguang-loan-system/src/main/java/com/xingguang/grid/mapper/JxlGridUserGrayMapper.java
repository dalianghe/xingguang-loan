package com.xingguang.grid.mapper;

import com.xingguang.grid.entity.JxlGridUserBasicEntity;
import com.xingguang.grid.entity.JxlGridUserGrayEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  13:35
 * @Version v1.0.0
 */
public interface JxlGridUserGrayMapper {

    void deleteGridUserGrayByBizId(Long bizId) throws Exception;

    void insertGridUserGray(JxlGridUserGrayEntity entity) throws Exception;

}
