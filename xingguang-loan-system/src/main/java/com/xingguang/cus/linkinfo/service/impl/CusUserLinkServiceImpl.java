package com.xingguang.cus.linkinfo.service.impl;

import com.xingguang.cus.linkinfo.entity.CusUserLinkEntity;
import com.xingguang.cus.linkinfo.mapper.CusUserLinkMapper;
import com.xingguang.cus.linkinfo.service.ICusUserLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/10/12.
 */
@Service
public class CusUserLinkServiceImpl implements ICusUserLinkService {

    @Autowired
    private CusUserLinkMapper cusUserLinkMapper;

    @Override
    public CusUserLinkEntity findCusUserLinkByUserId(Long cusUserId) throws Exception {
        return cusUserLinkMapper.findCusUserLinkByUserId(cusUserId);
    }
}
