package com.xingguang.product.info.mapper;

import com.xingguang.product.info.entity.custom.ProductInfoEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/10/21.
 */
public interface ProductInfoMapper {

    List<ProductInfoEntityCustom> findProductInfoList() throws Exception;

    ProductInfoEntityCustom findProductInfoById(Long id) throws Exception;

}
