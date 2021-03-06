package com.xingguang.grid.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  18:00
 * @Version v1.0.0
 */
public class JxlGridIdcardAppliedInOrgsEntity implements Serializable {
    private Long id;
    private Long bizId;
    private Long gridId;
    private String suspOrgType;
    private String suspUpdt;

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

    public String getSuspOrgType() {
        return suspOrgType;
    }

    public void setSuspOrgType(String suspOrgType) {
        this.suspOrgType = suspOrgType;
    }

    public String getSuspUpdt() {
        return suspUpdt;
    }

    public void setSuspUpdt(String suspUpdt) {
        this.suspUpdt = suspUpdt;
    }


}
