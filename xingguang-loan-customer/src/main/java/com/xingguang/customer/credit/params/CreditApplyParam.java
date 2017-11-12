package com.xingguang.customer.credit.params;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.link.entity.CusUserLink;

public class CreditApplyParam {

    Long appId;

    String cusLng;

    String cusLat;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getCusLng() {
        return cusLng;
    }

    public void setCusLng(String cusLng) {
        this.cusLng = cusLng;
    }

    public String getCusLat() {
        return cusLat;
    }

    public void setCusLat(String cusLat) {
        this.cusLat = cusLat;
    }
}