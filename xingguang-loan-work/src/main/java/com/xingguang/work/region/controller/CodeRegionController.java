package com.xingguang.work.region.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.work.region.entity.CodeRegionEntity;
import com.xingguang.work.region.service.ICodeRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/10/16.
 */
@RestController
public class CodeRegionController {

    @Autowired
    private ICodeRegionService codeRegionService;

    @RequestMapping(value = "/code/region/{pId}" , method = RequestMethod.GET)
    public ResultBean<?> findRegionProvince(@PathVariable Long pId) throws Exception{
        ResultBean<?> resultBean = null;
        List<CodeRegionEntity> regions = codeRegionService.findRegionList(pId);
        resultBean = new ResultBean<>(regions);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }

}
