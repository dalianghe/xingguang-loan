package com.xingguang.credit.code.service;

import com.xingguang.credit.code.entity.CodeRefuseEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/15.
 */
public interface ICodeRefuseService {

    List<CodeRefuseEntity> findRefuseCodeByParentId(Long id) throws Exception;

}
