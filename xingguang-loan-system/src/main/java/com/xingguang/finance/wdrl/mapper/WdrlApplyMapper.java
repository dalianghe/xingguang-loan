package com.xingguang.finance.wdrl.mapper;

import com.xingguang.finance.wdrl.entity.WdrlApplyEntity;
import com.xingguang.finance.wdrl.entity.custom.WdrlApplyEntityCuston;

import java.util.List;

/**
 * Created by admin on 2017/10/15.
 */
public interface WdrlApplyMapper {

    List<WdrlApplyEntityCuston> findWdrlApplyList(WdrlApplyEntity entity) throws Exception;

    void updateWdrlApply(WdrlApplyEntity entity) throws Exception;

}
