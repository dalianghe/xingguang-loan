package com.xingguang.system.role.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.system.role.domain.RoleDomain;
import com.xingguang.system.role.entity.SysRoleEntity;
import com.xingguang.system.role.entity.custom.SysRoleEntityCustom;
import com.xingguang.system.role.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/10/6.
 */
@RestController
@RequestMapping("/system")
public class RoleController {

    @Autowired
    private ISysRoleService sysRoleService;

    @RequestMapping(value = "/roles" , method = RequestMethod.GET)
    public ResultBean<?> roles(String roleName) throws Exception{
        ResultBean<?> resultBean = null;
        List<SysRoleEntityCustom> roles = sysRoleService.findSysRoleList(roleName);
        resultBean = new ResultBean<>(roles);
        return resultBean;
    }

    @RequestMapping(value = "/role" , method = RequestMethod.POST)
    public ResultBean<?> addRole(@RequestBody RoleDomain roleDomain) throws Exception{
        ResultBean<?> resultBean = null;
        SysRoleEntity entity = sysRoleService.addSysRole(roleDomain);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/role/{id}" , method = RequestMethod.PUT)
    public ResultBean<?> updateRole(@RequestBody RoleDomain roleDomain) throws Exception{
        ResultBean<?> resultBean = null;
        SysRoleEntity entity = sysRoleService.updateSysRole(roleDomain);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/roles/resources" , method = RequestMethod.GET)
    public ResultBean<?> rolesResources(String roleName) throws Exception{
        ResultBean<?> resultBean = null;
        List<SysRoleEntityCustom> roels = sysRoleService.findSysRoleResources(roleName);
        resultBean = new ResultBean<>(roels);
        return resultBean;
    }
}
