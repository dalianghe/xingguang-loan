package com.xingguang.credit.mng.domain;

import com.xingguang.common.domain.BaseDomain;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/18.
 */
public class CreditDomain extends BaseDomain implements Serializable {

    private String name;
    private Integer status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
