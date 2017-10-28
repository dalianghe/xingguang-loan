package com.xingguang.product.term.service.impl;

import com.xingguang.product.term.entity.ProductTermInfoEntity;
import com.xingguang.product.term.mapper.ProductTermInfoMapper;
import com.xingguang.product.term.service.IProductTermInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/10/28.
 */
@Service
public class ProductTermInfoServiceImpl implements IProductTermInfoService {

    @Autowired
    private ProductTermInfoMapper productTermInfoMapper;

    @Override
    public List<ProductTermInfoEntity> findTermByProductId(Long productId) throws Exception {
        return productTermInfoMapper.findTermByProductId(productId);
    }
}
