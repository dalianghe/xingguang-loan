package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.xingguang.grid.entity.JxlGridPhoneAppliedInOrgsEntity;
import com.xingguang.grid.entity.JxlGridPhoneWithOtherIdcardsEntity;
import com.xingguang.grid.mapper.JxlGridPhoneAppliedInOrgsMapper;
import com.xingguang.grid.mapper.JxlGridPhoneWithOtherIdcardsMapper;
import com.xingguang.grid.service.IJxlGridPhoneAppliedInOrgsService;
import com.xingguang.grid.service.IJxlGridPhoneWithOtherIdcardsService;
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
public class JxlGripPhoneWithOtherIdcardsServiceImpl implements IJxlGridPhoneWithOtherIdcardsService {

    @Autowired
    private JxlGridPhoneWithOtherIdcardsMapper phoneWithOtherIdcardsMapper;

    @Override
    @Transactional
    public void deletePhoneWithOtherIdcardsBybizId(Long bizId) throws Exception {
        phoneWithOtherIdcardsMapper.deletePhoneWithOtherIdcardsByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertPhoneWithOtherIdcards(List<JxlGridPhoneWithOtherIdcardsEntity> list) throws Exception {
        phoneWithOtherIdcardsMapper.insertPhoneWithOtherIdcards(list);
    }

    @Override
    @Transactional
    public List<JxlGridPhoneWithOtherIdcardsEntity> addPhoneWithOtherIdcards(Long bizId, Long gridId, String json) throws Exception {
        List<JxlGridPhoneWithOtherIdcardsEntity> list = JSON.parseArray(json , JxlGridPhoneWithOtherIdcardsEntity.class);
        if(list!=null && list.size()>0){
            this.deletePhoneWithOtherIdcardsBybizId(bizId);
            for(JxlGridPhoneWithOtherIdcardsEntity entity : list){
                entity.setBizId(bizId);
                entity.setGridId(gridId);
            }
            this.insertPhoneWithOtherIdcards(list);
        }
        return list;
    }
}
