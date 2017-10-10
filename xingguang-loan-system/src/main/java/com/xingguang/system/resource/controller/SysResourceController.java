package com.xingguang.system.resource.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.system.resource.domain.ResourceDomain;
import com.xingguang.system.resource.entity.SysResourceEntity;
import com.xingguang.system.resource.entity.custom.SysResourceEntityCustom;
import com.xingguang.system.resource.service.ISysResourceService;
import com.xingguang.utils.JsonUtils;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/9/30.
 */
@RestController
@RequestMapping("/system")
public class SysResourceController {
    @Autowired
    private ISysResourceService sysResourceService;

    @RequiresUser
    @RequestMapping(value = "/menus",method = RequestMethod.GET)
    public ResultBean<?> getUserMenus(String jsonData) throws Exception{
        ResultBean<?> resultBean = null;
        Map<String, Object> map = JsonUtils.json2Map(jsonData);
        String userId = (String)map.get("userId");
        List<SysResourceEntityCustom> menus = sysResourceService.findMenusByUserId(Long.parseLong(userId));
        resultBean = new ResultBean<>(menus);
        return resultBean;
    }

    @RequestMapping(value = "/resources" , method = RequestMethod.GET)
    public ResultBean<?> findResourceAll(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        ResourceDomain domain = JSON.parseObject(paramJson,ResourceDomain.class);
        Map<String,Object> resources = sysResourceService.findResourceAll(domain);
        resultBean = new ResultBean<>(resources);
        return resultBean;
    }

    @RequestMapping(value = "/resource" , method = RequestMethod.POST)
    public ResultBean<?> addResource(@RequestBody ResourceDomain resourceDomain) throws Exception{
        ResultBean<?> resultBean = null;
        SysResourceEntity entity = sysResourceService.addResource(resourceDomain);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/resource/{id}" , method = RequestMethod.PUT)
    public ResultBean<?> updateResource(@RequestBody ResourceDomain resourceDomain) throws Exception{
        ResultBean<?> resultBean = null;
        SysResourceEntity entity = sysResourceService.updateResource(resourceDomain);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

}
