package com.xingguang.customer.wdrl.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.config.JWTParam;
import com.xingguang.customer.credit.entity.CreditInfo;
import com.xingguang.customer.credit.service.ICreditInfoService;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.service.ICusUserInfoService;
import com.xingguang.customer.product.entity.ProductInfo;
import com.xingguang.customer.product.service.IProductService;
import com.xingguang.customer.product.service.IProductTermService;
import com.xingguang.customer.wdrl.entity.WdrlApply;
import com.xingguang.customer.wdrl.service.IWdrlApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class WdrlApplyController {

    @Autowired
    private IWdrlApplyService wdrlApplyService;
    @Autowired
    private IProductService productService;
    @Autowired
    private IProductTermService productTermService;
    @Autowired
    private ICreditInfoService creditInfoService;
    @Autowired
    private ICusUserInfoService userInfoService;

    @RequestMapping(value = "/wdrl/apply",method = RequestMethod.POST)
    public ResultBean<?> createCreditApply(@RequestBody WdrlApply wdrlApply, @JWTParam(key = "userId", required = true) Long userId){
        ResultBean resultBean =  new ResultBean();
        CreditInfo creditInfo = this.creditInfoService.findByCusUserId(userId);
        if(ObjectUtils.isEmpty(creditInfo)){
            resultBean.setBizCode(1);
            return resultBean;
        }
        if(creditInfo.getUnusedAmount().compareTo(wdrlApply.getAmount()) == -1){
            resultBean.setBizCode(2);
            return resultBean;
        }

        CusUserInfo cusUserInfo = this.userInfoService.findById(userId);
        wdrlApply.setCusUserId(userId);
        wdrlApply.setCusUserName(cusUserInfo.getName());
        ProductInfo productInfo = this.productService.getProductById(wdrlApply.getProductId());
        wdrlApply.setServiceCharge(wdrlApply.getAmount().multiply(productInfo.getServiceRate()));
        wdrlApply.setAccMgmtCharge(wdrlApply.getAmount().multiply(productInfo.getAccMgmtRate()));
        wdrlApply.setStatus(1);
        wdrlApply.setCreateTime(new Date());
        this.wdrlApplyService.create(wdrlApply);
        return resultBean;
    }

}
