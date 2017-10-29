package com.xingguang.finance.wdrl.service;

import com.xingguang.finance.wdrl.domain.WdrlDomain;
import com.xingguang.finance.wdrl.entity.WdrlApplyEntity;
import com.xingguang.finance.wdrl.entity.custom.ApplyAndPlanEntityCustom;
import com.xingguang.finance.wdrl.entity.custom.WdrlApplyEntityCuston;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/10/15.
 */
public interface IWdrlApplyService {

    public Map<String, Object> findAuditApplyList(WdrlDomain domain) throws Exception;

    public Map<String, Object> findPayApplyList(WdrlDomain domain) throws Exception;

    public WdrlApplyEntityCuston findWdrlApplyById(Long id) throws Exception;

    public List<WdrlApplyEntityCuston> findWdrlApplyByCusId(Long cusUserId) throws Exception;

    public void updateWdrlApply(WdrlDomain domain) throws Exception;

    public void paypal(WdrlDomain domain) throws Exception;

    public void stopPaypal(WdrlDomain domain) throws Exception;

    public ApplyAndPlanEntityCustom viewPlanAndCharge(Long id) throws Exception;

}
