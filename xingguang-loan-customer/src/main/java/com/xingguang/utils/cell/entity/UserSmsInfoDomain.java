package com.xingguang.utils.cell.entity;

import java.io.Serializable;

/**
 * Created by admin on 2017/11/7.
 */
public class UserSmsInfoDomain implements Serializable {

    private String token; // 授权token
    private String phone; // 授权手机号
    private String password; // 服务密码
    private String website; // 网站英文名称（上个接口返回值中取得）
    private String captcha; // 短信验证码
    private String type;
    private String queryPwd; // 客服密码

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getQueryPwd() {
        return queryPwd;
    }

    public void setQueryPwd(String queryPwd) {
        this.queryPwd = queryPwd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
