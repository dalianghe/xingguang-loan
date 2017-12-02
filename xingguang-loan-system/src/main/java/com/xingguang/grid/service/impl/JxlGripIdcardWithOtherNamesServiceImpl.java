package com.xingguang.grid.service.impl;

import com.alibaba.fastjson.JSON;
import com.xingguang.grid.entity.JxlGridIdcardAppliedInOrgsEntity;
import com.xingguang.grid.entity.JxlGridIdcardWithOtherNamesEntity;
import com.xingguang.grid.mapper.JxlGridIdcardAppliedInOrgsMapper;
import com.xingguang.grid.mapper.JxlGridIdcardWithOtherNamesMapper;
import com.xingguang.grid.service.IJxlGridIdcardAppliedInOrgsService;
import com.xingguang.grid.service.IJxlGridIdcardWithOtherNamesService;
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
public class JxlGripIdcardWithOtherNamesServiceImpl implements IJxlGridIdcardWithOtherNamesService {

    @Autowired
    private JxlGridIdcardWithOtherNamesMapper idcardWithOtherNamesMapper;

    @Override
    @Transactional
    public void deleteIdcardWithOtherNamesBybizId(Long bizId) throws Exception {
        idcardWithOtherNamesMapper.deleteIdcardWithOtherNamesByBizId(bizId);
    }

    @Override
    @Transactional
    public void insertIdcardWithOtherNames(List<JxlGridIdcardWithOtherNamesEntity> list) throws Exception {
        idcardWithOtherNamesMapper.insertIdcardWithOtherNames(list);
    }

    @Override
    @Transactional
    public List<JxlGridIdcardWithOtherNamesEntity> addIdcardWithOtherNames(Long bizId, Long gridId, String json) throws Exception {
        List<JxlGridIdcardWithOtherNamesEntity> list = JSON.parseArray(json , JxlGridIdcardWithOtherNamesEntity.class);
        if(list!=null && list.size()>0){
            this.deleteIdcardWithOtherNamesBybizId(bizId);
            for(JxlGridIdcardWithOtherNamesEntity entity : list){
                entity.setBizId(bizId);
                entity.setGridId(gridId);
            }
            this.insertIdcardWithOtherNames(list);
        }
        return list;
    }
}
