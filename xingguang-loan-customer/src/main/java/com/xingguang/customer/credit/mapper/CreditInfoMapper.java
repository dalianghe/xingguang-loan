package com.xingguang.customer.credit.mapper;

import com.xingguang.customer.credit.entity.CreditInfo;
import com.xingguang.customer.credit.entity.CreditInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CreditInfoMapper {
    long countByExample(CreditInfoExample example);

    int deleteByExample(CreditInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CreditInfo record);

    int insertSelective(CreditInfo record);

    List<CreditInfo> selectByExample(CreditInfoExample example);

    CreditInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CreditInfo record, @Param("example") CreditInfoExample example);

    int updateByExample(@Param("record") CreditInfo record, @Param("example") CreditInfoExample example);

    int updateByPrimaryKeySelective(CreditInfo record);

    int updateByPrimaryKey(CreditInfo record);
}