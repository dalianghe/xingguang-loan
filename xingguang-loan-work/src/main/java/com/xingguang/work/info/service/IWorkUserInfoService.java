package com.xingguang.work.info.service;

import com.xingguang.work.info.entity.WorkUserInfoEntity;
import com.xingguang.work.info.params.InfoBean;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
public interface IWorkUserInfoService {

    public WorkUserInfoEntity addWorkUserInfo(InfoBean infoBean) throws Exception;

    public WorkUserInfoEntity updateWorkUserInfo(InfoBean infoBean) throws Exception;

    public WorkUserInfoEntity selectWorkInfoById(Long id) throws Exception;

    public WorkUserInfoEntity selectWorkInfoByOpenId(String openId) throws Exception;

    public List<WorkUserInfoEntity> selectWorkInfoByOwnerId(Long ownerId) throws Exception;

    public WorkUserInfoEntity selectWorkInfoByPhone(String phone) throws Exception;

}
