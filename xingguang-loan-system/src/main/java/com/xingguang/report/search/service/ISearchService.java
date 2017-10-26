package com.xingguang.report.search.service;

import com.xingguang.report.search.domain.SearchUserDomain;

import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/26  20:28
 * @Version v1.0.0
 */
public interface ISearchService {

    public Map<String , Object> findUsers(SearchUserDomain searchUserDomain) throws Exception;

}
