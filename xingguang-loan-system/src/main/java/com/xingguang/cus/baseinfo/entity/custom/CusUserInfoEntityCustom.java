package com.xingguang.cus.baseinfo.entity.custom;

import com.xingguang.cus.baseinfo.entity.CusUserInfoEntity;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/11.
 */
public class CusUserInfoEntityCustom extends CusUserInfoEntity implements Serializable {

    private String realStatusName;
    private String sexName;

    public String getRealStatusName() {
        return realStatusName;
    }

    public void setRealStatusName(String realStatusName) {
        this.realStatusName = realStatusName;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }
}
