package com.xingguang.system.roleresource.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2017/10/8.
 */
public class RoleResourceDomain implements Serializable {

    private Long roleId;
    private List<Long> resources;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public List<Long> getResources() {
        return resources;
    }

    public void setResources(List<Long> resources) {
        this.resources = resources;
    }
}
