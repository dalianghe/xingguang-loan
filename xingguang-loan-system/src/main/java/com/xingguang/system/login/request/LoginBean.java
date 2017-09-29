package com.xingguang.system.login.request;

import java.io.Serializable;

/**
 * @Description 身份认证实体bean
 * @Author hedaliang
 * @Date 2017/9/21  16:32
 * @Version v1.0.0
 */
public class LoginBean implements Serializable {

    private String loginId;

    private String password;

    private String verificationCode;

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
}
