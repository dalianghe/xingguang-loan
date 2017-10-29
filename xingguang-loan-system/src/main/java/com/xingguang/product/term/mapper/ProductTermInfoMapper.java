package com.xingguang.product.term.mapper;

import com.xingguang.product.term.entity.ProductTermInfoEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/28.
 */
public interface ProductTermInfoMapper {

    List<ProductTermInfoEntity> findTermByProductId(Long productId) throws Exception;

    ProductTermInfoEntity findTermById(Long id) throws Exception;
}
