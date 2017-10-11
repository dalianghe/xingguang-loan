package com.xingguang.cus.linkinfo.controller;

import com.xingguang.common.beans.ResultBean;
import com.xingguang.cus.linkinfo.entity.CusUserLinkEntity;
import com.xingguang.cus.linkinfo.service.ICusUserLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/10/12.
 */
@RestController
public class CusUserLinkController {

    @Autowired
    private ICusUserLinkService cusUserLinkService;

    @RequestMapping(value = "/cus/link/{userId}" , method = RequestMethod.GET)
    public ResultBean<?> findWorkUserAll(@PathVariable Long userId) throws Exception{
        ResultBean<?> resultBean = null;
        CusUserLinkEntity entity = cusUserLinkService.findCusUserLinkByUserId(userId);
        resultBean = new ResultBean<>(entity);
        return resultBean;
    }
}
