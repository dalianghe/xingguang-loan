package com.xingguang.finance.repy.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.finance.repy.domain.RepyDomain;
import com.xingguang.finance.repy.service.IRepymtApplyService;
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
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/1  18:01
 * @Version v1.0.0
 */
@RestController
public class RepymtController {

    @Autowired
    private IRepymtApplyService repymtApplyService;

    @RequestMapping(value = "/finance/repay/normal" , method = RequestMethod.GET)
    public ResultBean<?> findAuditApplyList(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        RepyDomain domain = JSON.parseObject(paramJson,RepyDomain.class);
        Map<String , Object> users = repymtApplyService.findNormalRepymtList(domain);
        resultBean = new ResultBean<>(users);
        return resultBean;
    }

    @RequestMapping(value = "/finance/repay/normal" , method = RequestMethod.POST)
    public ResultBean<?> repyNormal(@RequestBody RepyDomain domain) throws Exception{
        ResultBean<?> resultBean = null;
        Subject subject = SecurityUtils.getSubject();
        AuthUserDomain loginUser = (AuthUserDomain)subject.getPrincipals().getPrimaryPrincipal();
        domain.setOperatorId(loginUser.getId());
        domain.setOperatorName(loginUser.getUserName());
        domain.setCreateTime(new Date());
        repymtApplyService.repaymentNormal(domain);
        resultBean = new ResultBean<>();
        return resultBean;
    }

}
