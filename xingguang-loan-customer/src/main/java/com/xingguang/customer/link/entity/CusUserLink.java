package com.xingguang.customer.link.entity;

import java.util.Date;

public class CusUserLink {
    private Long id;

    private Long cusUserId;

    private String linkName;

    private Long relationId;

    private String phone;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusUserId() {
        return cusUserId;
    }

    public void setCusUserId(Long cusUserId) {
        this.cusUserId = cusUserId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}