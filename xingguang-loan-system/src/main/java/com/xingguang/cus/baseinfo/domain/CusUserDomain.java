package com.xingguang.cus.baseinfo.domain;

import com.xingguang.common.domain.BaseDomain;

/**
 * Created by admin on 2017/10/11.
 */
public class CusUserDomain extends BaseDomain{

    private String name;

    private Long creditUserId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreditUserId() {
        return creditUserId;
    }

    public void setCreditUserId(Long creditUserId) {
        this.creditUserId = creditUserId;
    }
}
