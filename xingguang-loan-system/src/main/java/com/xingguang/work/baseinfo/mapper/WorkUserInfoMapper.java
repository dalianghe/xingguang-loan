package com.xingguang.work.baseinfo.mapper;

import com.xingguang.work.baseinfo.entity.WorkUserInfoEntity;
import com.xingguang.work.baseinfo.entity.custom.WorkUserInfoEntityCustom;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/10  14:38
 * @Version v1.0.0
 */
public interface WorkUserInfoMapper {

    List<WorkUserInfoEntityCustom> findWorkUserList(WorkUserInfoEntity workUserInfoEntity) throws Exception;

    WorkUserInfoEntityCustom findWorkUserById(Long userId) throws Exception;
}
