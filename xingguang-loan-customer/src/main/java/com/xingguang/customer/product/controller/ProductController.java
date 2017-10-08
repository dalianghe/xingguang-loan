package com.xingguang.customer.product.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.customer.product.entity.ProductInfo;
import com.xingguang.customer.product.entity.ProductTermInfo;
import com.xingguang.customer.product.service.IProductService;
import com.xingguang.customer.product.service.IProductTermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class ProductController {

    @Autowired
    private IProductService productService;
    @Autowired
    private IProductTermService productTermService;

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public ResultBean<?> findProducts() {

        List<ProductInfo> productInfoList = this.productService.getProductList();
        if(!CollectionUtils.isEmpty(productInfoList)){
            List<Long> productIds = productInfoList.stream().map(productInfo -> productInfo.getId()).collect(Collectors.toList());
            List<ProductTermInfo> productTermList = productTermService.getProductTermListByProductId(productIds);
            productTermList.forEach(productTermInfo -> productInfoList.forEach(productInfo -> {
                if (productTermInfo.getProductId().equals(productInfo.getId())) {
                    productInfo.getProductTermInfoList().add(productTermInfo);
                }
            }));
        }
        return new ResultBean(productInfoList);
    }

}
