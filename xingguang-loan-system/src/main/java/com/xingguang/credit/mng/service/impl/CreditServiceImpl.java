package com.xingguang.credit.mng.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xingguang.credit.mng.domain.CreditDomain;
import com.xingguang.credit.mng.entity.CreditEntity;
import com.xingguang.credit.mng.mapper.CreditMapper;
import com.xingguang.credit.mng.service.ICreditService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/10/18.
 */
@Service
public class CreditServiceImpl implements ICreditService {

    @Autowired
    private CreditMapper creditMapper;

    @Override
    public Map<String, Object> findCreditList(CreditDomain creditDomain) throws Exception {
        CreditEntity creditEntity = new CreditEntity();
        PageHelper.startPage(creditDomain.getPager().get("page"), creditDomain.getPager().get("pageSize"));
        BeanUtils.copyProperties(creditDomain, creditEntity);
        List<CreditEntity> entities = creditMapper.findCreditList(creditEntity);
        Map<String,Object> map = new HashMap<>();
        map.put("users" , entities);
        map.put("total" , ((Page) entities).getTotal());
        return map;
    }

    @Override
    public void lockCreditByCusId(Long cusUserId) throws Exception {
        creditMapper.lockCreditByCusId(cusUserId);
    }
}
