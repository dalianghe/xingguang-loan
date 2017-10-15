package com.xingguang.finance.wdrl.service;

import com.xingguang.finance.wdrl.domain.WdrlDomain;

import java.util.Map;

/**
 * Created by admin on 2017/10/15.
 */
public interface IWdrlApplyService {

    Map<String, Object> findWdrlApplyList(WdrlDomain domain) throws Exception;

}
