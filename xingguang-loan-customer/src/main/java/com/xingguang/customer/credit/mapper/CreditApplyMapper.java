package com.xingguang.customer.credit.mapper;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.credit.entity.CreditApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CreditApplyMapper {
    long countByExample(CreditApplyExample example);

    int deleteByExample(CreditApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CreditApply record);

    int insertSelective(CreditApply record);

    List<CreditApply> selectByExample(CreditApplyExample example);

    CreditApply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CreditApply record, @Param("example") CreditApplyExample example);

    int updateByExample(@Param("record") CreditApply record, @Param("example") CreditApplyExample example);

    int updateByPrimaryKeySelective(CreditApply record);

    int updateByPrimaryKey(CreditApply record);

    //自定义

    int insertSelectiveApplyNo(CreditApply record);

}