package com.xingguang.finance.wdrl.mapper;

import com.xingguang.finance.wdrl.entity.WdrlApplyEntity;
import com.xingguang.finance.wdrl.entity.custom.WdrlApplyEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/10/15.
 */
public interface WdrlApplyMapper {

    List<WdrlApplyEntityCustom> findAuditApplyList(WdrlApplyEntity entity) throws Exception;

    List<WdrlApplyEntityCustom> findPayApplyList(WdrlApplyEntity entity) throws Exception;

    List<WdrlApplyEntityCustom> findPayDoneList(WdrlApplyEntity entity) throws Exception;

    WdrlApplyEntityCustom findWdrlApplyById(Long id) throws Exception;

    List<WdrlApplyEntityCustom> findWdrlApplyByCusId(Long cusUserId) throws Exception;

    void updateWdrlApply(WdrlApplyEntity entity) throws Exception;

}
