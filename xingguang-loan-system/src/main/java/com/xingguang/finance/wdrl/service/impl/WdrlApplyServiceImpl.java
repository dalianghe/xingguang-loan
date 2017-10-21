package com.xingguang.finance.wdrl.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xingguang.finance.wdrl.domain.WdrlDomain;
import com.xingguang.finance.wdrl.entity.WdrlApplyEntity;
import com.xingguang.finance.wdrl.entity.custom.WdrlApplyEntityCuston;
import com.xingguang.finance.wdrl.mapper.WdrlApplyMapper;
import com.xingguang.finance.wdrl.service.IWdrlApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/10/15.
 */
@Service
public class WdrlApplyServiceImpl implements IWdrlApplyService {

    @Autowired
    private WdrlApplyMapper wdrlApplyMapper;

    @Override
    public Map<String, Object> findWdrlApplyList(WdrlDomain domain) throws Exception {
        WdrlApplyEntity entity = new WdrlApplyEntity();
        entity.setCusUserName(domain.getCusUserName());
        PageHelper.startPage(domain.getPager().get("page"), domain.getPager().get("pageSize"));
        List<WdrlApplyEntityCuston> applies = wdrlApplyMapper.findWdrlApplyList(entity);
        Map<String,Object> map = new HashMap<>();
        map.put("applies" , applies);
        map.put("total" , ((Page) applies).getTotal());
        return map;
    }

    @Override
    public void paypal(WdrlDomain domain) throws Exception {
        WdrlApplyEntity entity = new WdrlApplyEntity();
        BeanUtils.copyProperties(domain,entity);
        wdrlApplyMapper.updateWdrlApply(entity);
    }

    @Override
    public void stopPaypal(WdrlDomain domain) throws Exception {
        WdrlApplyEntity entity = new WdrlApplyEntity();
        BeanUtils.copyProperties(domain,entity);
        wdrlApplyMapper.updateWdrlApply(entity);
    }

}
