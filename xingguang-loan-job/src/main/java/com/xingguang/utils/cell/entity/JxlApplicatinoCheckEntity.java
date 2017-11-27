package com.xingguang.utils.cell.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/27  16:15
 * @Version v1.0.0
 */
public class JxlApplicatinoCheckEntity implements Serializable{
    private Long id;
    private Long rptId;
    private String appPoint;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRptId() {
        return rptId;
    }

    public void setRptId(Long rptId) {
        this.rptId = rptId;
    }

    public String getAppPoint() {
        return appPoint;
    }

    public void setAppPoint(String appPoint) {
        this.appPoint = appPoint;
    }

}
