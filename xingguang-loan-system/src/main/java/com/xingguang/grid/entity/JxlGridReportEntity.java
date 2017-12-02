package com.xingguang.grid.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  11:07
 * @Version v1.0.0
 */
public class JxlGridReportEntity implements Serializable {

    private Long id;
    private Long bizId;
    private String userGridId;
    private String authOrg;
    private String updateTime;
    private Date createTime;

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

    public String getUserGridId() {
        return userGridId;
    }

    public void setUserGridId(String userGridId) {
        this.userGridId = userGridId;
    }

    public String getAuthOrg() {
        return authOrg;
    }

    public void setAuthOrg(String authOrg) {
        this.authOrg = authOrg;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
