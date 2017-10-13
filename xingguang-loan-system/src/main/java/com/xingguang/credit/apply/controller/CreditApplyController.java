package com.xingguang.credit.apply.controller;

import com.xingguang.common.beans.ResultBean;
import com.xingguang.credit.apply.entity.custom.CreditApplyEntityCustom;
import com.xingguang.credit.apply.service.ICreditApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/10/12.
 */
@RestController
public class CreditApplyController {

    @Autowired
    private ICreditApplyService creditApplyService;

    @RequestMapping(value = "/credit/apply/{id}" , method = RequestMethod.GET)
    public ResultBean<?> findCreditApplyById(@PathVariable Long id) throws Exception{
        ResultBean<?> resultBean = null;
        CreditApplyEntityCustom entity = creditApplyService.findCreditApplyById(id);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }
}
