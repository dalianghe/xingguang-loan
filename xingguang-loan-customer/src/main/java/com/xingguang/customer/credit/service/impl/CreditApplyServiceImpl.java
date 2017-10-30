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
import com.xingguang.customer.worker.entity.WorkUserInfo;
import com.xingguang.customer.worker.service.IWorkUserInfoService;
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
    @Autowired
    private IWorkUserInfoService workUserInfoService;


    @Override
    public void create(CreditApplyParam creditApplyParam) {
        CusUserInfo cusUserInfo = creditApplyParam.getCusUserInfo();
        this.cusUserInfoService.update(cusUserInfo);

        CreditApply creditApply = creditApplyParam.getCreditApply();
        WorkUserInfo workUserInfo = this.workUserInfoService.getWorkUserByCusUserId(cusUserInfo.getId());
        creditApply.setApplyNo(workUserInfo.getCityId().toString());
        this.creditApplyMapper.insertSelectiveApplyNo(creditApply);

        /**
         select concat('171030130200', right('171030130200168001', 6) + 1) from credit_apply
         where apply_no like '171030130200%'
         limit 1
         */

        CusUserLink cusUserLink = creditApplyParam.getCusUserLink();
        CusUserLinkExample example = new CusUserLinkExample();
        example.createCriteria().andCusUserIdEqualTo(cusUserLink.getCusUserId());
        this.cusUserLinkService.delete(example);
        this.cusUserLinkService.create(cusUserLink);

    }
}
