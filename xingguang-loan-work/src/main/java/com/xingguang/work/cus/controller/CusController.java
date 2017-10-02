package com.xingguang.work.cus.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.work.cus.entity.CusUserInfoEntity;
import com.xingguang.work.cus.service.ICusUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by admin on 2017/10/2.
 */
@RestController
@RequestMapping("/cus")
public class CusController {

    @Autowired
    private ICusUserInfoService cusUserInfoService;

    @RequestMapping(value = "/customers" , method = RequestMethod.POST)
    public ResultBean<?> customers(String paramJson) throws Exception{
        ResultBean<?> resultBean = null;
        int workUserId = 8;
        List<CusUserInfoEntity> cusList = cusUserInfoService.findCusListByWorkUserId(workUserId);
        resultBean = new ResultBean<>(cusList);
        return resultBean;
    }

}
