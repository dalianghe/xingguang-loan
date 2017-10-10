package com.xingguang.work.baseinfo.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.system.login.domain.AuthUserDomain;
import com.xingguang.work.baseinfo.domain.WorkUserDomain;
import com.xingguang.work.baseinfo.entity.custom.WorkUserInfoEntityCustom;
import com.xingguang.work.baseinfo.service.IWorkUserInfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/10  15:21
 * @Version v1.0.0
 */
@RestController
public class WorkUserController {

    @Autowired
    private IWorkUserInfoService workUserInfoService;

    @RequestMapping(value = "/work/users" , method = RequestMethod.GET)
    public ResultBean<?> findWorkUserAll(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        WorkUserDomain domain = JSON.parseObject(paramJson,WorkUserDomain.class);
        Map<String , Object> users = workUserInfoService.findWorkUserAll(domain);
        resultBean = new ResultBean<>(users);
        return resultBean;
    }

    @RequestMapping(value = "/work/user/{userId}" , method = RequestMethod.GET)
    public ResultBean<?> findWorkUserAll(@PathVariable Long userId) throws Exception{
        ResultBean<?> resultBean = null;
        WorkUserInfoEntityCustom entity = workUserInfoService.findWorkUserById(userId);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/work/audituser" , method = RequestMethod.POST)
    public ResultBean<?> auditWorkUser(@RequestBody WorkUserDomain domain) throws Exception{
        ResultBean<?> resultBean = null;
        Subject subject = SecurityUtils.getSubject();
        AuthUserDomain loginUser = (AuthUserDomain)subject.getPrincipals().getPrimaryPrincipal();
        domain.setAuditorId(loginUser.getId());
        domain.setAuditorName(loginUser.getUserName());
        domain.setAuditorTime(new Date());
        workUserInfoService.updateWorkUserById(domain);
        resultBean = new ResultBean<>();
        return resultBean;
    }

    @RequestMapping(value = "/work/enableuser" , method = RequestMethod.POST)
    public ResultBean<?> enableWorkUser(@RequestBody WorkUserDomain domain) throws Exception{
        ResultBean<?> resultBean = null;
        Subject subject = SecurityUtils.getSubject();
        AuthUserDomain loginUser = (AuthUserDomain)subject.getPrincipals().getPrimaryPrincipal();
        domain.setEnableId(loginUser.getId());
        domain.setEnableName(loginUser.getUserName());
        domain.setEnableTime(new Date());
        workUserInfoService.updateWorkUserById(domain);
        resultBean = new ResultBean<>();
        return resultBean;
    }

}
