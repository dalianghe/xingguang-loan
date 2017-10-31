package com.xingguang.customer.repymt.mapper;

import com.xingguang.customer.repymt.entity.RepymtApply;
import com.xingguang.customer.repymt.entity.RepymtApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepymtApplyMapper {
    long countByExample(RepymtApplyExample example);

    int deleteByExample(RepymtApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RepymtApply record);

    int insertSelective(RepymtApply record);

    List<RepymtApply> selectByExample(RepymtApplyExample example);

    RepymtApply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RepymtApply record, @Param("example") RepymtApplyExample example);

    int updateByExample(@Param("record") RepymtApply record, @Param("example") RepymtApplyExample example);

    int updateByPrimaryKeySelective(RepymtApply record);

    int updateByPrimaryKey(RepymtApply record);
}