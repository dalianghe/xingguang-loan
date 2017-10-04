package com.xingguang.system.user.entity.custom;

import com.xingguang.system.user.entity.SysUserEntity;

/**
 * Created by admin on 2017/10/3.
 */
public class SysUserEntityCustom extends SysUserEntity {

    private String userSexName;
    private String statusName;

    public String getUserSexName() {
        return userSexName;
    }

    public void setUserSexName(String userSexName) {
        this.userSexName = userSexName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
