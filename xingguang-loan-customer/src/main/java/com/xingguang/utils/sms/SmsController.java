package com.xingguang.utils.sms;

import com.xingguang.beans.ResultBean;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.service.ICusUserInfoService;
import com.xingguang.exception.CustomException;
import com.xingguang.utils.interfacelog.entity.SysInterfaceLogWithBLOBs;
import com.xingguang.utils.interfacelog.service.ISysInterfaceLogService;
import com.xingguang.utils.verifycode.VerifyCodeUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@RestController
public class SmsController {

    private final Logger logger = LogManager.getLogger(SmsController.class);

    public static final String SMS_CODE_KEY = "_SMS_CODE_KEY";

    @Value("${SMS.VALIDATE_CODE_TEMPLATE}")
    private String smsCodeTemplet;

    @Autowired
    private SmsUtils smsUtils;

    @Autowired
    private ISysInterfaceLogService sysInterfaceLogService;

    @Autowired
    private ICusUserInfoService cusUserInfoService;

    @RequestMapping(value = "/sms/send/{mobile}", method = RequestMethod.GET)
    public ResultBean<?> buildVerifyCode(@PathVariable String mobile, HttpServletRequest request) throws Exception {
        String time = String.valueOf(System.currentTimeMillis());
        String smsCode = time.substring(time.length() - 4, time.length());
        new Thread(() -> {
            try {
                String content = String.format(SmsController.this.smsCodeTemplet, smsCode);
                SmsController.this.smsUtils.sendSms(mobile, content);
                SysInterfaceLogWithBLOBs sysInterfaceLogWithBLOBs = new SysInterfaceLogWithBLOBs();
                sysInterfaceLogWithBLOBs.setType(1);
                sysInterfaceLogWithBLOBs.setStatus(2);
                sysInterfaceLogWithBLOBs.setCreateTime(new Date());
                sysInterfaceLogWithBLOBs.setRoleType(2);
                sysInterfaceLogWithBLOBs.setSendData(content);
                sysInterfaceLogWithBLOBs.setUserId(0L);
                sysInterfaceLogWithBLOBs.setPhone(mobile);
                SmsController.this.sysInterfaceLogService.create(sysInterfaceLogWithBLOBs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        this.logger.debug("sms code :==============: " + smsCode);
        this.smsUtils.sendSms(mobile, smsCode);
        request.getSession().setAttribute(SMS_CODE_KEY, smsCode);
        return new ResultBean();
    }

    @RequestMapping(value = "/sms/send/{mobile}/{smsCode}", method = RequestMethod.GET)
    public ResultBean<?> buildVerifyCode(@PathVariable String mobile, @PathVariable String smsCode, HttpServletRequest request) throws Exception {
        String time = String.valueOf(System.currentTimeMillis());
//        String smsCode = time.substring(time.length() - 4, time.length());
        new Thread(() -> {
            try {
                String content = String.format(SmsController.this.smsCodeTemplet, smsCode);
                SmsController.this.smsUtils.sendSms(mobile, content);
                SysInterfaceLogWithBLOBs sysInterfaceLogWithBLOBs = new SysInterfaceLogWithBLOBs();
                sysInterfaceLogWithBLOBs.setType(1);
                sysInterfaceLogWithBLOBs.setStatus(2);
                sysInterfaceLogWithBLOBs.setCreateTime(new Date());
                sysInterfaceLogWithBLOBs.setRoleType(2);
                sysInterfaceLogWithBLOBs.setSendData(content);
                sysInterfaceLogWithBLOBs.setUserId(0L);
                sysInterfaceLogWithBLOBs.setPhone(mobile);
                SmsController.this.sysInterfaceLogService.create(sysInterfaceLogWithBLOBs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        this.logger.debug("sms code :==============: " + smsCode);
        this.smsUtils.sendSms(mobile, smsCode);
        request.getSession().setAttribute(SMS_CODE_KEY, smsCode);
        return new ResultBean();
    }

    @RequestMapping(value = "/sms/send/login/{mobile}/{smsCode}", method = RequestMethod.GET)
    public ResultBean<?> buildLoginVerifyCode(@PathVariable String mobile, @PathVariable String smsCode, HttpServletRequest request) throws Exception {
        CusUserInfo cusUserInfo = this.cusUserInfoService.findByPhone(mobile);
        if(cusUserInfo != null){
            throw new CustomException("该手机号已经注册");
        }
        String time = String.valueOf(System.currentTimeMillis());
        new Thread(() -> {
            try {
                String content = String.format(SmsController.this.smsCodeTemplet, smsCode);
                SmsController.this.smsUtils.sendSms(mobile, content);
                SysInterfaceLogWithBLOBs sysInterfaceLogWithBLOBs = new SysInterfaceLogWithBLOBs();
                sysInterfaceLogWithBLOBs.setType(1);
                sysInterfaceLogWithBLOBs.setStatus(2);
                sysInterfaceLogWithBLOBs.setCreateTime(new Date());
                sysInterfaceLogWithBLOBs.setRoleType(2);
                sysInterfaceLogWithBLOBs.setSendData(content);
                sysInterfaceLogWithBLOBs.setUserId(0L);
                sysInterfaceLogWithBLOBs.setPhone(mobile);
                SmsController.this.sysInterfaceLogService.create(sysInterfaceLogWithBLOBs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        this.logger.debug("sms code :==============: " + smsCode);
        this.smsUtils.sendSms(mobile, smsCode);
        request.getSession().setAttribute(SMS_CODE_KEY, smsCode);
        return new ResultBean();
    }
}
