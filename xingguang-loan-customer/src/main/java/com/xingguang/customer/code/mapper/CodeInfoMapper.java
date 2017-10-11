package com.xingguang.customer.code.mapper;

import com.xingguang.customer.code.entity.CodeInfo;
import com.xingguang.customer.code.entity.CodeInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CodeInfoMapper {
    long countByExample(CodeInfoExample example);

    int deleteByExample(CodeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CodeInfo record);

    int insertSelective(CodeInfo record);

    List<CodeInfo> selectByExample(CodeInfoExample example);

    CodeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CodeInfo record, @Param("example") CodeInfoExample example);

    int updateByExample(@Param("record") CodeInfo record, @Param("example") CodeInfoExample example);

    int updateByPrimaryKeySelective(CodeInfo record);

    int updateByPrimaryKey(CodeInfo record);
}