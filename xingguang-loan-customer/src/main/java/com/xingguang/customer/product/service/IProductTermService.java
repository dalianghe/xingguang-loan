package com.xingguang.customer.product.service;

import com.xingguang.customer.product.entity.ProductTermInfo;

import java.util.List;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface IProductTermService {

    List<ProductTermInfo> getProductTermListByProductId(List<Long> productIds);

    ProductTermInfo getProductTermById(Long id);

}
