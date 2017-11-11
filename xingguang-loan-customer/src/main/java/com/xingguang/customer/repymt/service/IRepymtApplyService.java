package com.xingguang.customer.repymt.service;

import com.xingguang.customer.repymt.entity.RepymtApply;
import com.xingguang.customer.wdrl.entity.WdrlApply;

import java.util.List;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface IRepymtApplyService {

    void create(RepymtApply repymtApply, List<Long> RepymtPlanIdList, Long wdrlId);

}
