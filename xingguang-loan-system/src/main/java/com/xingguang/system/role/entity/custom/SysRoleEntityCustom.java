package com.xingguang.system.role.entity.custom;

import com.xingguang.system.role.entity.SysRoleEntity;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/6.
 */
public class SysRoleEntityCustom extends SysRoleEntity  implements Serializable {

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    private String statusName;

}
