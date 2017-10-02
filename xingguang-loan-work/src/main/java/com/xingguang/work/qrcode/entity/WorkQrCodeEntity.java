package com.xingguang.work.qrcode.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2017/10/2.
 */
public class WorkQrCodeEntity implements Serializable {
    private Long id;
    private Long workUserId; // 业务员ID
    private String lng; // 经度
    private String lat; // 纬度
    @JSONField(serialize = false)
    private Integer status; // 状态(1:未使用, 2:已使用)
    private Date createTime; // 生成时间
    private Date updateTime; // 生成时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkUserId() {
        return workUserId;
    }

    public void setWorkUserId(Long workUserId) {
        this.workUserId = workUserId;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "WorkQrCodeEntity{" +
                "id=" + id +
                ", workUserId=" + workUserId +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                ", createTime=" + createTime +
                ", status=" + status +
                '}';
    }
}
