package com.xingguang.finance.wdrl.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.finance.wdrl.domain.WdrlDomain;
import com.xingguang.finance.wdrl.service.IWdrlApplyService;
import com.xingguang.system.login.domain.AuthUserDomain;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * Created by admin on 2017/10/15.
 */
@RestController
public class WdrlController {

    @Autowired
    private IWdrlApplyService wdrlApplyService;

    @RequestMapping(value = "/finance/wdrl/applies" , method = RequestMethod.GET)
    public ResultBean<?> findCreditDoneUsers(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        WdrlDomain domain = JSON.parseObject(paramJson,WdrlDomain.class);
        Map<String , Object> applies = wdrlApplyService.findWdrlApplyList(domain);
        resultBean = new ResultBean<>(applies);
        return resultBean;
    }

    @RequestMapping(value = "/finance/wdrl/pay" , method = RequestMethod.POST)
    public ResultBean<?> pay(@RequestBody WdrlDomain domain) throws Exception{
        ResultBean<?> resultBean = null;
        Subject subject = SecurityUtils.getSubject();
        AuthUserDomain loginUser = (AuthUserDomain)subject.getPrincipals().getPrimaryPrincipal();
        domain.setOperatorId(loginUser.getId());
        domain.setOperatorName(loginUser.getUserName());
        domain.setIssueTime(new Date());
        wdrlApplyService.paypal(domain);
        resultBean = new ResultBean<>();
        return resultBean;
    }

    @RequestMapping(value = "/finance/wdrl/stop" , method = RequestMethod.POST)
    public ResultBean<?> stopPay(@RequestBody WdrlDomain domain) throws Exception{
        ResultBean<?> resultBean = null;
        Subject subject = SecurityUtils.getSubject();
        AuthUserDomain loginUser = (AuthUserDomain)subject.getPrincipals().getPrimaryPrincipal();
        domain.setOperatorId(loginUser.getId());
        domain.setOperatorName(loginUser.getUserName());
        domain.setIssueTime(new Date());
        wdrlApplyService.stopPaypal(domain);
        resultBean = new ResultBean<>();
        resultBean.setBizCode(0);
        return resultBean;
    }

}
