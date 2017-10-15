package com.xingguang.credit.code.entity;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/15.
 */
public class CodeRefuseEntity implements Serializable {

    private Long id;
    private String refuseCode; // 拒贷码code
    private String refuseName; //拒贷码name
    private Long parentId;
    private Integer refuseOrder;
    private Integer status; // 状态（0：有效；1：无效）

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefuseCode() {
        return refuseCode;
    }

    public void setRefuseCode(String refuseCode) {
        this.refuseCode = refuseCode;
    }

    public String getRefuseName() {
        return refuseName;
    }

    public void setRefuseName(String refuseName) {
        this.refuseName = refuseName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getRefuseOrder() {
        return refuseOrder;
    }

    public void setRefuseOrder(Integer refuseOrder) {
        this.refuseOrder = refuseOrder;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
