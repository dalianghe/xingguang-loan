package com.xingguang.credit.code.mapper;

import com.xingguang.credit.code.entity.CodeRefuseEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/15.
 */
public interface CodeRefuseMapper {

    List<CodeRefuseEntity> findRefuseCodeByParentId(Long id) throws Exception;

}
