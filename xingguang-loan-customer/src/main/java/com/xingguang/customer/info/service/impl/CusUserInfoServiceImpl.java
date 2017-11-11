package com.xingguang.customer.info.service.impl;

import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.entity.CusUserInfoExample;
import com.xingguang.customer.info.mapper.CusUserInfoMapper;
import com.xingguang.customer.info.params.UserInfoParam;
import com.xingguang.customer.info.service.ICusUserInfoService;
import com.xingguang.customer.link.entity.CusUserLink;
import com.xingguang.customer.link.entity.CusUserLinkExample;
import com.xingguang.customer.link.service.ICusUserLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class CusUserInfoServiceImpl implements ICusUserInfoService {

    @Autowired
    private CusUserInfoMapper cusUserInfoMapper;

    @Autowired
    private ICusUserLinkService cusUserLinkService;

    @Override
    public int create(CusUserInfo cusUserInfo) {
        cusUserInfo.setCreateTime(new Date());
        return this.cusUserInfoMapper.insertSelective(cusUserInfo);
    }

    @Override
    public int update(CusUserInfo cusUserInfo) {
        return this.cusUserInfoMapper.updateByPrimaryKeySelective(cusUserInfo);
    }

    @Override
    public int update(UserInfoParam userInfoParam) {
        CusUserLink cusUserLink = userInfoParam.getCusUserLink();
        CusUserLinkExample example = new CusUserLinkExample();
        example.createCriteria().andCusUserIdEqualTo(cusUserLink.getCusUserId());
        this.cusUserLinkService.delete(example);
        this.cusUserLinkService.create(cusUserLink);
        return this.cusUserInfoMapper.updateByPrimaryKeySelective(userInfoParam.getCusUserInfo());
    }

    @Override
    @Transactional(readOnly = true)
    public CusUserInfo findById(Long id) {
        return  this.cusUserInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = true)
    public CusUserInfo findByPhone(String phone) {
        CusUserInfoExample example = new CusUserInfoExample();
        example.createCriteria().andPhoneEqualTo(phone);
        example.setLimit(1);
        List<CusUserInfo> list = this.cusUserInfoMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(list)){
            return null;
        }
        return list.get(0);
    }
}
