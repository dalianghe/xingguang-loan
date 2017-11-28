package com.xingguang.utils.cell.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.xingguang.utils.cell.entity.JxlBehaviorCheckEntity;
import com.xingguang.utils.cell.entity.JxlCellBehaviorEntity;
import com.xingguang.utils.cell.mapper.JxlBehaviorCheckMapper;
import com.xingguang.utils.cell.service.IJxlBehaviorCheckService;
import com.xingguang.utils.cell.service.IJxlCellBehaviorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/28  10:50
 * @Version v1.0.0
 */
@Service
public class JxlBehaviorCheckServiceImpl implements IJxlBehaviorCheckService {

    @Autowired
    private JxlBehaviorCheckMapper behaviorCheckMapper;

    @Override
    public void deleteBehaviorCheckByBizId(Long bizId) throws Exception {
        behaviorCheckMapper.deleteBehaviorCheckByRptId(bizId);
    }

    @Override
    public void insertBehaviorCheck(List<JxlBehaviorCheckEntity> list) throws Exception {
        behaviorCheckMapper.insertBehaviorCheck(list);
    }

    @Override
    public List<JxlBehaviorCheckEntity> addBehaviorCheck(Long oldRptId, Long newRptId, String json) throws Exception {
        this.deleteBehaviorCheckByBizId(oldRptId);
        // 插入
        List<JxlBehaviorCheckEntity> list = JSON.parseArray(json , JxlBehaviorCheckEntity.class);
        if(list != null){
            for(JxlBehaviorCheckEntity entity : list){
                entity.setRptId(newRptId);
            }
            this.insertBehaviorCheck(list);
        }
        return list;
    }
}
