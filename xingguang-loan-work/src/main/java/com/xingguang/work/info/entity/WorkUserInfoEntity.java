package com.xingguang.work.info.entity;

import java.util.Date;

/**
 * Created by admin on 2017/10/1.
 */
public class WorkUserInfoEntity {
    private int id;
    private String phone; // 手机号
    private String name; // 姓名
    private String idNo; // 身份证号
    private int sex; // 性别
    private int provinceId; // 省份ID
    private String provinceName; // 省份名称
    private int cityId; // 城市ID
    private String cityName; // 城市名称
    private Date createTime = new Date(); // 创建时间
    private int status; // 状态(1:审核中, 2:审核通过, 3:审核不通过)
    private int auditorId; // 审核人ID
    private String auditorName; // 审核人姓名
    private Date auditorTime; // 审核时间

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(int auditorId) {
        this.auditorId = auditorId;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public Date getAuditorTime() {
        return auditorTime;
    }

    public void setAuditorTime(Date auditorTime) {
        this.auditorTime = auditorTime;
    }

    @Override
    public String toString() {
        return "WorkUserInfoEntity{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", idNo='" + idNo + '\'' +
                ", sex=" + sex +
                ", provinceId=" + provinceId +
                ", provinceName='" + provinceName + '\'' +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", createTime=" + createTime +
                ", status=" + status +
                ", auditorId=" + auditorId +
                ", auditorName='" + auditorName + '\'' +
                ", auditorTime=" + auditorTime +
                '}';
    }
}
