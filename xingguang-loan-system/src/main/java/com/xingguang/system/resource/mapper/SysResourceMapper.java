package com.xingguang.system.resource.mapper;

import com.xingguang.system.resource.entity.SysResourceEntity;
import com.xingguang.system.resource.entity.custom.SysResourceEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/9/30.
 */
public interface SysResourceMapper {

    List<SysResourceEntityCustom> findMenusByUserId(Long userId) throws Exception;

    List<SysResourceEntityCustom> findResourceAll(SysResourceEntity sysResourceEntity) throws Exception;

    void insertSysResource(SysResourceEntity sysResourceEntity) throws Exception;

    void updateSysResource(SysResourceEntity sysResourceEntity) throws Exception;

}
