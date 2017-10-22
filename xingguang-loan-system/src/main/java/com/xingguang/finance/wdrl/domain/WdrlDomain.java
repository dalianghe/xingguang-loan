package com.xingguang.finance.wdrl.domain;

import com.xingguang.common.domain.BaseDomain;

import java.io.Serializable;
import java.util.Date;

/**
 * 放款domain
 */
public class WdrlDomain extends BaseDomain implements Serializable {

    private Long id;
    private Long[] ids;
    private String cusUserName;
    private Integer status;
    private Long operatorId;
    private String operatorName;
    private Date issueTime;

    public Long getId() {
        return id;
    }

    public Long[] getIds() {
        return ids;
    }

    public void setIds(Long[] ids) {
        this.ids = ids;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCusUserName() {
        return cusUserName;
    }

    public void setCusUserName(String cusUserName) {
        this.cusUserName = cusUserName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }
}
