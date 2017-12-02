package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.xingguang.grid.entity.JxlGridPhoneAppliedInOrgsEntity;
import com.xingguang.grid.mapper.JxlGridPhoneAppliedInOrgsMapper;
import com.xingguang.grid.service.IJxlGridPhoneAppliedInOrgsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  18:04
 * @Version v1.0.0
 */
@Service
public class JxlGripPhoneAppliedInOrgsServiceImpl implements IJxlGridPhoneAppliedInOrgsService {

    @Autowired
    private JxlGridPhoneAppliedInOrgsMapper phoneAppliedInOrgsMapper;

    @Override
    @Transactional
    public void deletePhoneAppliedInOrgsBybizId(Long bizId) throws Exception {
        phoneAppliedInOrgsMapper.deletePhoneAppliedInOrgsByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertPhoneAppliedInOrgs(List<JxlGridPhoneAppliedInOrgsEntity> list) throws Exception {
        phoneAppliedInOrgsMapper.insertPhoneAppliedInOrgs(list);
    }

    @Override
    @Transactional
    public List<JxlGridPhoneAppliedInOrgsEntity> addPhoneAppliedInOrgs(Long bizId, Long gridId, String json) throws Exception {
        List<JxlGridPhoneAppliedInOrgsEntity> list = JSON.parseArray(json , JxlGridPhoneAppliedInOrgsEntity.class);
        if(list!=null && list.size()>0){
            this.deletePhoneAppliedInOrgsBybizId(bizId);
            for(JxlGridPhoneAppliedInOrgsEntity entity : list){
                entity.setBizId(bizId);
                entity.setGridId(gridId);
            }
            this.insertPhoneAppliedInOrgs(list);
        }
        return list;
    }
}
