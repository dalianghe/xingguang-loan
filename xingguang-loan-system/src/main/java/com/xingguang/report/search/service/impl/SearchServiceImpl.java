package com.xingguang.report.search.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xingguang.report.search.domain.SearchUserDomain;
import com.xingguang.report.search.entity.SearchEntity;
import com.xingguang.report.search.mapper.SearchMapper;
import com.xingguang.report.search.service.ISearchService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/26  20:32
 * @Version v1.0.0
 */
@Service
public class SearchServiceImpl implements ISearchService{

    @Autowired
    private SearchMapper searchMapper;

    @Override
    public Map<String, Object> findUsers(SearchUserDomain searchUserDomain) throws Exception {
        SearchEntity entity = new SearchEntity();
        PageHelper.startPage(searchUserDomain.getPager().get("page"), searchUserDomain.getPager().get("pageSize"));
        BeanUtils.copyProperties(searchUserDomain, entity);
        List<SearchEntity> entities = searchMapper.findUsers(entity);
        Map<String,Object> map = new HashMap<>();
        map.put("users" , entities);
        map.put("total" , ((Page) entities).getTotal());
        return map;
    }
}
