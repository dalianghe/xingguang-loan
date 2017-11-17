package com.xingguang.work.auth.params;

import java.io.Serializable;

/**
 * Created by admin on 2017/9/30.
 */
public class AuthBean implements Serializable{
    private String phone;
    private String smsCode;
    private String openId;
    private Long ownerId;

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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}
