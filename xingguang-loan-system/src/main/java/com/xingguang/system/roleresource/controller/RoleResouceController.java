package com.xingguang.system.roleresource.controller;

import com.xingguang.common.beans.ResultBean;
import com.xingguang.system.roleresource.domain.RoleResourceDomain;
import com.xingguang.system.roleresource.service.ISysRoleResouceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/10/8.
 */
@RestController
@RequestMapping("/system")
public class RoleResouceController {

    @Autowired
    private ISysRoleResouceService sysRoleResouceService;

    @RequestMapping(value = "/roleresources" , method = RequestMethod.POST)
    public ResultBean<?> addUserRoles(@RequestBody RoleResourceDomain resourceDomain) throws Exception{
        ResultBean<?> resultBean = null;
        sysRoleResouceService.addRoleResource(resourceDomain.getRoleId(),resourceDomain.getResources());
        resultBean = new ResultBean<>();
        return resultBean;
    }
}
