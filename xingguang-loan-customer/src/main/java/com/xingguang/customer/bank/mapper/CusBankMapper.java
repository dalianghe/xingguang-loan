package com.xingguang.customer.bank.mapper;

import com.xingguang.customer.bank.entity.CusBank;
import com.xingguang.customer.bank.entity.CusBankExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CusBankMapper {
    long countByExample(CusBankExample example);

    int deleteByExample(CusBankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CusBank record);

    int insertSelective(CusBank record);

    List<CusBank> selectByExample(CusBankExample example);

    CusBank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CusBank record, @Param("example") CusBankExample example);

    int updateByExample(@Param("record") CusBank record, @Param("example") CusBankExample example);

    int updateByPrimaryKeySelective(CusBank record);

    int updateByPrimaryKey(CusBank record);
}