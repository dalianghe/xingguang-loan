package com.xingguang.system.user.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.system.common.controller.BaseController;
import com.xingguang.system.user.domain.SysUserDomain;
import com.xingguang.system.user.entity.custom.SysUserEntityCustom;
import com.xingguang.system.user.service.ISysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResultBean<?> findSysUserList() throws Exception{
        ResultBean<?> resultBean = null;
        List<SysUserEntityCustom> list = sysUserService.findSysUserList();
        resultBean = new ResultBean<>(list);
        return resultBean;
    }

    @RequestMapping(value = "/users/{userId}" , method = RequestMethod.GET)
    public ResultBean<?> findSysUserById(@PathVariable("userId") String userId) throws Exception{
        ResultBean<?> resultBean = null;
        SysUserEntityCustom entity= sysUserService.findSysUserById(Long.parseLong(userId));
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/users/{userId}" , method = RequestMethod.PUT)
    public ResultBean<?> updateSysUserById(@RequestBody SysUserDomain sysUserDomain) throws Exception{
        ResultBean<?> resultBean = null;
        SysUserEntityCustom entity = sysUserService.updateSysUserById(sysUserDomain);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

}
