package com.xingguang.work.baseinfo.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.work.baseinfo.domain.WorkUserDomain;
import com.xingguang.work.baseinfo.entity.custom.WorkUserInfoEntityCustom;
import com.xingguang.work.baseinfo.service.IWorkUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

}
