package com.xingguang.customer.interfacelog.mapper;

import com.xingguang.customer.interfacelog.entity.SysInterfaceLog;
import com.xingguang.customer.interfacelog.entity.SysInterfaceLogExample;
import com.xingguang.customer.interfacelog.entity.SysInterfaceLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysInterfaceLogMapper {
    long countByExample(SysInterfaceLogExample example);

    int deleteByExample(SysInterfaceLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysInterfaceLogWithBLOBs record);

    int insertSelective(SysInterfaceLogWithBLOBs record);

    List<SysInterfaceLogWithBLOBs> selectByExampleWithBLOBs(SysInterfaceLogExample example);

    List<SysInterfaceLog> selectByExample(SysInterfaceLogExample example);

    SysInterfaceLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysInterfaceLogWithBLOBs record, @Param("example") SysInterfaceLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SysInterfaceLogWithBLOBs record, @Param("example") SysInterfaceLogExample example);

    int updateByExample(@Param("record") SysInterfaceLog record, @Param("example") SysInterfaceLogExample example);

    int updateByPrimaryKeySelective(SysInterfaceLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysInterfaceLogWithBLOBs record);

    int updateByPrimaryKey(SysInterfaceLog record);
}