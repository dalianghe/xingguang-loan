package com.xingguang.product.info.service.impl;

import com.xingguang.product.info.entity.custom.ProductInfoEntityCustom;
import com.xingguang.product.info.mapper.ProductInfoMapper;
import com.xingguang.product.info.service.IProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/10/21.
 */
@Service
public class ProductInfoServiceImpl implements IProductInfoService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfoEntityCustom> findProductInfoList() throws Exception {
        return productInfoMapper.findProductInfoList();
    }

    @Override
    public ProductInfoEntityCustom findProductInfoById(Long id) throws Exception {
        return productInfoMapper.findProductInfoById(id);
    }
}
