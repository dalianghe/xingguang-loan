package com.xingguang.system.userrole.entity;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/7.
 */
public class SysUserRoleEntity implements Serializable {

    private Long id;
    private Long sysUserId;
    private Long sysRoleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public Long getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(Long sysRoleId) {
        this.sysRoleId = sysRoleId;
    }
}