package com.xingguang.customer.wdrl.service;

import com.xingguang.customer.wdrl.entity.WdrlApply;
import com.xingguang.customer.wdrl.entity.WdrlApplyExample;

import java.util.List;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface IWdrlApplyService {

    int create(WdrlApply wdrlApply);

    int update(WdrlApply wdrlApply);

    List<WdrlApply> getWdrlApplyList(WdrlApplyExample example);

}
