package com.xingguang.cus.baseinfo.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.cus.baseinfo.domain.CusUserDomain;
import com.xingguang.cus.baseinfo.entity.custom.CusUserInfoEntityCustom;
import com.xingguang.cus.baseinfo.service.ICusUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by admin on 2017/10/11.
 */
@RestController
public class CusUserController {

    @Autowired
    private ICusUserInfoService cusUserInfoService;

    @RequestMapping(value = "/cus/users" , method = RequestMethod.GET)
    public ResultBean<?> findCusUserAll(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        CusUserDomain domain = JSON.parseObject(paramJson,CusUserDomain.class);
        Map<String , Object> users = cusUserInfoService.findCusUserAll(domain);
        resultBean = new ResultBean<>(users);
        return resultBean;
    }

    @RequestMapping(value = "/cus/user/{userId}" , method = RequestMethod.GET)
    public ResultBean<?> findCusUserById(@PathVariable Long userId) throws Exception{
        ResultBean<?> resultBean = null;
        CusUserInfoEntityCustom entity = cusUserInfoService.findCusUserById(userId);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/cus/applies" , method = RequestMethod.GET)
    public ResultBean<?> findCreditTodoUsers(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        CusUserDomain domain = JSON.parseObject(paramJson,CusUserDomain.class);
        Map<String , Object> users = cusUserInfoService.findCreditTodoCusUser(domain);
        resultBean = new ResultBean<>(users);
        return resultBean;
    }
}
