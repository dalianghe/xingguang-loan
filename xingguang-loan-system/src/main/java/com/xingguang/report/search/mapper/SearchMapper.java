package com.xingguang.report.search.mapper;

import com.xingguang.report.search.entity.SearchEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/26  20:15
 * @Version v1.0.0
 */
public interface SearchMapper {

    List<SearchEntity> findUsers(SearchEntity entity) throws Exception;

}
