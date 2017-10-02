package com.xingguang.work.cus.service.impl;

import com.xingguang.work.cus.entity.CusUserInfoEntity;
import com.xingguang.work.cus.mapper.CusUserInfoMapper;
import com.xingguang.work.cus.service.ICusUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by admin on 2017/10/2.
 */
@Service
public class CusUserInfoServiceImpl implements ICusUserInfoService {

    @Autowired
    private CusUserInfoMapper cusUserInfoMapper;

    @Override
    public List<CusUserInfoEntity> findCusListByWorkUserId(Long workUserId) throws Exception {
        return cusUserInfoMapper.findCusListByWorkUserId(workUserId);
    }
}
