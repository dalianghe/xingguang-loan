package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.xingguang.grid.entity.JxlGridIdcardWithOtherNamesEntity;
import com.xingguang.grid.entity.JxlGridIdcardWithOtherPhonesEntity;
import com.xingguang.grid.mapper.JxlGridIdcardWithOtherNamesMapper;
import com.xingguang.grid.mapper.JxlGridIdcardWithOtherPhonesMapper;
import com.xingguang.grid.service.IJxlGridIdcardWithOtherNamesService;
import com.xingguang.grid.service.IJxlGridIdcardWithOtherPhonesService;
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
public class JxlGripIdcardWithOtherPhonesServiceImpl implements IJxlGridIdcardWithOtherPhonesService {

    @Autowired
    private JxlGridIdcardWithOtherPhonesMapper idcardWithOtherPhonesMapper;

    @Override
    @Transactional
    public void deleteIdcardWithOtherPhonesBybizId(Long bizId) throws Exception {
        idcardWithOtherPhonesMapper.deleteIdcardWithOtherPhonesByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertIdcardWithOtherPhones(List<JxlGridIdcardWithOtherPhonesEntity> list) throws Exception {
        idcardWithOtherPhonesMapper.insertIdcardWithOtherPhones(list);
    }

    @Override
    @Transactional
    public List<JxlGridIdcardWithOtherPhonesEntity> addIdcardWithOtherPhones(Long bizId, Long gridId, String json) throws Exception {
        List<JxlGridIdcardWithOtherPhonesEntity> list = JSON.parseArray(json , JxlGridIdcardWithOtherPhonesEntity.class);
        if(list!=null && list.size()>0){
            this.deleteIdcardWithOtherPhonesBybizId(bizId);
            for(JxlGridIdcardWithOtherPhonesEntity entity : list){
                entity.setBizId(bizId);
                entity.setGridId(gridId);
            }
            this.insertIdcardWithOtherPhones(list);
        }
        return list;
    }
}
