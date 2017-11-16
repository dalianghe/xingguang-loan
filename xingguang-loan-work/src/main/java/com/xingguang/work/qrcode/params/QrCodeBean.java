package com.xingguang.work.qrcode.params;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/2.
 */
public class QrCodeBean implements Serializable{

    private Long workUserId; // 业务员ID
    private String lng; // 经度
    private String lat; // 纬度

    public QrCodeBean(Long workUserId, String lng, String lat) {
        this.workUserId = workUserId;
        this.lng = lng;
        this.lat = lat;
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
}
