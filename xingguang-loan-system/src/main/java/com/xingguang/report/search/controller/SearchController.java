package com.xingguang.report.search.controller;

import com.alibaba.fastjson.JSON;
import com.xingguang.common.beans.ResultBean;
import com.xingguang.report.search.domain.SearchUserDomain;
import com.xingguang.report.search.service.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/26  20:36
 * @Version v1.0.0
 */
@RestController
public class SearchController {

    @Autowired
    private ISearchService searchService;

    @RequestMapping(value = "/search/users" , method = RequestMethod.GET)
    public ResultBean<?> findCusUserAll(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        SearchUserDomain domain = JSON.parseObject(paramJson,SearchUserDomain.class);
        Map<String , Object> users = searchService.findUsers(domain);
        resultBean = new ResultBean<>(users);
        return resultBean;
    }

}
