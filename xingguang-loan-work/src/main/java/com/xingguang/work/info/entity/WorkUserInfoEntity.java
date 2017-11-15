package com.xingguang.work.info.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2017/10/1.
 */
public class WorkUserInfoEntity implements Serializable {
    private Long id;
    private String phone; // 手机号
    private String name; // 姓名
    private String idNo; // 身份证号
    private Integer sex; // 性别
    private Long provinceId; // 省份ID
    private String provinceName; // 省份名称
    private Long cityId; // 城市ID
    private String cityName; // 城市名称
    private Date createTime; // 创建时间
    private Integer status; // 状态(1:审核中, 2:审核通过, 3:审核不通过)
    @JSONField(serialize = false)
    private Long auditorId; // 审核人ID
    @JSONField(serialize = false)
    private String auditorName; // 审核人姓名
    @JSONField(serialize = false)
    private Date auditorTime; // 审核时间
    private String openId;

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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Long auditorId) {
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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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
