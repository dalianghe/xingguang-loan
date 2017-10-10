package com.xingguang.customer.info.mapper;

import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.entity.CusUserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CusUserInfoMapper {
    long countByExample(CusUserInfoExample example);

    int deleteByExample(CusUserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CusUserInfo record);

    int insertSelective(CusUserInfo record);

    List<CusUserInfo> selectByExample(CusUserInfoExample example);

    CusUserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CusUserInfo record, @Param("example") CusUserInfoExample example);

    int updateByExample(@Param("record") CusUserInfo record, @Param("example") CusUserInfoExample example);

    int updateByPrimaryKeySelective(CusUserInfo record);

    int updateByPrimaryKey(CusUserInfo record);
}