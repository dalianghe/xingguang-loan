package com.xingguang.grid.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  13:31
 * @Version v1.0.0
 */
public class JxlGridUserGrayEntity implements Serializable {
    private Long id;
    private Long bizId;
    private Long gridId;
    private String userPhone;
    private String phoneGrayScore;
    private String hasReport;
    private String recentActiveTime;
    private String socialLiveness;
    private String socialInfluence;

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

    public Long getGridId() {
        return gridId;
    }

    public void setGridId(Long gridId) {
        this.gridId = gridId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getPhoneGrayScore() {
        return phoneGrayScore;
    }

    public void setPhoneGrayScore(String phoneGrayScore) {
        this.phoneGrayScore = phoneGrayScore;
    }

    public String getHasReport() {
        return hasReport;
    }

    public void setHasReport(String hasReport) {
        this.hasReport = hasReport;
    }

    public String getRecentActiveTime() {
        return recentActiveTime;
    }

    public void setRecentActiveTime(String recentActiveTime) {
        this.recentActiveTime = recentActiveTime;
    }

    public String getSocialLiveness() {
        return socialLiveness;
    }

    public void setSocialLiveness(String socialLiveness) {
        this.socialLiveness = socialLiveness;
    }

    public String getSocialInfluence() {
        return socialInfluence;
    }

    public void setSocialInfluence(String socialInfluence) {
        this.socialInfluence = socialInfluence;
    }
}
