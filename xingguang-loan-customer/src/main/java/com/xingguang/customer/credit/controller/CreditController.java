package com.xingguang.customer.credit.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.config.JWTParam;
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
    public ResultBean<?> createCreditApply(@RequestBody CreditApplyParam creditApplyParam,
                                           @JWTParam(key = "userId", required = true) Long userId){

        creditApplyParam.getCreditApply().setCusUserId(userId);
        creditApplyParam.getCreditApply().setStatus(1);
        final Date now = new Date();
        creditApplyParam.getCreditApply().setCreateTime(now);

        creditApplyParam.getCusUserInfo().setId(userId);

        creditApplyParam.getCusUserLink().setCusUserId(userId);
        creditApplyParam.getCusUserLink().setCreateTime(now);

        this.creditApplyService.create(creditApplyParam);
        return new ResultBean();
    }

    @RequestMapping(value = "/credit/info/{cusUserId}",method = RequestMethod.GET)
    public ResultBean<?> findCredit(@PathVariable final Long cusUserId){
        CreditInfo creditInfo = this.creditInfoService.findByCusUserId(cusUserId);
        return new ResultBean(creditInfo);
    }

}
