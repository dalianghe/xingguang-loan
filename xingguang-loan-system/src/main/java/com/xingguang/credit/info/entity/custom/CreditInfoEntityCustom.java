package com.xingguang.credit.info.entity.custom;

import com.xingguang.credit.info.entity.CreditInfoEntity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/13  16:14
 * @Version v1.0.0
 */
public class CreditInfoEntityCustom extends CreditInfoEntity implements Serializable {

    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
