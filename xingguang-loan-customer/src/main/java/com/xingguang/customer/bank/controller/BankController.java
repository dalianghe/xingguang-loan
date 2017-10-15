package com.xingguang.customer.bank.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.customer.bank.entity.CusBank;
import com.xingguang.customer.bank.service.ICusBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class BankController {

    @Autowired
    private ICusBankService cusBankService;

    @RequestMapping(value = "/banks",method = RequestMethod.GET)
    public ResultBean<?> banks(){
        List<CusBank> cusBankList = this.cusBankService.findAvail();
        return new ResultBean(cusBankList);
    }

}
