package com.xingguang.system.resource.mapper;

import com.xingguang.system.resource.entity.SysResourceEntity;

import java.util.List;

/**
 * Created by admin on 2017/9/30.
 */
public interface SysResourceMapper {

    List<SysResourceEntity> findMenusByUserId(int userId) throws Exception;

}
