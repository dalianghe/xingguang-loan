package com.xingguang.cus.linkinfo.entity.custom;

import com.xingguang.cus.linkinfo.entity.CusUserLinkEntity;

/**
 * Created by admin on 2017/10/12.
 */
public class CusUserLinkEntityCustom extends CusUserLinkEntity{

    private String relationName;

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }
}
