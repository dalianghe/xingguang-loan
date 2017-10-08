package com.xingguang.system.resource.service;

import com.xingguang.system.resource.domain.ResourceDomain;
import com.xingguang.system.resource.entity.SysResourceEntity;
import com.xingguang.system.resource.entity.custom.SysResourceEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/9/30.
 */
public interface ISysResourceService {

    public List<SysResourceEntityCustom> findMenusByUserId(Long userId) throws Exception;

    public List<SysResourceEntityCustom> findResourceAll(String resName) throws Exception;

    public SysResourceEntity addResource(ResourceDomain resourceDomain) throws Exception;

    public SysResourceEntity updateResource(ResourceDomain resourceDomain) throws Exception;
}
