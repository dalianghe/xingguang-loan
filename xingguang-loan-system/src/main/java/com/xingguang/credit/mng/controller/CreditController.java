package com.xingguang.credit.mng.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.credit.mng.domain.CreditDomain;
import com.xingguang.credit.mng.service.ICreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by admin on 2017/10/18.
 */
@RestController
public class CreditController {

    @Autowired
    private ICreditService creditService;

    @RequestMapping(value = "/credit/customeres" , method = RequestMethod.GET)
    public ResultBean<?> findCusUserAll(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        CreditDomain domain = JSON.parseObject(paramJson,CreditDomain.class);
        Map<String , Object> customeres = creditService.findCreditList(domain);
        resultBean = new ResultBean<>(customeres);
        return resultBean;
    }

    @RequestMapping(value = "/credit/lock/{id}" , method = RequestMethod.POST)
    public ResultBean<?> lockCredit(@PathVariable Long id) throws Exception{
        ResultBean<?> resultBean = null;
        creditService.lockCreditByCusId(id);
        resultBean = new ResultBean<>();
        return resultBean;
    }

    @RequestMapping(value = "/credit/unlock/{id}" , method = RequestMethod.POST)
    public ResultBean<?> unLockCredit(@PathVariable Long id) throws Exception{
        ResultBean<?> resultBean = null;
        creditService.unLockCreditByCusId(id);
        resultBean = new ResultBean<>();
        return resultBean;
    }

}
