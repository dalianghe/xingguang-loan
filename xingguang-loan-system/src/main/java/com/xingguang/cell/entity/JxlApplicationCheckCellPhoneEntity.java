package com.xingguang.cell.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/27  19:24
 * @Version v1.0.0
 */
public class JxlApplicationCheckCellPhoneEntity implements Serializable {
    private Long id;
    private Long rptId;
    private String keyValue;
    private String website;
    private String reliability;
    private String regTime;
    private String checkName;
    private String checkIdcard;
    private String checkEbusiness;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public Long getRptId() {
        return rptId;
    }

    public void setRptId(Long rptId) {
        this.rptId = rptId;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getReliability() {
        return reliability;
    }

    public void setReliability(String reliability) {
        this.reliability = reliability;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public String getCheckIdcard() {
        return checkIdcard;
    }

    public void setCheckIdcard(String checkIdcard) {
        this.checkIdcard = checkIdcard;
    }

    public String getCheckEbusiness() {
        return checkEbusiness;
    }

    public void setCheckEbusiness(String checkEbusiness) {
        this.checkEbusiness = checkEbusiness;
    }
}
