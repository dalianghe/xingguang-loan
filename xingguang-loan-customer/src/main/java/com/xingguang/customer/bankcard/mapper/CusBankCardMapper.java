package com.xingguang.customer.bankcard.mapper;

import com.xingguang.customer.bankcard.entity.CusBankCard;
import com.xingguang.customer.bankcard.entity.CusBankCardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CusBankCardMapper {
    long countByExample(CusBankCardExample example);

    int deleteByExample(CusBankCardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CusBankCard record);

    int insertSelective(CusBankCard record);

    List<CusBankCard> selectByExample(CusBankCardExample example);

    CusBankCard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CusBankCard record, @Param("example") CusBankCardExample example);

    int updateByExample(@Param("record") CusBankCard record, @Param("example") CusBankCardExample example);

    int updateByPrimaryKeySelective(CusBankCard record);

    int updateByPrimaryKey(CusBankCard record);
}