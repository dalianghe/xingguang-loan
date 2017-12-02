package com.xingguang.grid.mapper;

import com.xingguang.grid.entity.JxlGridIdcardWithOtherNamesEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  18:01
 * @Version v1.0.0
 */
public interface JxlGridIdcardWithOtherNamesMapper {

    void deleteIdcardWithOtherNamesByBizId(Long bizId) throws Exception;

    void insertIdcardWithOtherNames(List<JxlGridIdcardWithOtherNamesEntity> list) throws Exception;

}
