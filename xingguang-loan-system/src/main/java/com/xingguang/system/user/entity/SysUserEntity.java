package com.xingguang.system.user.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 用户实体
 * @Author hedaliang
 * @Date 2017/9/21  10:09
 * @Version v1.0.0
 */
public class SysUserEntity implements Serializable {

    private Long id; //
    private String userName; // 用户姓名
    private String loginId; // 登录账户
    private String password; // 登录密码
    @JSONField(format="yyyy-MM-dd")
    private Date userBirthday; // 出生日期
    private String userSex; // 性别
    private String userMobile; // 手机号
    private String userEmail; // 电子邮箱
    private String workAddress; // 工作地点
    private String userJob; // 职务
    @JSONField(format="yyyy-MM-dd")
    private Date joinDate; // 入职日期
    private String status; // 账户状态 0:正常；1：锁定；2：停用
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime; // 最后登录时间
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime; // 创建时间
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime; // 更新时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
