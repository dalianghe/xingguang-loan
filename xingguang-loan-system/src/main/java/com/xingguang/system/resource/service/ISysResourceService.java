package com.xingguang.system.resource.service;

import com.xingguang.system.resource.domain.ResourceDomain;
import com.xingguang.system.resource.entity.SysResourceEntity;
import com.xingguang.system.resource.entity.custom.SysResourceEntityCustom;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/9/30.
 */
public interface ISysResourceService {

    public List<SysResourceEntityCustom> findMenusByUserId(Long userId) throws Exception;

    public Map<String,Object> findResourceAll(ResourceDomain domain) throws Exception;

    public SysResourceEntity addResource(ResourceDomain resourceDomain) throws Exception;

    public SysResourceEntity updateResource(ResourceDomain resourceDomain) throws Exception;
}
