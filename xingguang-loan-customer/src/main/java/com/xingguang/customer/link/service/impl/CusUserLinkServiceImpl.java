package com.xingguang.customer.link.service.impl;

import com.xingguang.customer.link.entity.CusUserLink;
import com.xingguang.customer.link.entity.CusUserLinkExample;
import com.xingguang.customer.link.mapper.CusUserLinkMapper;
import com.xingguang.customer.link.service.ICusUserLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class CusUserLinkServiceImpl implements ICusUserLinkService {

    @Autowired
    private CusUserLinkMapper cusUserLinkMapper;

    @Override
    public void create(CusUserLink cusUserLink) {
        this.cusUserLinkMapper.insertSelective(cusUserLink);
    }

    @Override
    public void delete(CusUserLinkExample example) {
        this.cusUserLinkMapper.deleteByExample(example);
    }

    @Override
    public CusUserLink findByCusUserId(Long cusUserId) {
        CusUserLinkExample example = new CusUserLinkExample();
        example.createCriteria().andCusUserIdEqualTo(cusUserId);
        example.setLimit(1);
        List<CusUserLink> list = this.cusUserLinkMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(list)){
            return null;
        }
        return list.get(0);
    }
}
