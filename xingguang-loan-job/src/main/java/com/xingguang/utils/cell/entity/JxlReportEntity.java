package com.xingguang.utils.cell.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2017/11/9.
 */
public class JxlReportEntity implements Serializable {

    private Long id;
    private Long bizId; // 业务ID
    private String rptId; // 报告编号
    private String token; // token
    private String version; // 报告版本
    private String updateTime; // 报告生成时间
    private Date createTime; // 创建时间

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

    public String getRptId() {
        return rptId;
    }

    public void setRptId(String rptId) {
        this.rptId = rptId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
