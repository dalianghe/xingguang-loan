package com.xingguang.system.resource.entity.custom;

import com.xingguang.system.resource.entity.SysResourceEntity;

import java.util.List;

/**
 * Created by admin on 2017/9/30.
 */
public class SysResourceEntityCustom extends SysResourceEntity{

    private List<SysResourceEntityCustom> sysResourceEntityCustomList;

    public List<SysResourceEntityCustom> getSysResourceEntityCustomList() {
        return sysResourceEntityCustomList;
    }

    public void setSysResourceEntityCustomList(List<SysResourceEntityCustom> sysResourceEntityCustomList) {
        this.sysResourceEntityCustomList = sysResourceEntityCustomList;
    }
}
