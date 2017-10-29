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
import com.xingguang.utils.oss.OssUtils;
import com.xingguang.utils.real.RealUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by admin on 2017/9/30.
 */
@RestController
public class AuthController {

    private final Logger logger = LogManager.getLogger(AuthController.class);

    private static Long EXPIR_TIME = 1000L * 60 * 60 * 24 * 10;

    @Autowired
    private ICusUserAuthService cusUserAuthService;

    @Autowired
    private ICusUserInfoService cusUserInfoService;

    @Autowired
    private OssUtils ossUtils;

    @Autowired
    private RealUtils realUtils;

    @Value("${OSS.CUS.REAL}")
    private String realImgPath;


    @RequestMapping(value = "/auth/register", method = RequestMethod.POST)
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

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
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

    @RequestMapping(value = "/auth/real", method = RequestMethod.POST)
    public ResultBean<?> real(CusUserInfo cusUserInfo,
                              @JWTParam(key = "userId", required = true) Long userId,
                              @RequestParam("img1") MultipartFile realImg1,
                              @RequestParam("img2") MultipartFile realImg2,
                              @RequestParam("img3") MultipartFile realImg3) throws Exception {

        String realStatus = this.realUtils.realByNameAndIdNo(cusUserInfo.getName(), cusUserInfo.getIdNo());
        boolean realFlag = false;
        if (!StringUtils.isBlank(realStatus) && "3".equals(realStatus.trim())) {
            realFlag = true;
        }
        List<MultipartFile> files = new ArrayList(3);
        files.add(realImg1);
        files.add(realImg2);
        files.add(realImg3);
        List<String> paths = this.putFiles(userId, files);
        CusUserInfo cusUserInfoDB = new CusUserInfo();
        cusUserInfoDB.setRealImg1Url(paths.get(0));
        cusUserInfoDB.setRealImg2Url(paths.get(1));
        cusUserInfoDB.setRealImg3Url(paths.get(2));
        cusUserInfoDB.setId(userId);
        cusUserInfoDB.setName(cusUserInfo.getName());
        cusUserInfoDB.setIdNo(cusUserInfo.getIdNo());
        cusUserInfoDB.setRealStatus(realFlag ? 1 : 2);
        this.cusUserInfoService.update(cusUserInfoDB);
        ResultBean<?> resultBean = new ResultBean<>(cusUserInfoDB);
        return resultBean;
    }

    private List<String> putFiles(Long userId, List<MultipartFile> files) throws IOException {
        List<String> list = new ArrayList(files.size());
        for (MultipartFile f : files) {
            String fileName = new String(f.getOriginalFilename().getBytes("ISO-8859-1"), "UTF-8");
            String postfix = fileName.substring(fileName.lastIndexOf("."));
            String path = ossUtils.putFile(this.realImgPath + "/" + userId + "_" + UUID.randomUUID().toString() + postfix, f.getInputStream());
            list.add(path);
        }
        return list;
    }

}
