package com.xingguang.customer.credit.params;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.link.entity.CusUserLink;

public class CreditApplyParam {

    Long appId;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }
}