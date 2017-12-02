package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridIdcardAppliedInOrgsEntity;
import com.xingguang.grid.entity.JxlGridPhoneAppliedInOrgsEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:39
 * @Version v1.0.0
 */
public interface IJxlGridIdcardAppliedInOrgsService {

    public void deleteIdcardAppliedInOrgsBybizId(Long bizId) throws Exception;

    public void insertIdcardAppliedInOrgs(List<JxlGridIdcardAppliedInOrgsEntity> list) throws Exception;

    public List<JxlGridIdcardAppliedInOrgsEntity> addIdcardAppliedInOrgs(Long bizId, Long gridId, String json) throws Exception;

}
