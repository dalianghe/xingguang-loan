package com.xingguang.utils.cell.entity;

import java.io.Serializable;

/**
 * Created by admin on 2017/11/7.
 */
public class UserBasicInfoDomain implements Serializable {

    private String name; // 用户姓名  * 必填
    private String idCardNum; // 身份证号  * 必填
    private String cellPhoneNum; // 授权手机号  * 必填
    private String password; // 服务密码 * 必填

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getCellPhoneNum() {
        return cellPhoneNum;
    }

    public void setCellPhoneNum(String cellPhoneNum) {
        this.cellPhoneNum = cellPhoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
