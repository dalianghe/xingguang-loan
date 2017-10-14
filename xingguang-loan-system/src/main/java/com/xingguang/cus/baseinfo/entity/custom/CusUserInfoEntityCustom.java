package com.xingguang.cus.baseinfo.entity.custom;

import com.alibaba.fastjson.annotation.JSONField;
import com.xingguang.cus.baseinfo.entity.CusUserInfoEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2017/10/11.
 */
public class CusUserInfoEntityCustom extends CusUserInfoEntity implements Serializable {

    private String realStatusName;
    private String sexName;
    private String incomeName;
    private String educationName;
    private String occupationName;
    private Long applyId;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date applyTime;
    private Long creditUserId;

    public String getRealStatusName() {
        return realStatusName;
    }

    public void setRealStatusName(String realStatusName) {
        this.realStatusName = realStatusName;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getOccupationName() {
        return occupationName;
    }

    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName;
    }

    public Long getCreditUserId() {
        return creditUserId;
    }

    public void setCreditUserId(Long creditUserId) {
        this.creditUserId = creditUserId;
    }
}
