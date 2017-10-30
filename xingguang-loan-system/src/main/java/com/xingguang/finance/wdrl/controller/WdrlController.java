package com.xingguang.finance.wdrl.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.finance.wdrl.domain.WdrlDomain;
import com.xingguang.finance.wdrl.entity.custom.ApplyAndPlanEntityCustom;
import com.xingguang.finance.wdrl.entity.custom.WdrlApplyEntityCustom;
import com.xingguang.finance.wdrl.service.IWdrlApplyService;
import com.xingguang.system.login.domain.AuthUserDomain;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/10/15.
 */
@RestController
public class WdrlController {

    @Autowired
    private IWdrlApplyService wdrlApplyService;

    @RequestMapping(value = "/finance/audit/applies" , method = RequestMethod.GET)
    public ResultBean<?> findAuditApplyList(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        WdrlDomain domain = JSON.parseObject(paramJson,WdrlDomain.class);
        Map<String , Object> applies = wdrlApplyService.findAuditApplyList(domain);
        resultBean = new ResultBean<>(applies);
        return resultBean;
    }

    @RequestMapping(value = "/finance/wdrl/user/{userId}" , method = RequestMethod.GET)
    public ResultBean<?> findWdrlApplyByCusId(@PathVariable Long userId) throws Exception{
        ResultBean<?> resultBean = null;
        List<WdrlApplyEntityCustom> list = wdrlApplyService.findWdrlApplyByCusId(userId);
        resultBean = new ResultBean<>(list);
        return resultBean;
    }

    @RequestMapping(value = "/finance/audit" , method = RequestMethod.POST)
    public ResultBean<?> audit(@RequestBody WdrlDomain domain) throws Exception{
        ResultBean<?> resultBean = null;
        Subject subject = SecurityUtils.getSubject();
        AuthUserDomain loginUser = (AuthUserDomain)subject.getPrincipals().getPrimaryPrincipal();
        domain.setAuditorId(loginUser.getId());
        domain.setAuditorName(loginUser.getUserName());
        domain.setAuditorTime(new Date());
        wdrlApplyService.updateWdrlApply(domain);
        resultBean = new ResultBean<>();
        return resultBean;
    }

    @RequestMapping(value = "/finance/pay/applies" , method = RequestMethod.GET)
    public ResultBean<?> findPayApplyList(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        WdrlDomain domain = JSON.parseObject(paramJson,WdrlDomain.class);
        Map<String , Object> applies = wdrlApplyService.findPayApplyList(domain);
        resultBean = new ResultBean<>(applies);
        return resultBean;
    }

    @RequestMapping(value = "/finance/done/applies" , method = RequestMethod.GET)
    public ResultBean<?> findPayDoneList(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        WdrlDomain domain = JSON.parseObject(paramJson,WdrlDomain.class);
        Map<String , Object> applies = wdrlApplyService.findPayDoneList(domain);
        resultBean = new ResultBean<>(applies);
        return resultBean;
    }

    @RequestMapping(value = "/finance/pay/view/{id}")
    public ResultBean<?> viewPlan(@PathVariable Long id) throws Exception{
        ResultBean<?> resultBean = null;
        ApplyAndPlanEntityCustom entity = wdrlApplyService.viewPlanAndCharge(id);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }

    @RequestMapping(value = "/finance/pay/pay" , method = RequestMethod.POST)
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

    @RequestMapping(value = "/finance/pay/stop" , method = RequestMethod.POST)
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
