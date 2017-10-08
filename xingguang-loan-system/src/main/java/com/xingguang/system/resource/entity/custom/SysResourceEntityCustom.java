package com.xingguang.system.resource.entity.custom;

import com.xingguang.system.resource.entity.SysResourceEntity;

import java.util.List;

/**
 * Created by admin on 2017/9/30.
 */
public class SysResourceEntityCustom extends SysResourceEntity{

    private String  menuLevelName;

    private List<SysResourceEntityCustom> subMenus;

    public List<SysResourceEntityCustom> getSubMenus() {
        return subMenus;
    }

    public void setSubMenus(List<SysResourceEntityCustom> subMenus) {
        this.subMenus = subMenus;
    }

    public String getMenuLevelName() {
        return menuLevelName;
    }

    public void setMenuLevelName(String menuLevelName) {
        this.menuLevelName = menuLevelName;
    }
}
