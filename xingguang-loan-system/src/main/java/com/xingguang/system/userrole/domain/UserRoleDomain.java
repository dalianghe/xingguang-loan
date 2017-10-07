package com.xingguang.system.userrole.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2017/10/7.
 */
public class UserRoleDomain implements Serializable {
    private Long userId;
    private List<Long> roles;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getRoles() {
        return roles;
    }

    public void setRoles(List<Long> roles) {
        this.roles = roles;
    }
}
