package com.xingguang.utils.sms.entity;

/**
 * Created by Administrator on 2017/11/7 0007.
 */
public class SmsDataRequest {

    private String userid;

    private String account;

    private String password;

    private String mobile;

    private String content;

    private String sendTime;

    private final String action = "send";

    private String extno = "";

    public SmsDataRequest(String userid, String account, String password, String mobile, String content, String sendTime) {
        this.userid = userid;
        this.account = account;
        this.password = password;
        this.mobile = mobile;
        this.content = content;
        this.sendTime = sendTime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getAction() {
        return action;
    }

    public String getExtno() {
        return extno;
    }

    public void setExtno(String extno) {
        this.extno = extno;
    }
}
