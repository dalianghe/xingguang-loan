package com.xingguang.customer.auth.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.customer.auth.entity.CusUserAuthEntity;
import com.xingguang.customer.auth.params.AuthBean;
import com.xingguang.customer.auth.service.ICusUserAuthService;
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
        // 查询用户
        CusUserAuthEntity cusUserAuthEntity = cusUserAuthService.findUserByPhone(authBean.getPhone());
        // 登陆账户是否存在
        if(cusUserAuthEntity == null){
            throw new CustomException("用户不存在");
        }
        // 校验验证码
        String clientSmsCode = authBean.getSmsCode();
        String serverSmsCode = "111111"; // 模拟，后期需从存储中获取 TODO
        if(!clientSmsCode.equals(serverSmsCode)){
            throw new CustomException("验证码错误");
        }
        // 返回token串
        String jwtToken = JwtUtils.createJWT("cus.xingguanqb.com",authBean.getPhone(),10000);
        // 返回实体对象
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
        CusUserAuthEntity oldEntity = cusUserAuthService.findUserByPhone(authBean.getPhone());
        if(oldEntity!=null){
            oldEntity = null;
            throw new CustomException("用户已注册");
        }
        //  调用注册服务
        CusUserAuthEntity newEntity = cusUserAuthService.registerCusUser(authBean);
        resultBean = new ResultBean<>(newEntity);
        return resultBean;
    }
}