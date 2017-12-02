package com.xingguang.grid.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:32
 * @Version v1.0.0
 */
public class JxlGridRegisterOrgsStatisticsEntity implements Serializable {
    private Long id;
    private Long bizId;
    private Long orgsId;
    private String count;
    private String label;

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

    public Long getOrgsId() {
        return orgsId;
    }

    public void setOrgsId(Long orgsId) {
        this.orgsId = orgsId;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
