package com.xingguang.finance.wdrl.entity.custom;

import com.xingguang.finance.wdrl.entity.WdrlApplyEntity;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/15.
 */
public class WdrlApplyEntityCuston extends WdrlApplyEntity implements Serializable {

    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
