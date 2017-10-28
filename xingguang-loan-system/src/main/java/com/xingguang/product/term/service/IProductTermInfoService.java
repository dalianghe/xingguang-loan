package com.xingguang.product.term.service;

import com.xingguang.product.term.entity.ProductTermInfoEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/28.
 */
public interface IProductTermInfoService {

    public List<ProductTermInfoEntity> findTermByProductId(Long productId) throws Exception;

}
