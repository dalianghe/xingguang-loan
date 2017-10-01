package com.xingguang.customer.login.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.customer.login.entity.CusUserAuthEntity;
import com.xingguang.customer.login.params.AuthBean;
import com.xingguang.customer.login.service.ICusUserAuthService;
import com.xingguang.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/9/30.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private ICusUserAuthService cusUserAuthService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResultBean<?> login(@RequestBody AuthBean authBean) throws Exception{
        ResultBean<?> resultBean = null;

        CusUserAuthEntity cusUserAuthEntity = cusUserAuthService.findUserByPhone("13611201362");

        String jwtToken = JwtUtils.createJWT("cus.xingguanqb.com",authBean.getPhone(),10000);

        resultBean = new ResultBean<>(jwtToken);

        return resultBean;
    }
}
