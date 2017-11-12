package com.xingguang.finance.repy.domain;

import com.xingguang.common.domain.BaseDomain;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/1  18:43
 * @Version v1.0.0
 */
public class RepyDomain extends BaseDomain implements Serializable {

    private Long[] ids;

    private Long[] applyIds;

    private String cusUserName;

    private Integer repymtType;

    private Long operatorId;

    private String operatorName;

    private Date createTime;

    public Long[] getIds() {
        return ids;
    }

    public void setIds(Long[] ids) {
        this.ids = ids;
    }

    public Long[] getApplyIds() {
        return applyIds;
    }

    public void setApplyIds(Long[] applyIds) {
        this.applyIds = applyIds;
    }

    public String getCusUserName() {
        return cusUserName;
    }

    public void setCusUserName(String cusUserName) {
        this.cusUserName = cusUserName;
    }

    public Integer getRepymtType() {
        return repymtType;
    }

    public void setRepymtType(Integer repymtType) {
        this.repymtType = repymtType;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
