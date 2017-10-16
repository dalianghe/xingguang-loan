package com.xingguang.customer.bankcard.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.config.JWTParam;
import com.xingguang.customer.bank.entity.CusBank;
import com.xingguang.customer.bank.service.ICusBankService;
import com.xingguang.customer.bankcard.entity.CusBankCard;
import com.xingguang.customer.bankcard.entity.CusBankCardExample;
import com.xingguang.customer.bankcard.entity.CusBankCardForList;
import com.xingguang.customer.bankcard.service.IBankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class BankCardController {

    @Autowired
    private IBankCardService bankCardService;
    @Autowired
    private ICusBankService cusBankService;

    @RequestMapping(value = "/bank/cards",method = RequestMethod.POST)
    public ResultBean<?> create(@RequestBody CusBankCard cusBankCard, @JWTParam(key = "userId", required = true) Long userId){
        ResultBean resultBean =  new ResultBean();
        CusBankCardExample example = new CusBankCardExample();
        example.createCriteria().andCardNoEqualTo(cusBankCard.getCardNo());
        Long count = this.bankCardService.countByExample(example);
        if(count == 0){
            cusBankCard.setCusUserId(userId);
            CusBank cusBank = this.cusBankService.findByKey(cusBankCard.getBankId());
            cusBankCard.setBankName(cusBank.getName());
            cusBankCard.setCreateTime(new Date());
            this.bankCardService.create(cusBankCard);
        }else{
            resultBean.setBizCode(1);
        }
        return resultBean;
    }

    @RequestMapping(value = "/bank/cards/{id}",method = RequestMethod.PATCH)
    public ResultBean<?> update(@RequestBody CusBankCard cusBankCard, @PathVariable Long id,
                                @JWTParam(key = "userId", required = true) Long userId){
        ResultBean resultBean =  new ResultBean();
        this.bankCardService.update(id, userId, cusBankCard);
        return resultBean;
    }

    @RequestMapping(value = "/bank/cards/{id}",method = RequestMethod.DELETE)
    public ResultBean<?> delete(@PathVariable Long id, @JWTParam(key = "userId", required = true) Long userId){
        ResultBean resultBean =  new ResultBean();
        CusBankCard cusBankCard = new CusBankCard();
        cusBankCard.setStatus(2);
        this.bankCardService.update(id, userId, cusBankCard);
        return resultBean;
    }

    @RequestMapping(value = "/bank/cards/{id}",method = RequestMethod.GET)
    public ResultBean<?> getBankCardById(@PathVariable Long id, @JWTParam(key = "userId", required = true) Long userId){
        ResultBean resultBean =  new ResultBean();
        resultBean.setData(this.bankCardService.getBankCardById(id, userId));
        return resultBean;
    }

    @RequestMapping(value = "/bank/cards",method = RequestMethod.GET)
    public ResultBean<?> getBankCardList(@JWTParam(key = "userId", required = true) Long userId){
        ResultBean resultBean =  new ResultBean<>();
        CusBankCardExample example = new CusBankCardExample();
        CusBankCardExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        criteria.andCusUserIdEqualTo(userId);
        example.setOrderByClause("create_time desc");
        List<CusBankCard> cusBankCardList = this.bankCardService.getBankCardList(example);
        Map<Long, CusBank> cusBankMap = this.cusBankService.findAllToMap();
        List<CusBankCardForList> newList = new ArrayList<>();
        cusBankCardList.stream().forEach(cusBankCard -> {
            CusBank cusBank = cusBankMap.get(cusBankCard.getBankId());
            CusBankCardForList cusBankCardForList = new CusBankCardForList(cusBankCard, cusBank);
            newList.add(cusBankCardForList);
        });
        resultBean.setData(newList);
        return resultBean;
    }

}
