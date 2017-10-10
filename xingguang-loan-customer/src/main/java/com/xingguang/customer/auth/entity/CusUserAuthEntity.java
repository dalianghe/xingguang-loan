package com.xingguang.customer.auth.entity;

import java.util.Date;

/**
 * Created by admin on 2017/10/1.
 */
public class CusUserAuthEntity {
    private Long id;
    private String phone;
    private Date createTime = new Date();

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CusUserAuthEntity{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
