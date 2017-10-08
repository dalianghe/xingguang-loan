package com.xingguang.customer.product.service;

import com.xingguang.customer.product.entity.ProductInfo;

import java.util.List;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface IProductService {

    List<ProductInfo> getProductList();

    ProductInfo getProductById(Long id);

}
