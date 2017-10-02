package com.xingguang.work.info.service.impl;

import com.xingguang.work.info.entity.WorkUserInfoEntity;
import com.xingguang.work.info.mapper.WorkUserInfoMapper;
import com.xingguang.work.info.params.InfoBean;
import com.xingguang.work.info.service.IWorkUserInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by admin on 2017/10/1.
 */
@Service
public class WorkUserInfoServiceImpl implements IWorkUserInfoService {

    @Autowired
    private WorkUserInfoMapper workUserInfoMapper;

    @Override
    @Transactional
    public WorkUserInfoEntity addWorkUserInfo(InfoBean infoBean) throws Exception {
        WorkUserInfoEntity  entity = new WorkUserInfoEntity();
        entity.setPhone(infoBean.getPhone());
        entity.setCreateTime(new Date());
        workUserInfoMapper.insertWorkUserInfo(entity);
        return entity;
    }

    @Override
    public WorkUserInfoEntity updateWorkUserInfo(InfoBean infoBean) throws Exception {
        WorkUserInfoEntity  entity = new WorkUserInfoEntity();
        BeanUtils.copyProperties(infoBean,entity);
        workUserInfoMapper.updateWorkUserInfo(entity);
        return entity;
    }
}