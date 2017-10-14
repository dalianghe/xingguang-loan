package com.xingguang.customer.credit.params;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.link.entity.CusUserLink;

public class CreditApplyParam {

    CusUserInfo cusUserInfo;

    CreditApply creditApply;

    CusUserLink cusUserLink;

    public CusUserInfo getCusUserInfo() {
        return cusUserInfo;
    }

    public void setCusUserInfo(CusUserInfo cusUserInfo) {
        this.cusUserInfo = cusUserInfo;
    }

    public CreditApply getCreditApply() {
        return creditApply;
    }

    public void setCreditApply(CreditApply creditApply) {
        this.creditApply = creditApply;
    }

    public CusUserLink getCusUserLink() {
        return cusUserLink;
    }

    public void setCusUserLink(CusUserLink cusUserLink) {
        this.cusUserLink = cusUserLink;
    }
}