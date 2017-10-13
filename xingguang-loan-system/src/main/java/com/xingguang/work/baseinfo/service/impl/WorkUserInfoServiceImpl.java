package com.xingguang.work.baseinfo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xingguang.work.baseinfo.domain.WorkUserDomain;
import com.xingguang.work.baseinfo.entity.WorkUserInfoEntity;
import com.xingguang.work.baseinfo.entity.custom.WorkUserInfoEntityCustom;
import com.xingguang.work.baseinfo.mapper.WorkUserInfoMapper;
import com.xingguang.work.baseinfo.service.IWorkUserInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/10  15:12
 * @Version v1.0.0
 */
@Service
public class WorkUserInfoServiceImpl implements IWorkUserInfoService {

    @Autowired
    private WorkUserInfoMapper workUserInfoMapper;

    @Override
    public Map<String , Object> findWorkUserAll(WorkUserDomain domain) throws Exception {
        WorkUserInfoEntity entity = new WorkUserInfoEntity();
        entity.setName(domain.getName());
        PageHelper.startPage(domain.getPager().get("page"), domain.getPager().get("pageSize"));
        List<WorkUserInfoEntityCustom> users = workUserInfoMapper.findWorkUserList(entity);
        Map<String,Object> map = new HashMap<>();
        map.put("users" , users);
        map.put("total" , ((Page) users).getTotal());
        return map;
    }

    @Override
    public WorkUserInfoEntityCustom findWorkUserById(Long userId) throws Exception {
        return workUserInfoMapper.findWorkUserById(userId);
    }

    @Override
    public WorkUserInfoEntityCustom findWorkUserByCusId(Long cusUserId) throws Exception {
        return workUserInfoMapper.findWorkUserByCusId(cusUserId);
    }

    @Override
    public void updateWorkUserById(WorkUserDomain domain) throws Exception {
        WorkUserInfoEntity entity = new WorkUserInfoEntity();
        BeanUtils.copyProperties(domain,entity);
        workUserInfoMapper.updateWorkUserById(entity);
    }
}
