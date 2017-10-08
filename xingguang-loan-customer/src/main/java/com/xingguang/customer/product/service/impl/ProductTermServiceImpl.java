package com.xingguang.customer.product.service.impl;

import com.xingguang.customer.product.entity.ProductTermInfo;
import com.xingguang.customer.product.entity.ProductTermInfoExample;
import com.xingguang.customer.product.mapper.ProductTermInfoMapper;
import com.xingguang.customer.product.service.IProductTermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class ProductTermServiceImpl implements IProductTermService {

    @Autowired
    private ProductTermInfoMapper productTermInfoMapper;

    @Override
    @Transactional(readOnly = true)
    public List<ProductTermInfo> getProductTermListByProductId(List<Long> productIds){
        ProductTermInfoExample example = new ProductTermInfoExample();
        example.createCriteria().andProductIdIn(productIds);
        example.setOrderByClause("term_number");
        return this.productTermInfoMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public ProductTermInfo getProductTermById(Long id) {
        return this.productTermInfoMapper.selectByPrimaryKey(id);
    }
}
