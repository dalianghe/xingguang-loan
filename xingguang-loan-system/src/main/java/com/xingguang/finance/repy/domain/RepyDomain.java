package com.xingguang.finance.repy.domain;

import com.xingguang.common.domain.BaseDomain;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/1  18:43
 * @Version v1.0.0
 */
public class RepyDomain extends BaseDomain implements Serializable {
    private String cusUserName;

    public String getCusUserName() {
        return cusUserName;
    }

    public void setCusUserName(String cusUserName) {
        this.cusUserName = cusUserName;
    }
}
