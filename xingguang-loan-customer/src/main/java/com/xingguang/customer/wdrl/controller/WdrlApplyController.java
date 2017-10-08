package com.xingguang.customer.wdrl.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.customer.credit.entity.CreditInfo;
import com.xingguang.customer.credit.service.ICreditInfoService;
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

    @RequestMapping(value = "/wdrl/apply",method = RequestMethod.POST)
    public ResultBean<?> createCreditApply(@RequestBody WdrlApply wdrlApply){
        ResultBean resultBean =  new ResultBean();
        Long userId = 1L;
        CreditInfo creditInfo = this.creditInfoService.findByCusUserId(userId);
        if(ObjectUtils.isEmpty(creditInfo)){
            resultBean.setBizCode(1);
            return resultBean;
        }
        if(creditInfo.getUnusedAmount().compareTo(wdrlApply.getAmount()) == -1){
            resultBean.setBizCode(2);
            return resultBean;
        }
        ProductInfo productInfo = this.productService.getProductById(wdrlApply.getProductId());
        wdrlApply.setServiceCharge(wdrlApply.getAmount().multiply(productInfo.getServiceRate()));
        wdrlApply.setAccMgmtCharge(wdrlApply.getAmount().multiply(productInfo.getAccMgmtRate()));
        wdrlApply.setCusUserId(userId);
        wdrlApply.setStatus(1);
        wdrlApply.setCreateTime(new Date());
        wdrlApply.setOperatorId(null);
        wdrlApply.setOperatorName(null);
        wdrlApply.setIssueTime(null);
        this.wdrlApplyService.create(wdrlApply);
        return resultBean;
    }

}
