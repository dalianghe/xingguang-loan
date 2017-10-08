package com.xingguang.customer.product.mapper;

import com.xingguang.customer.product.entity.ProductTermInfo;
import com.xingguang.customer.product.entity.ProductTermInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductTermInfoMapper {
    long countByExample(ProductTermInfoExample example);

    int deleteByExample(ProductTermInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductTermInfo record);

    int insertSelective(ProductTermInfo record);

    List<ProductTermInfo> selectByExample(ProductTermInfoExample example);

    ProductTermInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductTermInfo record, @Param("example") ProductTermInfoExample example);

    int updateByExample(@Param("record") ProductTermInfo record, @Param("example") ProductTermInfoExample example);

    int updateByPrimaryKeySelective(ProductTermInfo record);

    int updateByPrimaryKey(ProductTermInfo record);
}