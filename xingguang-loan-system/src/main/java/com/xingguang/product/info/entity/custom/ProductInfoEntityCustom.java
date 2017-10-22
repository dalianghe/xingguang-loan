package com.xingguang.product.info.entity.custom;

import com.xingguang.product.info.entity.ProductInfoEntity;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/21.
 */
public class ProductInfoEntityCustom extends ProductInfoEntity implements Serializable {

    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
