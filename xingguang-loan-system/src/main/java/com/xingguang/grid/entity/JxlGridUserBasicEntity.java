package com.xingguang.grid.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  12:45
 * @Version v1.0.0
 */
public class JxlGridUserBasicEntity implements Serializable {
    private Long id;
    private Long bizId;
    private Long gridId;
    private String userName;
    private String userGender;
    private String userAge;
    private String userIdcard;
    private String userIdcardValid;
    private String userProvince;
    private String userCity;
    private String userRegion;
    private String userPhone;
    private String userPhoneOperator;
    private String userPhoneProvince;
    private String userPhoneCity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public Long getGridId() {
        return gridId;
    }

    public void setGridId(Long gridId) {
        this.gridId = gridId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public String getUserIdcardValid() {
        return userIdcardValid;
    }

    public void setUserIdcardValid(String userIdcardValid) {
        this.userIdcardValid = userIdcardValid;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserRegion() {
        return userRegion;
    }

    public void setUserRegion(String userRegion) {
        this.userRegion = userRegion;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPhoneOperator() {
        return userPhoneOperator;
    }

    public void setUserPhoneOperator(String userPhoneOperator) {
        this.userPhoneOperator = userPhoneOperator;
    }

    public String getUserPhoneProvince() {
        return userPhoneProvince;
    }

    public void setUserPhoneProvince(String userPhoneProvince) {
        this.userPhoneProvince = userPhoneProvince;
    }

    public String getUserPhoneCity() {
        return userPhoneCity;
    }

    public void setUserPhoneCity(String userPhoneCity) {
        this.userPhoneCity = userPhoneCity;
    }
}
