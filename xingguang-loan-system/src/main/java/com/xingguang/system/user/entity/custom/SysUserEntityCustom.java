package com.xingguang.system.user.entity.custom;

import com.xingguang.system.role.entity.SysRoleEntity;
import com.xingguang.system.user.entity.SysUserEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/3.
 */
public class SysUserEntityCustom extends SysUserEntity {

    private String userSexName;
    private String statusName;

    private List<SysRoleEntity> roles;

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

    public List<SysRoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRoleEntity> roles) {
        this.roles = roles;
    }
}
