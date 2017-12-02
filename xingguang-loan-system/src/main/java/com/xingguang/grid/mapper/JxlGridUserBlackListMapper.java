package com.xingguang.grid.mapper;

import com.xingguang.grid.entity.JxlGridUserBlackListEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  17:36
 * @Version v1.0.0
 */
public interface JxlGridUserBlackListMapper {

    void deleteUserBlackListByBizId(Long bizId) throws Exception;

    void insertUserBlackList(JxlGridUserBlackListEntity entity) throws Exception;

}
