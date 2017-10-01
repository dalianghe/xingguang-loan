package com.xingguang.customer.auth.params;

/**
 * Created by admin on 2017/9/30.
 */
public class AuthBean {
    private String phone;
    private String smsCode;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }
}
