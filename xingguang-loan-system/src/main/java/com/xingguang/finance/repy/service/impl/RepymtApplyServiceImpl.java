package com.xingguang.finance.repy.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xingguang.finance.repy.domain.RepyDomain;
import com.xingguang.finance.repy.entity.custom.RepymtApplyEntityCustom;
import com.xingguang.finance.repy.mapper.RepymtApplyMapper;
import com.xingguang.finance.repy.service.IRepymtApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/1  18:03
 * @Version v1.0.0
 */
@Service
public class RepymtApplyServiceImpl implements IRepymtApplyService {

    @Autowired
    private RepymtApplyMapper repymtApplyMapper;

    @Override
    public Map<String, Object> findNormalRepymtList(RepyDomain repyDemain) throws Exception {
        PageHelper.startPage(repyDemain.getPager().get("page"), repyDemain.getPager().get("pageSize"));
        List<RepymtApplyEntityCustom> list = repymtApplyMapper.findNormalRepymtList("2017-11-06");
        Map<String,Object> map = new HashMap<>();
        map.put("applies" , list);
        map.put("total" , ((Page) list).getTotal());
        return map;
    }
}
