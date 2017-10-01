package com.xingguang.customer.info.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by admin on 2017/10/1.
 */
public class CusUserInfoEntity {
    private int id;
    private String phone; // 手机号
    private String name; // 姓名
    private String idNo; // 身份证号
    private int realStatus; // 认证状态（1.已实名, 2.未实名）
    private int sex; // 性别
    private BigDecimal income; // 收入
    private int education; // 学历
    private int occupation; // 职业
    private Date createTime = new Date(); // 创建时间
    private int workUserId; // 业务员ID

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

    public int getRealStatus() {
        return realStatus;
    }

    public void setRealStatus(int realStatus) {
        this.realStatus = realStatus;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getWorkUserId() {
        return workUserId;
    }

    public void setWorkUserId(int workUserId) {
        this.workUserId = workUserId;
    }

    @Override
    public String toString() {
        return "CusUserInfoEntity{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", idNo='" + idNo + '\'' +
                ", realStatus=" + realStatus +
                ", sex=" + sex +
                ", income=" + income +
                ", education=" + education +
                ", occupation=" + occupation +
                ", createTime=" + createTime +
                ", workUserId=" + workUserId +
                '}';
    }
}
