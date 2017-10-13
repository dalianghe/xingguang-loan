package com.xingguang.cus.baseinfo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xingguang.cus.baseinfo.domain.CusUserDomain;
import com.xingguang.cus.baseinfo.entity.CusUserInfoEntity;
import com.xingguang.cus.baseinfo.entity.custom.CusUserInfoEntityCustom;
import com.xingguang.cus.baseinfo.mapper.CusUserInfoMapper;
import com.xingguang.cus.baseinfo.service.ICusUserInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/10/11.
 */
@Service
public class CusUserInfoServiceImpl implements ICusUserInfoService {

    @Autowired
    private CusUserInfoMapper cusUserInfoMapper;

    @Override
    public Map<String, Object> findCusUserAll(CusUserDomain domain) throws Exception {
        CusUserInfoEntity cusUserInfoEntity = new CusUserInfoEntity();
        cusUserInfoEntity.setName(domain.getName());
        PageHelper.startPage(domain.getPager().get("page"), domain.getPager().get("pageSize"));
        BeanUtils.copyProperties(domain,cusUserInfoEntity);
        List<CusUserInfoEntityCustom> users = cusUserInfoMapper.findCusUserList(cusUserInfoEntity);
        Map<String,Object> map = new HashMap<>();
        map.put("users" , users);
        map.put("total" , ((Page) users).getTotal());
        return map;
    }

    @Override
    public Map<String, Object> findCreditTodoCusUser(CusUserDomain domain) throws Exception {
        CusUserInfoEntity cusUserInfoEntity = new CusUserInfoEntity();
        cusUserInfoEntity.setName(domain.getName());
        PageHelper.startPage(domain.getPager().get("page"), domain.getPager().get("pageSize"));
        BeanUtils.copyProperties(domain,cusUserInfoEntity);
        List<CusUserInfoEntityCustom> users = cusUserInfoMapper.findCreditTodoCusUserList(cusUserInfoEntity);
        Map<String,Object> map = new HashMap<>();
        map.put("users" , users);
        map.put("total" , ((Page) users).getTotal());
        return map;
    }

    @Override
    public CusUserInfoEntityCustom findCusUserById(Long userId) throws Exception {
        return cusUserInfoMapper.findCusUserById(userId);
    }
}
