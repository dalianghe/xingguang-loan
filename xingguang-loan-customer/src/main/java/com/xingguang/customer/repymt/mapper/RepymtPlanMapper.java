package com.xingguang.customer.repymt.mapper;

import com.xingguang.customer.repymt.entity.RepymtPlan;
import com.xingguang.customer.repymt.entity.RepymtPlanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepymtPlanMapper {
    long countByExample(RepymtPlanExample example);

    int deleteByExample(RepymtPlanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RepymtPlan record);

    int insertSelective(RepymtPlan record);

    List<RepymtPlan> selectByExample(RepymtPlanExample example);

    RepymtPlan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RepymtPlan record, @Param("example") RepymtPlanExample example);

    int updateByExample(@Param("record") RepymtPlan record, @Param("example") RepymtPlanExample example);

    int updateByPrimaryKeySelective(RepymtPlan record);

    int updateByPrimaryKey(RepymtPlan record);
}