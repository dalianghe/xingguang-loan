package com.xingguang.customer.info.entity;

import java.util.Date;

public class CusUserInfo {
    private Long id;

    private String phone;

    private String name;

    private String idNo;

    private Integer realStatus;

    private Integer sex;

    private Integer income;

    private Integer education;

    private Integer occupation;

    private Integer status;

    private Date createTime;

    private Long workUserId;

    private String workUserName;

    private String headImgUrl;

    private String realImg1Url;

    private String realImg2Url;

    private String realImg3Url;

    private String openId;

    private String homeAddr;

    private String companyName;

    private String companyAddr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public Integer getRealStatus() {
        return realStatus;
    }

    public void setRealStatus(Integer realStatus) {
        this.realStatus = realStatus;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getOccupation() {
        return occupation;
    }

    public void setOccupation(Integer occupation) {
        this.occupation = occupation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getWorkUserId() {
        return workUserId;
    }

    public void setWorkUserId(Long workUserId) {
        this.workUserId = workUserId;
    }

    public String getWorkUserName() {
        return workUserName;
    }

    public void setWorkUserName(String workUserName) {
        this.workUserName = workUserName == null ? null : workUserName.trim();
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    public String getRealImg1Url() {
        return realImg1Url;
    }

    public void setRealImg1Url(String realImg1Url) {
        this.realImg1Url = realImg1Url == null ? null : realImg1Url.trim();
    }

    public String getRealImg2Url() {
        return realImg2Url;
    }

    public void setRealImg2Url(String realImg2Url) {
        this.realImg2Url = realImg2Url == null ? null : realImg2Url.trim();
    }

    public String getRealImg3Url() {
        return realImg3Url;
    }

    public void setRealImg3Url(String realImg3Url) {
        this.realImg3Url = realImg3Url == null ? null : realImg3Url.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr == null ? null : homeAddr.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr == null ? null : companyAddr.trim();
    }
}