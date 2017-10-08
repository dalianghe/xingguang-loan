package com.xingguang.system.resource.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;
/**
 * Created by admin on 2017/9/30.
 */
public class SysResourceEntity implements Serializable{
    private Long id;

    private String resName;

    private String resType;

    private String resUrl;

    private String menuIcon;

    private Integer menuLevel;

    private String permisCode;

    private Long parentId;

    private Integer sortstring;

    private String deleteFlag;

    private Date deleteTime;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType == null ? null : resType.trim();
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl == null ? null : resUrl.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getPermisCode() {
        return permisCode;
    }

    public void setPermisCode(String permisCode) {
        this.permisCode = permisCode == null ? null : permisCode.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getSortstring() {
        return sortstring;
    }

    public void setSortstring(Integer sortstring) {
        this.sortstring = sortstring;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysResourceEntity{" +
                "id=" + id +
                ", resName='" + resName + '\'' +
                ", resType='" + resType + '\'' +
                ", resUrl='" + resUrl + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuLevel=" + menuLevel +
                ", permisCode='" + permisCode + '\'' +
                ", parentId=" + parentId +
                ", sortstring=" + sortstring +
                ", deleteFlag='" + deleteFlag + '\'' +
                ", deleteTime=" + deleteTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
