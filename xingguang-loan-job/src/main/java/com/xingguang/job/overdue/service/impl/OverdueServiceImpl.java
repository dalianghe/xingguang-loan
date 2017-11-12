package com.xingguang.job.overdue.service.impl;

import com.xingguang.job.overdue.mapper.OverdueMapper;
import com.xingguang.job.overdue.service.IOverdueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/11/12.
 */
@Service
public class OverdueServiceImpl implements IOverdueService {

    @Autowired
    private OverdueMapper overdueMapper;

    @Override
    public void updateOverdueInfo() throws Exception {
        overdueMapper.updateOverdueInfo();
    }
}
