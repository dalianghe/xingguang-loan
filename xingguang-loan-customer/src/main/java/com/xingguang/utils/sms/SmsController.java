package com.xingguang.utils.sms;

import com.xingguang.beans.ResultBean;
import com.xingguang.utils.verifycode.VerifyCodeUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class SmsController {

    private final Logger logger = LogManager.getLogger(SmsController.class);

    @Autowired
    private SmsUtils smsUtils;

    @RequestMapping(value = "/sms/send", method = RequestMethod.GET)
    public void buildVerifyCode(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        this.smsUtils.sendSms()
//        //生成随机字串
//        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
//        //存入会话session
//        HttpSession session = request.getSession();
//        session.setAttribute(this.imgCodeKey, verifyCode.toLowerCase());
//        //生成图片
//        int w = 200, h = 80;
//        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }

}
