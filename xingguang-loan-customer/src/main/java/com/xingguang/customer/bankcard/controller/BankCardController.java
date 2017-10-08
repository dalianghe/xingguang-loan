package com.xingguang.customer.bankcard.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.customer.bankcard.entity.CusBankCard;
import com.xingguang.customer.bankcard.entity.CusBankCardExample;
import com.xingguang.customer.bankcard.service.IBankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class BankCardController {

    @Autowired
    private IBankCardService bankCardService;

    @RequestMapping(value = "/bank/cards",method = RequestMethod.POST)
    public ResultBean<?> create(@RequestBody CusBankCard cusBankCard){
        ResultBean resultBean =  new ResultBean();
        this.bankCardService.create(cusBankCard);
        return resultBean;
    }


    @RequestMapping(value = "/bank/cards",method = RequestMethod.PATCH)
    public ResultBean<?> update(@RequestBody CusBankCard cusBankCard){
        ResultBean resultBean =  new ResultBean();
        this.bankCardService.update(cusBankCard);
        return resultBean;
    }

    @RequestMapping(value = "/bank/cards/{id}",method = RequestMethod.DELETE)
    public ResultBean<?> delete(@PathVariable Long id){
        ResultBean resultBean =  new ResultBean();
        CusBankCard cusBankCard = new CusBankCard();
        cusBankCard.setId(id);
        cusBankCard.setStatus(2);
        this.bankCardService.update(cusBankCard);
        return resultBean;
    }

    @RequestMapping(value = "/bank/cards/{id}",method = RequestMethod.GET)
    public ResultBean<?> getBankCardById(@PathVariable Long id){
        ResultBean resultBean =  new ResultBean();
        resultBean.setData(this.bankCardService.getBankCardById(id));
        return resultBean;
    }

    @RequestMapping(value = "/bank/cards",method = RequestMethod.GET)
    public ResultBean<?> getBankCardList(){
        Long userId = 1L;
        ResultBean resultBean =  new ResultBean<>();
        CusBankCardExample example = new CusBankCardExample();
        CusBankCardExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        criteria.andCusUserIdEqualTo(userId);
        example.setOrderByClause("create_time desc");
        List<CusBankCard> cusBankCardList = this.bankCardService.getBankCardList(example);
        resultBean.setData(cusBankCardList);
        return resultBean;
    }

}
