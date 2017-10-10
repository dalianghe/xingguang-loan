package com.xingguang.customer.credit.params;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.info.entity.CusUserInfo;

public class CreditApplyParam {

    CusUserInfo cusUserInfo;

    CreditApply creditApply;

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
}