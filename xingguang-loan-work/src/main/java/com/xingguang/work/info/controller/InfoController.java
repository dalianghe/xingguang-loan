package com.xingguang.work.info.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.work.info.entity.WorkUserInfoEntity;
import com.xingguang.work.info.params.InfoBean;
import com.xingguang.work.info.service.IWorkUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/10/2.
 */
@RestController
public class InfoController {

    @Autowired
    private IWorkUserInfoService workUserInfoService;

    @RequestMapping(value = "/info/user" , method = RequestMethod.POST)
    public ResultBean<?> update(@RequestBody InfoBean infoBean) throws Exception{
        ResultBean<?> resultBean = null;
        WorkUserInfoEntity entity = workUserInfoService.updateWorkUserInfo(infoBean);
        resultBean = new ResultBean<>(entity);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }
}
