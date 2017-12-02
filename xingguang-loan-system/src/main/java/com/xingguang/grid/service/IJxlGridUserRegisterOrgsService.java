package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridUserGrayEntity;
import com.xingguang.grid.entity.JxlGridUserRegisterOrgsEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  13:41
 * @Version v1.0.0
 */
public interface IJxlGridUserRegisterOrgsService {

    public void deleteGridUserRegisterOrgsByBizId(Long bizId) throws Exception;

    public void insertGridUserRegisterOrgs(JxlGridUserRegisterOrgsEntity entity) throws Exception;

    public void addGridUserRegisterOrgs(Long bizId, Long gridId, String json) throws Exception;

}
