package com.xingguang.credit.apply.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/12  14:04
 * @Version v1.0.0
 */
public class CreditApplyEntity implements Serializable{

    private Long id;
    private Long cusUserId; // 客户ID
    private Integer status; // 状态(1:待授信, 2:授信通过, 3:授信不通过)
    private Date createTime; // 申请时间
    private BigDecimal amount; // 授信金额
    private Date creditTime; // 授信时间
    private Long creditUserId; // 授信操作人ID
    private String creditUserName; // 授信操作人姓名
    private String refuseCode; // 拒代码

    private String cusLng; // 客户经度
    private String cusLat; // 客户纬度
    private Long cusProvinceId; // 客户省ID
    private String cusProvinceName; // 客户省名称
    private Long cusCityId; // 客户市ID
    private String cusCityName; // 客户市名称
    private String cusAddr; // 客户地址全称

    private Long workUserId; // 业务员ID
    private String workUserName; // 业务员姓名
    private String workLng; // 客户经度
    private String workLat; // 客户纬度
    private Long workProvinceId; // 客户省ID
    private String workProvinceName; // 客户省名称
    private Long workCityId; // 客户市ID
    private String workCityName; // 客户市名称
    private String workAddr; // 客户地址全称

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
        this.creditUserName = creditUserName;
    }

    public String getRefuseCode() {
        return refuseCode;
    }

    public void setRefuseCode(String refuseCode) {
        this.refuseCode = refuseCode;
    }

    public String getCusLng() {
        return cusLng;
    }

    public void setCusLng(String cusLng) {
        this.cusLng = cusLng;
    }

    public String getCusLat() {
        return cusLat;
    }

    public void setCusLat(String cusLat) {
        this.cusLat = cusLat;
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
        this.cusProvinceName = cusProvinceName;
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
        this.cusCityName = cusCityName;
    }

    public String getCusAddr() {
        return cusAddr;
    }

    public void setCusAddr(String cusAddr) {
        this.cusAddr = cusAddr;
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
        this.workUserName = workUserName;
    }

    public String getWorkLng() {
        return workLng;
    }

    public void setWorkLng(String workLng) {
        this.workLng = workLng;
    }

    public String getWorkLat() {
        return workLat;
    }

    public void setWorkLat(String workLat) {
        this.workLat = workLat;
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
        this.workProvinceName = workProvinceName;
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
        this.workCityName = workCityName;
    }

    public String getWorkAddr() {
        return workAddr;
    }

    public void setWorkAddr(String workAddr) {
        this.workAddr = workAddr;
    }
}
