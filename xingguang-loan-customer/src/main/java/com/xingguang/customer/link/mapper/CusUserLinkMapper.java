package com.xingguang.customer.link.mapper;

import com.xingguang.customer.link.entity.CusUserLink;
import com.xingguang.customer.link.entity.CusUserLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CusUserLinkMapper {
    long countByExample(CusUserLinkExample example);

    int deleteByExample(CusUserLinkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CusUserLink record);

    int insertSelective(CusUserLink record);

    List<CusUserLink> selectByExample(CusUserLinkExample example);

    CusUserLink selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CusUserLink record, @Param("example") CusUserLinkExample example);

    int updateByExample(@Param("record") CusUserLink record, @Param("example") CusUserLinkExample example);

    int updateByPrimaryKeySelective(CusUserLink record);

    int updateByPrimaryKey(CusUserLink record);
}