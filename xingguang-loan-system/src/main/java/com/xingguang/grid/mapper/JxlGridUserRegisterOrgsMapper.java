package com.xingguang.grid.mapper;

import com.xingguang.grid.entity.JxlGridUserRegisterOrgsEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  13:35
 * @Version v1.0.0
 */
public interface JxlGridUserRegisterOrgsMapper {

    void deleteGridUserRegisterOrgsByBizId(Long bizId) throws Exception;

    void insertGridUserRegisterOrgs(JxlGridUserRegisterOrgsEntity entity) throws Exception;

}
