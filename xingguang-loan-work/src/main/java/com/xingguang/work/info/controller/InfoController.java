package com.xingguang.work.info.controller;

import com.xingguang.beans.ResultBean;
import com.xingguang.work.info.entity.WorkUserInfoEntity;
import com.xingguang.work.info.params.InfoBean;
import com.xingguang.work.info.service.IWorkUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/info/user/{id}" , method = RequestMethod.GET)
    public ResultBean<?> getUserById(@PathVariable Long id) throws Exception{
        ResultBean<?> resultBean = null;
        WorkUserInfoEntity entity = workUserInfoService.selectWorkInfoById(id);
        resultBean = new ResultBean<>(entity);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }

    @RequestMapping(value = "/info/workuser/{openId}" , method = RequestMethod.GET)
    public ResultBean<?> getUserByOpenId(@PathVariable String openId) throws Exception{
        ResultBean<?> resultBean = null;
        WorkUserInfoEntity entity = workUserInfoService.selectWorkInfoByOpenId(openId);
        resultBean = new ResultBean<>(entity);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }

    @RequestMapping(value = "/info/myowner/{ownerId}" , method = RequestMethod.GET)
    public ResultBean<?> getUserByOwnerId(@PathVariable Long ownerId) throws Exception{
        ResultBean<?> resultBean = null;
        List<WorkUserInfoEntity> list = workUserInfoService.selectWorkInfoByOwnerId(ownerId);
        resultBean = new ResultBean<>(list);
        resultBean.setBizCode(ResultBean.SUCCESS);
        return resultBean;
    }

}
