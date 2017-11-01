package com.xingguang.finance.repy.mapper;

import com.xingguang.finance.repy.entity.custom.RepymtApplyEntityCustom;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/1  18:00
 * @Version v1.0.0
 */
public interface RepymtApplyMapper {

    List<RepymtApplyEntityCustom> findNormalRepymtList(String planDate) throws Exception;

}
