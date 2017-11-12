package com.xingguang.customer.qrcode.mapper;

import com.xingguang.customer.qrcode.entity.WorkQrCode;
import com.xingguang.customer.qrcode.entity.WorkQrCodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkQrCodeMapper {
    long countByExample(WorkQrCodeExample example);

    int deleteByExample(WorkQrCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WorkQrCode record);

    int insertSelective(WorkQrCode record);

    List<WorkQrCode> selectByExample(WorkQrCodeExample example);

    WorkQrCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WorkQrCode record, @Param("example") WorkQrCodeExample example);

    int updateByExample(@Param("record") WorkQrCode record, @Param("example") WorkQrCodeExample example);

    int updateByPrimaryKeySelective(WorkQrCode record);

    int updateByPrimaryKey(WorkQrCode record);
}