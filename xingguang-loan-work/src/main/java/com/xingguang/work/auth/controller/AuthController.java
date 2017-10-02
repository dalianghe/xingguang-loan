package com.xingguang.work.auth.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.exception.CustomException;
import com.xingguang.utils.JwtUtils;
import com.xingguang.work.auth.entity.WorkUserAuthEntity;
import com.xingguang.work.auth.params.AuthBean;
import com.xingguang.work.auth.service.IWorkUserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/10/1.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IWorkUserAuthService workUserAuthService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResultBean<?> login(@RequestBody AuthBean authBean) throws Exception{
        ResultBean<?> resultBean = null;

        WorkUserAuthEntity workUserAuthEntity = workUserAuthService.findUserByPhone(authBean.getPhone());

        if(workUserAuthEntity == null){
            throw new CustomException("用户不存在");
        }

        String clientSmsCode = authBean.getSmsCode();
        String serverSmsCode = "111111"; // 模拟，后期需从存储中获取 TODO

        if(!clientSmsCode.equals(serverSmsCode)){
            throw new CustomException("验证码错误");
        }

        String jwtToken = JwtUtils.createJWT("work.xingguanqb.com",authBean.getPhone(),10000);

        resultBean = new ResultBean<>(jwtToken);

        return resultBean;
    }

    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    public ResultBean<?> register(@RequestBody AuthBean authBean) throws Exception{
        ResultBean<?> resultBean = null;
        // 验证短信验证码是否正确
        String clientSmsCode = authBean.getSmsCode();
        String serverSmsCode = "111111"; // 模拟，后期需从存储中获取 TODO
        if(!clientSmsCode.equals(serverSmsCode)){
            throw new CustomException("验证码错误");
        }
        // 检查手机号是否注册
        WorkUserAuthEntity oldEntity = workUserAuthService.findUserByPhone(authBean.getPhone());
        if(oldEntity!=null){
            oldEntity = null;
            throw new CustomException("用户已注册");
        }
        //  调用注册服务
        WorkUserAuthEntity newEntity = workUserAuthService.registerWorkUser(authBean);
        resultBean = new ResultBean<>(newEntity);
        return resultBean;
    }
}