package com.xingguang.customer.auth.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.beans.JWTToken;
import com.xingguang.beans.ResultBean;
import com.xingguang.config.JWTParam;
import com.xingguang.customer.auth.entity.CusUserAuthEntity;
import com.xingguang.customer.auth.params.AuthBean;
import com.xingguang.customer.auth.service.ICusUserAuthService;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.service.ICusUserInfoService;
import com.xingguang.exception.CustomException;
import com.xingguang.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2017/9/30.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    private static Long EXPIR_TIME = 1000L * 60 * 60 * 24 * 10;

    @Autowired
    private ICusUserAuthService cusUserAuthService;

    @Autowired
    private ICusUserInfoService cusUserInfoService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResultBean<?> register(@RequestBody AuthBean authBean) throws Exception {
        // 验证短信验证码是否正确
        String clientSmsCode = authBean.getSmsCode();
        String serverSmsCode = "111111"; // 模拟，后期需从存储中获取 TODO
        if (!clientSmsCode.equals(serverSmsCode)) {
            throw new CustomException("验证码错误");
        }
        // 检查手机号是否注册
        CusUserAuthEntity oldEntity = cusUserAuthService.findUserByPhone(authBean.getPhone());
        if (oldEntity != null) {
            oldEntity = null;
            throw new CustomException("用户已注册");
        }
        //  调用注册服务
        CusUserInfo cusUserInfo = cusUserAuthService.registerCusUser(authBean);
        // 返回token串
        String jwtToken = JwtUtils.createJWT("cus.xingguanqb.com", JSON.toJSONString(new JWTToken(cusUserInfo.getId(), cusUserInfo.getPhone())), EXPIR_TIME);
        // 返回实体对象
        ResultBean<?> resultBean = new ResultBean<>(jwtToken);
        return resultBean;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultBean<?> login(@RequestBody AuthBean authBean) throws Exception {
        ResultBean<?> resultBean = null;

//        // 校验验证码
//        String clientSmsCode = authBean.getSmsCode();
//        String serverSmsCode = "111111"; // 模拟，后期需从存储中获取 TODO
//        if(!clientSmsCode.equals(serverSmsCode)){
//            throw new CustomException("验证码错误");
//        }

        // 查询用户
        CusUserInfo cusUserInfo = cusUserInfoService.findByPhone(authBean.getPhone());
        // 登陆账户是否存在
        if (cusUserInfo == null) {
            throw new CustomException("用户不存在");
        }

        // 返回token串
        String jwtToken = JwtUtils.createJWT("cus.xingguanqb.com", JSON.toJSONString(new JWTToken(cusUserInfo.getId(), cusUserInfo.getPhone())), EXPIR_TIME);
        // 返回实体对象
        resultBean = new ResultBean<>(jwtToken);
        return resultBean;
    }

    @RequestMapping(value = "/real", method = RequestMethod.POST)
    public ResultBean<?> real(@RequestBody CusUserInfo cusUserInfo, @JWTParam(key = "userId", required = true) Long userId) throws Exception {
        String name = cusUserInfo.getName();
        String idNo = cusUserInfo.getIdNo();
        boolean realFlag = true;
        CusUserInfo cusUserInfoDB = new CusUserInfo();
        cusUserInfoDB.setId(userId);
        cusUserInfoDB.setName(name);
        cusUserInfoDB.setIdNo(idNo);
        cusUserInfoDB.setRealStatus(realFlag ? 1 : 2);
        this.cusUserInfoService.update(cusUserInfoDB);
        ResultBean<?> resultBean = new ResultBean<>(cusUserInfoDB);
        return resultBean;
    }

    @RequestMapping(value = "/wx", method = RequestMethod.GET)
    public String wx(HttpServletRequest request) throws Exception {
        String echostr = request.getParameter("echostr");
        return echostr;
    }

}
