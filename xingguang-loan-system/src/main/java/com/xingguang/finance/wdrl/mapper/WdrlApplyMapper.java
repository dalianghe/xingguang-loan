package com.xingguang.finance.wdrl.mapper;

import com.xingguang.finance.wdrl.entity.WdrlApplyEntity;
import com.xingguang.finance.wdrl.entity.custom.WdrlApplyEntityCuston;

import java.util.List;

/**
 * Created by admin on 2017/10/15.
 */
public interface WdrlApplyMapper {

    List<WdrlApplyEntityCuston> findAuditApplyList(WdrlApplyEntity entity) throws Exception;

    List<WdrlApplyEntityCuston> findPayApplyList(WdrlApplyEntity entity) throws Exception;

    WdrlApplyEntityCuston findWdrlApplyById(Long id) throws Exception;

    void updateWdrlApply(WdrlApplyEntity entity) throws Exception;

}
