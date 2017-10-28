package com.xingguang.product.term.controller;

import com.xingguang.common.beans.ResultBean;
import com.xingguang.product.term.entity.ProductTermInfoEntity;
import com.xingguang.product.term.service.IProductTermInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/10/28.
 */
@RestController
public class ProductTermController {

    @Autowired
    private IProductTermInfoService productTermInfoService;

    @RequestMapping(value = "/product/terms/{productId}")
    public ResultBean<?> findTermByProductId(@PathVariable Long productId) throws Exception{
        ResultBean<?> resultBean = null;
        List<ProductTermInfoEntity> terms = productTermInfoService.findTermByProductId(productId);
        resultBean = new ResultBean<>(terms);
        return resultBean;
    }
}
