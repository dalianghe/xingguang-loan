package com.xingguang.grid.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  15:55
 * @Version v1.0.0
 */
public class JxlGridContactsClosestEntity implements Serializable {
    private Long id;
    private Long bizId;
    private Long grayId;
    private String weightToAll;
    private String weightBeAll;
    private String weightAll;
    private String weightToBlack;
    private String weightBeBlack;
    private String weightBlack;
    private String weightToApplied;
    private String weightBeApplied;
    private String weightApplied;

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

    public Long getGrayId() {
        return grayId;
    }

    public void setGrayId(Long grayId) {
        this.grayId = grayId;
    }

    public String getWeightToAll() {
        return weightToAll;
    }

    public void setWeightToAll(String weightToAll) {
        this.weightToAll = weightToAll;
    }

    public String getWeightBeAll() {
        return weightBeAll;
    }

    public void setWeightBeAll(String weightBeAll) {
        this.weightBeAll = weightBeAll;
    }

    public String getWeightAll() {
        return weightAll;
    }

    public void setWeightAll(String weightAll) {
        this.weightAll = weightAll;
    }

    public String getWeightToBlack() {
        return weightToBlack;
    }

    public void setWeightToBlack(String weightToBlack) {
        this.weightToBlack = weightToBlack;
    }

    public String getWeightBeBlack() {
        return weightBeBlack;
    }

    public void setWeightBeBlack(String weightBeBlack) {
        this.weightBeBlack = weightBeBlack;
    }

    public String getWeightBlack() {
        return weightBlack;
    }

    public void setWeightBlack(String weightBlack) {
        this.weightBlack = weightBlack;
    }

    public String getWeightToApplied() {
        return weightToApplied;
    }

    public void setWeightToApplied(String weightToApplied) {
        this.weightToApplied = weightToApplied;
    }

    public String getWeightBeApplied() {
        return weightBeApplied;
    }

    public void setWeightBeApplied(String weightBeApplied) {
        this.weightBeApplied = weightBeApplied;
    }

    public String getWeightApplied() {
        return weightApplied;
    }

    public void setWeightApplied(String weightApplied) {
        this.weightApplied = weightApplied;
    }
}
