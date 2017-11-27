package com.xingguang.utils.cell.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xingguang.utils.cell.entity.JxlContactRegionEntity;
import com.xingguang.utils.cell.mapper.JxlContactRegionMapper;
import com.xingguang.utils.cell.service.IJxlContactRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  12:23
 * @Version v1.0.0
 */
@Service
public class JxlContactRegionServiceImpl implements IJxlContactRegionService {

    @Autowired
    private JxlContactRegionMapper contactRegionMapper;

    @Override
    @Transactional
    public void deleteContactRegionByRptId(Long rptId) throws Exception {
        contactRegionMapper.deleteContactRegionByRptId(rptId);
    }

    @Override
    @Transactional
    public void insertContactRegion(List<JxlContactRegionEntity> list) throws Exception {
        contactRegionMapper.insertContactRegion(list);
    }

    @Override
    @Transactional
    public List<JxlContactRegionEntity> addContactRegion(Long oldRptId, Long newRptId, String json) throws Exception {
        // 删除
        this.deleteContactRegionByRptId(oldRptId);
        // 插入
        List<JxlContactRegionEntity> list = JSON.parseArray(json , JxlContactRegionEntity.class);
        if(list != null){
            for(JxlContactRegionEntity entity : list){
                entity.setRptId(newRptId);
            }
            this.insertContactRegion(list);
        }
        return list;
    }
}
