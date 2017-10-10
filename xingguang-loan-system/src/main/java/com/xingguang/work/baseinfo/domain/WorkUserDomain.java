package com.xingguang.work.baseinfo.domain;

import com.xingguang.common.domain.BaseDomain;

import java.io.Serializable;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/10  15:11
 * @Version v1.0.0
 */
public class WorkUserDomain  extends BaseDomain implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
