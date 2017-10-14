package com.xingguang.customer.credit.service.impl;

import com.xingguang.customer.credit.entity.CreditApply;
import com.xingguang.customer.credit.mapper.CreditApplyMapper;
import com.xingguang.customer.credit.params.CreditApplyParam;
import com.xingguang.customer.credit.service.ICreditApplyService;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.service.ICusUserInfoService;
import com.xingguang.customer.link.entity.CusUserLink;
import com.xingguang.customer.link.entity.CusUserLinkExample;
import com.xingguang.customer.link.service.ICusUserLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class CreditApplyServiceImpl implements ICreditApplyService {

    @Autowired
    private CreditApplyMapper creditApplyMapper;
    @Autowired
    private ICusUserInfoService cusUserInfoService;
    @Autowired
    private ICusUserLinkService cusUserLinkService;


    @Override
    public void create(CreditApplyParam creditApplyParam){
        CreditApply creditApply = creditApplyParam.getCreditApply();
        this.creditApplyMapper.insertSelective(creditApply);

        CusUserInfo cusUserInfo = creditApplyParam.getCusUserInfo();
        this.cusUserInfoService.update(cusUserInfo);

        CusUserLink cusUserLink = creditApplyParam.getCusUserLink();
        CusUserLinkExample example = new CusUserLinkExample();
        example.createCriteria().andCusUserIdEqualTo(cusUserLink.getCusUserId());
        this.cusUserLinkService.delete(example);
        this.cusUserLinkService.create(cusUserLink);

    }
}
