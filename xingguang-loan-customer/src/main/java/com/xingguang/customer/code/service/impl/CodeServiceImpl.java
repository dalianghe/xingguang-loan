package com.xingguang.customer.code.service.impl;

import com.xingguang.customer.bankcard.entity.CusBankCard;
import com.xingguang.customer.bankcard.entity.CusBankCardExample;
import com.xingguang.customer.code.entity.CodeInfo;
import com.xingguang.customer.code.entity.CodeInfoExample;
import com.xingguang.customer.code.mapper.CodeInfoMapper;
import com.xingguang.customer.code.service.ICodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

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
    public List<CodeInfo> getCodeByTypeIds(CodeInfoExample example) {
        return this.codeInfoMapper.selectByExample(example);
    }

}
