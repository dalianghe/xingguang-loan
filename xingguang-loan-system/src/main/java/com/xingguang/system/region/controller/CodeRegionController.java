package com.xingguang.system.region.controller;

import com.xingguang.common.beans.ResultBean;
import com.xingguang.system.region.entity.CodeRegionEntity;
import com.xingguang.system.region.service.ICodeRegionService;
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
        return resultBean;
    }

}
