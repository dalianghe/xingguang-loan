package com.xingguang.system.roleresource.entity;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/8.
 */
public class SysRoleResourceEntity implements Serializable{

    private Long id;
    private Long sysRoleId;
    private Long sysResourceId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(Long sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    public Long getSysResourceId() {
        return sysResourceId;
    }

    public void setSysResourceId(Long sysResourceId) {
        this.sysResourceId = sysResourceId;
    }
}
