package com.xingguang.customer.info.entity;

import com.xingguang.customer.link.entity.CusUserLinkAll;

public class CusUserInfoAll extends CusUserInfo {

    private String sexName;

    private String incomeName;

    private String educationName;

    private String occupationName;

    private CusUserLinkAll cusUserLinkAll;

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public String getOccupationName() {
        return occupationName;
    }

    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName;
    }

    public CusUserLinkAll getCusUserLinkAll() {
        return cusUserLinkAll;
    }

    public void setCusUserLinkAll(CusUserLinkAll cusUserLinkAll) {
        this.cusUserLinkAll = cusUserLinkAll;
    }
}