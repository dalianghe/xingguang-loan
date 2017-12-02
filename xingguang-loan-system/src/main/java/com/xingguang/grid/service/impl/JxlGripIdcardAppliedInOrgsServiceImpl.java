package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.xingguang.grid.entity.JxlGridIdcardAppliedInOrgsEntity;
import com.xingguang.grid.entity.JxlGridPhoneAppliedInOrgsEntity;
import com.xingguang.grid.mapper.JxlGridIdcardAppliedInOrgsMapper;
import com.xingguang.grid.mapper.JxlGridPhoneAppliedInOrgsMapper;
import com.xingguang.grid.service.IJxlGridIdcardAppliedInOrgsService;
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
public class JxlGripIdcardAppliedInOrgsServiceImpl implements IJxlGridIdcardAppliedInOrgsService {

    @Autowired
    private JxlGridIdcardAppliedInOrgsMapper idcardAppliedInOrgsMapper;

    @Override
    @Transactional
    public void deleteIdcardAppliedInOrgsBybizId(Long bizId) throws Exception {
        idcardAppliedInOrgsMapper.deleteIdcardAppliedInOrgsByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertIdcardAppliedInOrgs(List<JxlGridIdcardAppliedInOrgsEntity> list) throws Exception {
        idcardAppliedInOrgsMapper.insertIdcardAppliedInOrgs(list);
    }

    @Override
    @Transactional
    public List<JxlGridIdcardAppliedInOrgsEntity> addIdcardAppliedInOrgs(Long bizId, Long gridId, String json) throws Exception {
        List<JxlGridIdcardAppliedInOrgsEntity> list = JSON.parseArray(json , JxlGridIdcardAppliedInOrgsEntity.class);
        if(list!=null && list.size()>0){
            this.deleteIdcardAppliedInOrgsBybizId(bizId);
            for(JxlGridIdcardAppliedInOrgsEntity entity : list){
                entity.setBizId(bizId);
                entity.setGridId(gridId);
            }
            this.insertIdcardAppliedInOrgs(list);
        }
        return list;
    }
}
