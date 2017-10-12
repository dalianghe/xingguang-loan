package com.xingguang.credit.apply.entity.custom;

import com.xingguang.credit.apply.entity.CreditApplyEntity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/12  14:18
 * @Version v1.0.0
 */
public class CreditApplyEntityCustom extends CreditApplyEntity implements Serializable {

    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
