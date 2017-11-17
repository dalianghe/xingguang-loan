package com.xingguang.work.info.mapper;

import com.xingguang.work.info.entity.WorkUserInfoEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
public interface WorkUserInfoMapper {

    void insertWorkUserInfo(WorkUserInfoEntity workUserInfoEntity) throws Exception;

    void updateWorkUserInfo(WorkUserInfoEntity workUserInfoEntity) throws Exception;

    WorkUserInfoEntity selectWorkInfoById(Long id) throws Exception;

    WorkUserInfoEntity selectWorkInfoByOpenId(String openId) throws Exception;

    List<WorkUserInfoEntity> selectWorkInfoByOwnerId(Long ownerId) throws Exception;

}
