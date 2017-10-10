package com.xingguang.work.baseinfo.entity.custom;

import com.xingguang.work.baseinfo.entity.WorkUserInfoEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/10  15:02
 * @Version v1.0.0
 */
public class WorkUserInfoEntityCustom extends WorkUserInfoEntity {

    private String sexName;
    private String statusName;
    private String enableStatusName;

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getEnableStatusName() {
        return enableStatusName;
    }

    public void setEnableStatusName(String enableStatusName) {
        this.enableStatusName = enableStatusName;
    }
}
