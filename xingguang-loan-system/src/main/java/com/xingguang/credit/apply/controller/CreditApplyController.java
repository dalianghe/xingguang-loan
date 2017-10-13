package com.xingguang.credit.apply.controller;

import com.xingguang.common.beans.ResultBean;
import com.xingguang.credit.apply.domain.AuditDomain;
import com.xingguang.credit.apply.entity.custom.CreditApplyEntityCustom;
import com.xingguang.credit.apply.service.ICreditApplyService;
import com.xingguang.system.login.domain.AuthUserDomain;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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

    @RequestMapping(value = "/credit/audit" , method = RequestMethod.POST)
    public ResultBean<?> auditCreditApply(@RequestBody AuditDomain domain) throws Exception{
        ResultBean<?> resultBean = null;
        Subject subject = SecurityUtils.getSubject();
        AuthUserDomain loginUser = (AuthUserDomain)subject.getPrincipals().getPrimaryPrincipal();
        domain.setCreditUserId(loginUser.getId());
        domain.setCreditUserName(loginUser.getUserName());
        domain.setCreditTime(new Date());
        creditApplyService.auditCreditApply(domain);
        resultBean = new ResultBean<>();
        return resultBean;
    }
}
