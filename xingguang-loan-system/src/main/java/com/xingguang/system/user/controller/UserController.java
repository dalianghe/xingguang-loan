package com.xingguang.system.user.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.common.controller.BaseController;
import com.xingguang.system.role.entity.custom.SysRoleEntityCustom;
import com.xingguang.system.user.domain.SysUserDomain;
import com.xingguang.system.user.entity.SysUserEntity;
import com.xingguang.system.user.entity.custom.SysUserEntityCustom;
import com.xingguang.system.user.service.ISysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/9/24.
 */
@RestController
@RequestMapping("/system")
public class UserController extends BaseController{

    @Autowired
    private ISysUserService sysUserService;

    @RequiresPermissions("user:list")
    @RequestMapping(value = "/users" , method = RequestMethod.GET)
    public ResultBean<?> findSysUserList(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        SysUserDomain domain = JSON.parseObject(paramJson , SysUserDomain.class);
        Map<String , Object> users = sysUserService.findSysUserList(domain);
        resultBean = new ResultBean<>(users);
        return resultBean;
    }

    @RequestMapping(value = "/user/{userId}" , method = RequestMethod.GET)
    public ResultBean<?> findSysUserById(@PathVariable("userId") String userId) throws Exception{
        ResultBean<?> resultBean = null;
        SysUserEntityCustom entity= sysUserService.findSysUserById(Long.parseLong(userId));
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/user/{userId}" , method = RequestMethod.PUT)
    public ResultBean<?> updateSysUserById(@RequestBody SysUserDomain sysUserDomain) throws Exception{
        ResultBean<?> resultBean = null;
        SysUserEntity entity = sysUserService.updateSysUserById(sysUserDomain);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/user" , method = RequestMethod.POST)
    public ResultBean<?> addSysUser(@RequestBody SysUserDomain sysUserDomain) throws Exception{
        ResultBean<?> resultBean = null;
        SysUserEntity entity = sysUserService.addSysUser(sysUserDomain);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/users/roles" , method = RequestMethod.GET)
    public ResultBean<?> findUsersRoles(String userName) throws Exception{
        ResultBean<?> resultBean = null;
        List<SysUserEntityCustom> entity = sysUserService.findSysUserRoles(userName);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/users/roles/{userId}" , method = RequestMethod.GET)
    public ResultBean<?> findUsersHaveRoles(@PathVariable String userId) throws Exception{
        ResultBean<?> resultBean = null;
        List<SysRoleEntityCustom> entity = sysUserService.findSysUserHaveRoles(Long.parseLong(userId));
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/users/resetpassword" , method = RequestMethod.POST)
    public ResultBean<?> resetPassword(Long id , String loginId , String password) throws Exception{
        ResultBean<?> resultBean = null;
        sysUserService.resetPassword(id,loginId,password);
        resultBean = new ResultBean<>();
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }

}
