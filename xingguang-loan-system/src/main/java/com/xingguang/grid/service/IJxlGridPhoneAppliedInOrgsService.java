package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridPhoneAppliedInOrgsEntity;
import com.xingguang.grid.entity.JxlGridRegisterOrgsStatisticsEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:39
 * @Version v1.0.0
 */
public interface IJxlGridPhoneAppliedInOrgsService {

    public void deletePhoneAppliedInOrgsBybizId(Long bizId) throws Exception;

    public void insertPhoneAppliedInOrgs(List<JxlGridPhoneAppliedInOrgsEntity> list) throws Exception;

    public List<JxlGridPhoneAppliedInOrgsEntity> addPhoneAppliedInOrgs(Long bizId, Long gridId, String json) throws Exception;

}
