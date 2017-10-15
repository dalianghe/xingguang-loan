package com.xingguang.credit.code.controller;

import com.xingguang.common.beans.ResultBean;
import com.xingguang.credit.code.entity.CodeRefuseEntity;
import com.xingguang.credit.code.service.ICodeRefuseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/10/15.
 */
@RestController
public class RefuseController {

    @Autowired
    private ICodeRefuseService codeRefuseService;

    @RequestMapping(value = "/code/refuse" , method = RequestMethod.GET)
    public ResultBean<?> findCodeRefuseByParentId(Long id) throws Exception{
        ResultBean<?> resultBean = null;
        List<CodeRefuseEntity> refuses  = codeRefuseService.findRefuseCodeByParentId(id);
        resultBean = new ResultBean<>(refuses);
        return resultBean;
    }
}
