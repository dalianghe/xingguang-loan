package com.xingguang.customer.wdrl.mapper;

import com.xingguang.customer.wdrl.entity.WdrlApply;
import com.xingguang.customer.wdrl.entity.WdrlApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WdrlApplyMapper {
    long countByExample(WdrlApplyExample example);

    int deleteByExample(WdrlApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WdrlApply record);

    int insertSelective(WdrlApply record);

    List<WdrlApply> selectByExample(WdrlApplyExample example);

    WdrlApply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WdrlApply record, @Param("example") WdrlApplyExample example);

    int updateByExample(@Param("record") WdrlApply record, @Param("example") WdrlApplyExample example);

    int updateByPrimaryKeySelective(WdrlApply record);

    int updateByPrimaryKey(WdrlApply record);
}