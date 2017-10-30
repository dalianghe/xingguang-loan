package com.xingguang.customer.worker.mapper;

import com.xingguang.customer.worker.entity.WorkUserInfo;
import com.xingguang.customer.worker.entity.WorkUserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkUserInfoMapper {
    long countByExample(WorkUserInfoExample example);

    int deleteByExample(WorkUserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WorkUserInfo record);

    int insertSelective(WorkUserInfo record);

    List<WorkUserInfo> selectByExample(WorkUserInfoExample example);

    WorkUserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WorkUserInfo record, @Param("example") WorkUserInfoExample example);

    int updateByExample(@Param("record") WorkUserInfo record, @Param("example") WorkUserInfoExample example);

    int updateByPrimaryKeySelective(WorkUserInfo record);

    int updateByPrimaryKey(WorkUserInfo record);

    //自定义

    WorkUserInfo getWorkUserByCusUserId(Long id);

}