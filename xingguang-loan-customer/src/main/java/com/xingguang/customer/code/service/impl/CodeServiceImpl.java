package com.xingguang.customer.code.service.impl;

import com.xingguang.customer.code.entity.CodeInfo;
import com.xingguang.customer.code.entity.CodeInfoExample;
import com.xingguang.customer.code.mapper.CodeInfoMapper;
import com.xingguang.customer.code.service.ICodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class CodeServiceImpl implements ICodeService {

    @Autowired
    private CodeInfoMapper codeInfoMapper;

    @Override
    @Transactional(readOnly = true)
    public List<CodeInfo> getCodeList(CodeInfoExample example) {
        return this.codeInfoMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public Map<Integer, CodeInfo> getCodeMap(CodeInfoExample example) {
        List<CodeInfo> list = this.getCodeList(example);
        return list.stream().collect(Collectors.toMap(CodeInfo::getCode, CodeInfo -> CodeInfo));
    }

}
