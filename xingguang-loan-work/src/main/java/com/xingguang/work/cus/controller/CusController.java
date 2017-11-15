package com.xingguang.work.cus.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.work.cus.entity.CusUserInfoEntity;
import com.xingguang.work.cus.service.ICusUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/10/2.
 */
@RestController
public class CusController {

    @Autowired
    private ICusUserInfoService cusUserInfoService;

    @RequestMapping(value = "/my/customers/{id}" , method = RequestMethod.GET)
    public ResultBean<?> customers(@PathVariable Long id) throws Exception{
        ResultBean<?> resultBean = null;
        List<CusUserInfoEntity> cusList = cusUserInfoService.findCusListByWorkUserId(id);
        resultBean = new ResultBean<>(cusList);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }

}
