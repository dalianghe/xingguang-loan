package com.xingguang.customer.wdrl.service.impl;

import com.xingguang.customer.credit.entity.CreditInfo;
import com.xingguang.customer.credit.service.ICreditInfoService;
import com.xingguang.customer.wdrl.entity.WdrlApply;
import com.xingguang.customer.wdrl.entity.WdrlApplyExample;
import com.xingguang.customer.wdrl.mapper.WdrlApplyMapper;
import com.xingguang.customer.wdrl.service.IWdrlApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@Service
@Transactional
public class WdrlApplyServiceImpl implements IWdrlApplyService {

    @Autowired
    private WdrlApplyMapper wdrlApplyMapper;

    @Autowired
    private ICreditInfoService creditInfoService;

    @Override
    public int create(WdrlApply wdrlApply) {
        final CreditInfo creditInfo = this.creditInfoService.findByCusUserId(wdrlApply.getCusUserId());
        creditInfo.setUnusedAmount(creditInfo.getUnusedAmount().subtract(wdrlApply.getAmount()));
        creditInfo.setUsedAmount(creditInfo.getUsedAmount() == null ? wdrlApply.getAmount() : creditInfo.getUsedAmount().add(wdrlApply.getAmount()));
        CreditInfo creditInfoNew = new CreditInfo();
        creditInfoNew.setId(creditInfo.getId());
        creditInfoNew.setUnusedAmount(creditInfo.getUnusedAmount().subtract(wdrlApply.getAmount()));
        creditInfoNew.setUsedAmount(creditInfo.getUsedAmount().add(wdrlApply.getAmount()));
        this.creditInfoService.update(creditInfoNew);
        return this.wdrlApplyMapper.insertSelective(wdrlApply);
    }

    @Override
    public int update(WdrlApply wdrlApply) {
        return this.wdrlApplyMapper.updateByPrimaryKeySelective(wdrlApply);
    }

    @Override
    public List<WdrlApply> getWdrlApplyList(WdrlApplyExample example) {
        return this.wdrlApplyMapper.selectByExample(example);
    }
}
