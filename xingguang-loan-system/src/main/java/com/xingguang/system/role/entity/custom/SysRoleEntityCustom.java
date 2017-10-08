package com.xingguang.system.role.entity.custom;

import com.xingguang.system.resource.entity.SysResourceEntity;
import com.xingguang.system.role.entity.SysRoleEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2017/10/6.
 */
public class SysRoleEntityCustom extends SysRoleEntity  implements Serializable {

    private String statusName;

    private String marker;

    private List<SysResourceEntity> resources;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public List<SysResourceEntity> getResources() {
        return resources;
    }

    public void setResources(List<SysResourceEntity> resources) {
        this.resources = resources;
    }
}
