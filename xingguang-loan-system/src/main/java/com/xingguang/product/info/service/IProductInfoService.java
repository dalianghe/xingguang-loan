package com.xingguang.product.info.service;

import com.xingguang.product.info.entity.custom.ProductInfoEntityCustom;

import java.util.List;

/**
 * Created by admin on 2017/10/21.
 */
public interface IProductInfoService {

    public List<ProductInfoEntityCustom> findProductInfoList() throws Exception;

    public ProductInfoEntityCustom findProductInfoById(Long id) throws Exception;

}
