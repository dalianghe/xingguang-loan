package com.xingguang.work.baseinfo.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/10  14:32
 * @Version v1.0.0
 */
public class WorkUserInfoEntity implements Serializable{

    private Long id;
    private String phone; // 手机号
    private String name; // 姓名
    private String idNo; // 身份证号
    private Integer sex; // 性别
    private Long provinceId; // 省ID
    private String provinceName; // 省名称
    private Long cityId; // 市ID
    private String cityName; // 市名称
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime; // 创建时间
    private Integer status; // 状态(1:审核中, 2:审核通过, 3:审核不通过)
    private Long auditorId; // 审核人ID
    private String auditorName; // 审核人姓名
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditorTime; // 审核时间
    private Integer enableStatus; // 0：启用；1：停用
    private Long enableId; //  启用停用操作人ID
    private String enableName; // 启用停用操作人
    private Date enableTime; // 启用停用时间

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

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Long getEnableId() {
        return enableId;
    }

    public void setEnableId(Long enableId) {
        this.enableId = enableId;
    }

    public String getEnableName() {
        return enableName;
    }

    public void setEnableName(String enableName) {
        this.enableName = enableName;
    }

    public Date getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }
}
