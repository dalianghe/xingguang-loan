package com.xingguang.system.login.params;

import java.io.Serializable;

/**
 * @Description 身份认证实体bean
 * @Author hedaliang
 * @Date 2017/9/21  16:32
 * @Version v1.0.0
 */
public class AuthBean implements Serializable {

    private String loginId;

    private String password;

    private String verificationCode;

    private String rememberMe; // 0:不记住；1：记住

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(String rememberMe) {
        this.rememberMe = rememberMe;
    }
}
