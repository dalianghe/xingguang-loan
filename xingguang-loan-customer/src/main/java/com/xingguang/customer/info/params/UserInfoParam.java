package com.xingguang.customer.info.params;

import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.link.entity.CusUserLink;

public class UserInfoParam {

    CusUserInfo cusUserInfo;

    CusUserLink cusUserLink;

    public CusUserInfo getCusUserInfo() {
        return cusUserInfo;
    }

    public void setCusUserInfo(CusUserInfo cusUserInfo) {
        this.cusUserInfo = cusUserInfo;
    }

    public CusUserLink getCusUserLink() {
        return cusUserLink;
    }

    public void setCusUserLink(CusUserLink cusUserLink) {
        this.cusUserLink = cusUserLink;
    }
}