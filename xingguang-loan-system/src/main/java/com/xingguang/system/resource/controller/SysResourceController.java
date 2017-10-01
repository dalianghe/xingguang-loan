package com.xingguang.system.resource.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.system.resource.entity.custom.SysResourceEntityCustom;
import com.xingguang.system.resource.service.ISysResourceService;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public ResultBean<?> getUserMenus(String userId) throws Exception{
        ResultBean<?> resultBean = null;
        userId = "1";
        List<SysResourceEntityCustom> menus = sysResourceService.findMenusByUserId(Integer.parseInt(userId));
        resultBean = new ResultBean<>(menus);
        return resultBean;
    }

}
