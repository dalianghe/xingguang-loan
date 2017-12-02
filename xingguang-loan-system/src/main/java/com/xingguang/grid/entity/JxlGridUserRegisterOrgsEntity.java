package com.xingguang.grid.entity;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  16:13
 * @Version v1.0.0
 */
public class JxlGridUserRegisterOrgsEntity implements Serializable {
    private Long id;
    private Long bizId;
    private Long gridId;
    private String registerCnt;
    private String phoneNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public Long getGridId() {
        return gridId;
    }

    public void setGridId(Long gridId) {
        this.gridId = gridId;
    }

    public String getRegisterCnt() {
        return registerCnt;
    }

    public void setRegisterCnt(String registerCnt) {
        this.registerCnt = registerCnt;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
