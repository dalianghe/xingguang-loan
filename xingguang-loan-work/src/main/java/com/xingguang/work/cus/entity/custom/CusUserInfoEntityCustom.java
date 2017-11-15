package com.xingguang.work.cus.entity.custom;

import com.xingguang.work.cus.entity.CusUserInfoEntity;

/**
 * Created by admin on 2017/11/15.
 */
public class CusUserInfoEntityCustom extends CusUserInfoEntity{

    private String sexName;
    private String incomeName;
    private String educationName;
    private String occupationName;

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
}
