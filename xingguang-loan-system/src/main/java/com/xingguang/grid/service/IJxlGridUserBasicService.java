package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridUserBasicEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  13:05
 * @Version v1.0.0
 */
public interface IJxlGridUserBasicService {

    public void deleteGridUserBasicByBizId(Long bizId) throws Exception;

    public void insertUserBasic(JxlGridUserBasicEntity entity) throws Exception;

    public JxlGridUserBasicEntity addUserBasic(Long bizId , JxlGridUserBasicEntity entity) throws Exception;

}
