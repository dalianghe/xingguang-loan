package com.xingguang.customer.credit.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.config.JWTParam;
import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.credit.entity.CreditInfo;
import com.xingguang.customer.credit.params.CreditApplyParam;
import com.xingguang.customer.credit.service.ICreditApplyService;
import com.xingguang.customer.credit.service.ICreditInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class CreditController {

    @Autowired
    private ICreditApplyService creditApplyService;
    @Autowired
    private ICreditInfoService creditInfoService;

    @RequestMapping(value = "/credit/apply",method = RequestMethod.POST)
    public ResultBean<?> createCreditApply(@RequestBody Long appId, @JWTParam(key = "userId", required = true) Long userId){
        CreditApply creditApply = new CreditApply();
        creditApply.setCusUserId(userId);
        creditApply.setCreateTime(new Date());
        this.creditApplyService.create(creditApply, appId);
        return new ResultBean();
    }

    @RequestMapping(value = "/credit/info",method = RequestMethod.GET)
    public ResultBean<?> findCredit(@JWTParam(key = "userId", required = true) Long cusUserId){
        CreditInfo creditInfo = this.creditInfoService.findByCusUserId(cusUserId);
        return new ResultBean(creditInfo);
    }

}
