package com.xingguang.product.info.service;

import com.xingguang.product.info.entity.custom.ProductInfoEntityCustom;

/**
 * Created by admin on 2017/10/21.
 */
public interface IProductInfoService {

    public ProductInfoEntityCustom findProductInfoById(Long id) throws Exception;

}
