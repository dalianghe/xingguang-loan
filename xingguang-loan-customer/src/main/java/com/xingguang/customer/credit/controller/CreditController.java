package com.xingguang.customer.credit.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.credit.entity.CreditInfo;
import com.xingguang.customer.credit.service.ICreditApplyService;
import com.xingguang.customer.credit.service.ICreditInfoService;
import com.xingguang.customer.info.entity.CusUserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ResultBean<?> createCreditApply(@RequestBody CusUserInfoEntity userInfo){



//        creditApply.setAmount(null);
//        creditApply.setCreditTime(null);
//        creditApply.setCreditUserId(null);
//        creditApply.setCreditUserName(null);
//        creditApply.setRefuseCode(null);
        CreditApply creditApply = new CreditApply();
        this.creditApplyService.create(creditApply);
        return new ResultBean();
    }

    @RequestMapping(value = "/credit/info/{cusUserId}",method = RequestMethod.GET)
    public ResultBean<?> findCredit(@PathVariable final Long cusUserId){
        CreditInfo creditInfo = this.creditInfoService.findByCusUserId(cusUserId);
        return new ResultBean(creditInfo);
    }

}
