package com.xingguang.system.common.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/10/5.
 */
public class BaseDomain {

    protected Map<String, Integer> pager = new HashMap<String, Integer>();

    public Map<String, Integer> getPager() {
        return pager;
    }

    public void setPager(Map<String, Integer> pager) {
        this.pager = pager;
    }
}
