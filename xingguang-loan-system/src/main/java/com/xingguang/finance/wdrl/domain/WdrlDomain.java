package com.xingguang.finance.wdrl.domain;

import com.xingguang.common.domain.BaseDomain;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/15.
 */
public class WdrlDomain extends BaseDomain implements Serializable {

    private String cusUserName;

    public String getCusUserName() {
        return cusUserName;
    }

    public void setCusUserName(String cusUserName) {
        this.cusUserName = cusUserName;
    }
}
