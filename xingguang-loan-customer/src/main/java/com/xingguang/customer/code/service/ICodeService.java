package com.xingguang.customer.code.service;

import com.xingguang.customer.code.entity.CodeInfo;
import com.xingguang.customer.code.entity.CodeInfoExample;

import java.util.List;
import java.util.Map;

/**
 * Created by zongxu on 2017/10/1.
 */
public interface ICodeService {

    List<CodeInfo> getCodeList(CodeInfoExample example);
    Map<Integer, CodeInfo> getCodeMap(CodeInfoExample example);

}
