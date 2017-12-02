package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.xingguang.grid.entity.JxlGridPhoneWithOtherIdcardsEntity;
import com.xingguang.grid.entity.JxlGridPhoneWithOtherNamesEntity;
import com.xingguang.grid.mapper.JxlGridPhoneWithOtherIdcardsMapper;
import com.xingguang.grid.mapper.JxlGridPhoneWithOtherNamesMapper;
import com.xingguang.grid.service.IJxlGridPhoneWithOtherIdcardsService;
import com.xingguang.grid.service.IJxlGridPhoneWithOtherNamesService;
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
public class JxlGripPhoneWithOtherNamesServiceImpl implements IJxlGridPhoneWithOtherNamesService {

    @Autowired
    private JxlGridPhoneWithOtherNamesMapper phoneWithOtherNamesMapper;

    @Override
    @Transactional
    public void deletePhoneWithOtherNamesBybizId(Long bizId) throws Exception {
        phoneWithOtherNamesMapper.deletePhoneWithOtherNamesByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertPhoneWithOtherNames(List<JxlGridPhoneWithOtherNamesEntity> list) throws Exception {
        phoneWithOtherNamesMapper.insertPhoneWithOtherNames(list);
    }

    @Override
    @Transactional
    public List<JxlGridPhoneWithOtherNamesEntity> addPhoneWithOtherNames(Long bizId, Long gridId, String json) throws Exception {
        List<JxlGridPhoneWithOtherNamesEntity> list = JSON.parseArray(json , JxlGridPhoneWithOtherNamesEntity.class);
        if(list!=null && list.size()>0){
            this.deletePhoneWithOtherNamesBybizId(bizId);
            for(JxlGridPhoneWithOtherNamesEntity entity : list){
                entity.setBizId(bizId);
                entity.setGridId(gridId);
            }
            this.insertPhoneWithOtherNames(list);
        }
        return list;
    }
}
