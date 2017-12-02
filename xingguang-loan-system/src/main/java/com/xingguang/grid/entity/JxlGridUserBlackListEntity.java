package com.xingguang.grid.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  17:34
 * @Version v1.0.0
 */
public class JxlGridUserBlackListEntity implements Serializable {
    private Long id;
    private Long bizId;
    private Long gridId;
    private String blacklistNameWithPhone;
    private String blacklistNameWithIdcard;
    private String blacklistUpdateTimeNamePhone;

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

    public String getBlacklistNameWithPhone() {
        return blacklistNameWithPhone;
    }

    public void setBlacklistNameWithPhone(String blacklistNameWithPhone) {
        this.blacklistNameWithPhone = blacklistNameWithPhone;
    }

    public String getBlacklistNameWithIdcard() {
        return blacklistNameWithIdcard;
    }

    public void setBlacklistNameWithIdcard(String blacklistNameWithIdcard) {
        this.blacklistNameWithIdcard = blacklistNameWithIdcard;
    }

    public String getBlacklistUpdateTimeNamePhone() {
        return blacklistUpdateTimeNamePhone;
    }

    public void setBlacklistUpdateTimeNamePhone(String blacklistUpdateTimeNamePhone) {
        this.blacklistUpdateTimeNamePhone = blacklistUpdateTimeNamePhone;
    }

    public String getBlacklistUpdateTimeNameIdcard() {
        return blacklistUpdateTimeNameIdcard;
    }

    public void setBlacklistUpdateTimeNameIdcard(String blacklistUpdateTimeNameIdcard) {
        this.blacklistUpdateTimeNameIdcard = blacklistUpdateTimeNameIdcard;
    }

    private String blacklistUpdateTimeNameIdcard;
}
