package com.xingguang.grid.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  18:00
 * @Version v1.0.0
 */
public class JxlGridIdcardWithOtherPhonesEntity implements Serializable {
    private Long id;
    private Long bizId;
    private Long gridId;
    private String suspPhoneProvince;
    private String suspPhoneOperator;
    private String suspUpdt;
    private String suspPhone;

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

    public String getSuspPhoneProvince() {
        return suspPhoneProvince;
    }

    public void setSuspPhoneProvince(String suspPhoneProvince) {
        this.suspPhoneProvince = suspPhoneProvince;
    }

    public String getSuspPhoneOperator() {
        return suspPhoneOperator;
    }

    public void setSuspPhoneOperator(String suspPhoneOperator) {
        this.suspPhoneOperator = suspPhoneOperator;
    }

    public String getSuspUpdt() {
        return suspUpdt;
    }

    public void setSuspUpdt(String suspUpdt) {
        this.suspUpdt = suspUpdt;
    }

    public String getSuspPhone() {
        return suspPhone;
    }

    public void setSuspPhone(String suspPhone) {
        this.suspPhone = suspPhone;
    }

    public String getSuspPhoneCity() {
        return suspPhoneCity;
    }

    public void setSuspPhoneCity(String suspPhoneCity) {
        this.suspPhoneCity = suspPhoneCity;
    }

    private String suspPhoneCity;



}
