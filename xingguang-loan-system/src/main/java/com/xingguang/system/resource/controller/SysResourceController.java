package com.xingguang.system.resource.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.system.resource.service.ISysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/9/30.
 */
@RestController
public class SysResourceController {
    @Autowired
    private ISysResourceService sysResourceService;

    @RequestMapping(value = "/menus",method = RequestMethod.GET)
    public ResultBean<?> getUserMenus() throws Exception{
        ResultBean<?> resultBean = null;

        return resultBean;
    }

}
