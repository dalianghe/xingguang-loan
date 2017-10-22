package com.xingguang.product.info.mapper;

import com.xingguang.product.info.entity.custom.ProductInfoEntityCustom;

/**
 * Created by admin on 2017/10/21.
 */
public interface ProductInfoMapper {

    ProductInfoEntityCustom findProductInfoById(Long id) throws Exception;

}
