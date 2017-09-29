package com.xingguang.system.login.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2017/9/22.
 */
public class AuthUserDomain implements Serializable {
    private String userName;
    private String loginId;
    private Date userBirthday;
    private String userSex;
    private String userMobile;
    private String userEmail;
    private String workAddress;
    private String userJob;
    private Date joinDate;
    private String status;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AuthUserDomain{"
                +"userName="+userName
                +",loginId="+loginId
                +",userBirthday="+userBirthday
                +",userSex="+userSex
                +",userMobile="+userMobile
                +",userEmail="+userEmail
                +",workAddress="+workAddress
                +",userJob="+userJob
                +",joinDate="+joinDate
                +",status="+status
                +"}";
    }

}
