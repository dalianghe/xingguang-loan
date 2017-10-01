package com.xingguang.work.auth.entity;

import java.util.Date;

/**
 * Created by admin on 2017/10/1.
 */
public class WorkUserAuthEntity {
    private int id;
    private String phone;
    private Date createTime ;

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

    @Override
    public String toString() {
        return "WorkUserAuthEntity{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
