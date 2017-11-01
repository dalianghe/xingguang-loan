package com.xingguang.finance.repy.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.finance.repy.domain.RepyDomain;
import com.xingguang.finance.repy.service.IRepymtApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/finance/repy/normal" , method = RequestMethod.GET)
    public ResultBean<?> findAuditApplyList(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        RepyDomain domain = JSON.parseObject(paramJson,RepyDomain.class);
        Map<String , Object> users = repymtApplyService.findNormalRepymtList(domain);
        resultBean = new ResultBean<>(users);
        return resultBean;
    }
}
