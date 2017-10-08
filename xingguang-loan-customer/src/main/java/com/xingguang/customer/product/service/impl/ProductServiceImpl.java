package com.xingguang.customer.product.service.impl;

import com.xingguang.customer.product.entity.ProductInfo;
import com.xingguang.customer.product.entity.ProductInfoExample;
import com.xingguang.customer.product.mapper.ProductInfoMapper;
import com.xingguang.customer.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    @Transactional(readOnly = true)
    public List<ProductInfo> getProductList(){
        ProductInfoExample example = new ProductInfoExample();
        ProductInfoExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(2);
        example.setOrderByClause("up_time desc");
        return this.productInfoMapper.selectByExample(example);
    }

    @Override
    public ProductInfo getProductById(Long id) {
        return this.productInfoMapper.selectByPrimaryKey(id);
    }
}
