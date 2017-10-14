package com.xingguang.customer.credit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CreditApply {
    private Long id;

    private Long cusUserId;

    private Integer status;

    private Date createTime;

    private BigDecimal amount;

    private Date creditTime;

    private Long creditUserId;

    private String creditUserName;

    private String refuseCode;

    private String cusLng;

    private String cusLat;

    private Long cusProvinceId;

    private String cusProvinceName;

    private Long cusCityId;

    private String cusCityName;

    private String cusAddr;

    private Long workUserId;

    private String workUserName;

    private String workLng;

    private String workLat;

    private Long workProvinceId;

    private String workProvinceName;

    private Long workCityId;

    private String workCityName;

    private String workAddr;

    private String cusWorkDistance;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Date creditTime) {
        this.creditTime = creditTime;
    }

    public Long getCreditUserId() {
        return creditUserId;
    }

    public void setCreditUserId(Long creditUserId) {
        this.creditUserId = creditUserId;
    }

    public String getCreditUserName() {
        return creditUserName;
    }

    public void setCreditUserName(String creditUserName) {
        this.creditUserName = creditUserName == null ? null : creditUserName.trim();
    }

    public String getRefuseCode() {
        return refuseCode;
    }

    public void setRefuseCode(String refuseCode) {
        this.refuseCode = refuseCode == null ? null : refuseCode.trim();
    }

    public String getCusLng() {
        return cusLng;
    }

    public void setCusLng(String cusLng) {
        this.cusLng = cusLng == null ? null : cusLng.trim();
    }

    public String getCusLat() {
        return cusLat;
    }

    public void setCusLat(String cusLat) {
        this.cusLat = cusLat == null ? null : cusLat.trim();
    }

    public Long getCusProvinceId() {
        return cusProvinceId;
    }

    public void setCusProvinceId(Long cusProvinceId) {
        this.cusProvinceId = cusProvinceId;
    }

    public String getCusProvinceName() {
        return cusProvinceName;
    }

    public void setCusProvinceName(String cusProvinceName) {
        this.cusProvinceName = cusProvinceName == null ? null : cusProvinceName.trim();
    }

    public Long getCusCityId() {
        return cusCityId;
    }

    public void setCusCityId(Long cusCityId) {
        this.cusCityId = cusCityId;
    }

    public String getCusCityName() {
        return cusCityName;
    }

    public void setCusCityName(String cusCityName) {
        this.cusCityName = cusCityName == null ? null : cusCityName.trim();
    }

    public String getCusAddr() {
        return cusAddr;
    }

    public void setCusAddr(String cusAddr) {
        this.cusAddr = cusAddr == null ? null : cusAddr.trim();
    }

    public Long getWorkUserId() {
        return workUserId;
    }

    public void setWorkUserId(Long workUserId) {
        this.workUserId = workUserId;
    }

    public String getWorkUserName() {
        return workUserName;
    }

    public void setWorkUserName(String workUserName) {
        this.workUserName = workUserName == null ? null : workUserName.trim();
    }

    public String getWorkLng() {
        return workLng;
    }

    public void setWorkLng(String workLng) {
        this.workLng = workLng == null ? null : workLng.trim();
    }

    public String getWorkLat() {
        return workLat;
    }

    public void setWorkLat(String workLat) {
        this.workLat = workLat == null ? null : workLat.trim();
    }

    public Long getWorkProvinceId() {
        return workProvinceId;
    }

    public void setWorkProvinceId(Long workProvinceId) {
        this.workProvinceId = workProvinceId;
    }

    public String getWorkProvinceName() {
        return workProvinceName;
    }

    public void setWorkProvinceName(String workProvinceName) {
        this.workProvinceName = workProvinceName == null ? null : workProvinceName.trim();
    }

    public Long getWorkCityId() {
        return workCityId;
    }

    public void setWorkCityId(Long workCityId) {
        this.workCityId = workCityId;
    }

    public String getWorkCityName() {
        return workCityName;
    }

    public void setWorkCityName(String workCityName) {
        this.workCityName = workCityName == null ? null : workCityName.trim();
    }

    public String getWorkAddr() {
        return workAddr;
    }

    public void setWorkAddr(String workAddr) {
        this.workAddr = workAddr == null ? null : workAddr.trim();
    }

    public String getCusWorkDistance() {
        return cusWorkDistance;
    }

    public void setCusWorkDistance(String cusWorkDistance) {
        this.cusWorkDistance = cusWorkDistance == null ? null : cusWorkDistance.trim();
    }
}