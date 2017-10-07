package com.xingguang.system.userrole.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.system.userrole.domain.UserRoleDomain;
import com.xingguang.system.userrole.service.ISysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/10/7.
 */
@RestController
@RequestMapping("/system")
public class UserRoleController {

    @Autowired
    private ISysUserRoleService sysUserRoleService;

    @RequestMapping(value = "/userroles" , method = RequestMethod.POST)
    public ResultBean<?> addUserRoles(@RequestBody UserRoleDomain userRoleDomain) throws Exception{
        ResultBean<?> resultBean = null;
        sysUserRoleService.addUserRole(userRoleDomain.getUserId(),userRoleDomain.getRoles());
        resultBean = new ResultBean<>();
        return resultBean;
    }

}
