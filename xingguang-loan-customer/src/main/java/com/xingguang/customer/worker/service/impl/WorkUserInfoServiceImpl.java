package com.xingguang.customer.worker.service.impl;

import com.xingguang.customer.worker.entity.WorkUserInfo;
import com.xingguang.customer.worker.mapper.WorkUserInfoMapper;
import com.xingguang.customer.worker.service.IWorkUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class WorkUserInfoServiceImpl implements IWorkUserInfoService {

    @Autowired
    private WorkUserInfoMapper workUserInfoMapper;

    @Override
    @Transactional(readOnly = true)
    public WorkUserInfo getWorkUserInfoById(Long workUserId) {
        return this.workUserInfoMapper.selectByPrimaryKey(workUserId);
    }

}
