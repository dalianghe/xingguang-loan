package com.xingguang.work.baseinfo.service;

import com.xingguang.work.baseinfo.domain.WorkUserDomain;
import com.xingguang.work.baseinfo.entity.custom.WorkUserInfoEntityCustom;

import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/10  15:09
 * @Version v1.0.0
 */
public interface IWorkUserInfoService {

    public Map<String , Object> findWorkUserAll(WorkUserDomain domain) throws Exception;

    public WorkUserInfoEntityCustom findWorkUserById(Long userId) throws Exception;

    public WorkUserInfoEntityCustom findWorkUserByCusId(Long cusUserId) throws Exception;

    public void updateWorkUserById(WorkUserDomain domain) throws Exception;

}
