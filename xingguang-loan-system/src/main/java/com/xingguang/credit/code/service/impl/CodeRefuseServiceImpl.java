package com.xingguang.credit.code.service.impl;

import com.xingguang.credit.code.entity.CodeRefuseEntity;
import com.xingguang.credit.code.mapper.CodeRefuseMapper;
import com.xingguang.credit.code.service.ICodeRefuseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/10/15.
 */
@Service
public class CodeRefuseServiceImpl implements ICodeRefuseService {

    @Autowired
    private CodeRefuseMapper codeRefuseMapper;

    @Override
    public List<CodeRefuseEntity> findRefuseCodeByParentId(Long id) throws Exception {
        return codeRefuseMapper.findRefuseCodeByParentId(id);
    }
}
