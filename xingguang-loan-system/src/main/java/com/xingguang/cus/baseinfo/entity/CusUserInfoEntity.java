package com.xingguang.cus.baseinfo.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2017/10/11.
 */
public class CusUserInfoEntity implements Serializable {

    private Long id;
    private String phone;
    private String name;
    private String idNo;
    private Integer realStatus;
    private Integer sex;
    private String income;
    private String education;
    private String occupation;
    private Integer status;
    @JSONField(format="yyyy-MM-dd")
    private Date createTime;
    private Long workUserId;
    private String workUserName;
    private String headImgUrl;
    private String realImg1Url;
    private String realImg2Url;
    private String realImg3Url;

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
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
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
        this.workUserName = workUserName;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getRealImg1Url() {
        return realImg1Url;
    }

    public void setRealImg1Url(String realImg1Url) {
        this.realImg1Url = realImg1Url;
    }

    public String getRealImg2Url() {
        return realImg2Url;
    }

    public void setRealImg2Url(String realImg2Url) {
        this.realImg2Url = realImg2Url;
    }

    public String getRealImg3Url() {
        return realImg3Url;
    }

    public void setRealImg3Url(String realImg3Url) {
        this.realImg3Url = realImg3Url;
    }
}
