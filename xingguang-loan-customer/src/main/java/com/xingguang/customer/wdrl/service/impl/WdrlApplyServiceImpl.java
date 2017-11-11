package com.xingguang.customer.wdrl.service.impl;

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

    @Override
    public int create(WdrlApply wdrlApply){
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
