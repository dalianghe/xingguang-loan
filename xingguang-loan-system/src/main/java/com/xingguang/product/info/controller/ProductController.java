package com.xingguang.product.info.controller;

import com.xingguang.common.beans.ResultBean;
import com.xingguang.product.info.entity.custom.ProductInfoEntityCustom;
import com.xingguang.product.info.service.IProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/10/28.
 */
@RestController
public class ProductController {

    @Autowired
    private IProductInfoService productInfoService;

    @RequestMapping(value = "/product/list" , method = RequestMethod.GET)
    public ResultBean<?> findProductList() throws Exception{
        ResultBean resultBean = null;
        List<ProductInfoEntityCustom> list = productInfoService.findProductInfoList();
        resultBean = new ResultBean(list);
        return resultBean;
    }

}
