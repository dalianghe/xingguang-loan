package com.xingguang.customer.code.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.customer.code.entity.CodeInfo;
import com.xingguang.customer.code.entity.CodeInfoExample;
import com.xingguang.customer.code.service.ICodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by 宗旭 on 2017/10/01.
 */
@RestController
public class CodeController {

    @Autowired
    private ICodeService codeService;


    @RequestMapping(value = "/codes",method = RequestMethod.GET)
    public ResultBean<?> getCodeByTypeIds(@RequestParam(required = true) List typeIds){
        ResultBean resultBean =  new ResultBean();
        if(CollectionUtils.isEmpty(typeIds)){
            return resultBean;
        }
        CodeInfoExample example = new CodeInfoExample();
        example.setOrderByClause("type_id, sort");
        example.createCriteria().andTypeIdIn(typeIds);
        List<CodeInfo> list = this.codeService.getCodeByTypeIds(example);
        Map<String, List<CodeInfo>> map = list.stream().collect(Collectors.groupingBy(CodeInfo::getTypeIdToString));
        resultBean.setData(map);
        return resultBean;
    }


}
