package com.xingguang.grid.mapper;

import com.xingguang.grid.entity.JxlGridPhoneAppliedInOrgsEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  18:01
 * @Version v1.0.0
 */
public interface JxlGridPhoneAppliedInOrgsMapper {

    void deletePhoneAppliedInOrgsByBizId(Long bizId) throws Exception;

    void insertPhoneAppliedInOrgs(List<JxlGridPhoneAppliedInOrgsEntity> list) throws Exception;

}
