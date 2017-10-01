package com.xingguang.customer.login.entity;

import java.util.Date;

/**
 * Created by admin on 2017/10/1.
 */
public class CusUserAuthEntity {
    private int id;
    private String phone;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
