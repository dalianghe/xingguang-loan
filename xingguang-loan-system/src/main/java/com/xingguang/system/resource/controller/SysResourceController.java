package com.xingguang.system.resource.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.xingguang.beans.ResultBean;
import com.xingguang.system.resource.entity.custom.SysResourceEntityCustom;
import com.xingguang.system.resource.service.ISysResourceService;
import com.xingguang.utils.JsonUtils;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by admin on 2017/9/30.
 */
@RestController
@RequestMapping("/resource")
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

}
