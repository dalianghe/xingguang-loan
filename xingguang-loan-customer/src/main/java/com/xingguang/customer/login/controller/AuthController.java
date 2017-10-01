package com.xingguang.customer.login.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.customer.login.entity.CusUserAuthEntity;
import com.xingguang.customer.login.params.AuthBean;
import com.xingguang.customer.login.service.ICusUserAuthService;
import com.xingguang.exception.CustomException;
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

        CusUserAuthEntity cusUserAuthEntity = cusUserAuthService.findUserByPhone(authBean.getPhone());

        if(cusUserAuthEntity == null){
            throw new CustomException("用户不存在");
        }

        String clientSmsCode = authBean.getSmsCode();
        String serverSmsCode = "111111"; // 模拟，后期需从存储中获取 TODO

        if(!clientSmsCode.equals(serverSmsCode)){
            throw new CustomException("验证码错误");
        }

        String jwtToken = JwtUtils.createJWT("cus.xingguanqb.com",authBean.getPhone(),10000);

        resultBean = new ResultBean<>(jwtToken);

        return resultBean;
    }
}
