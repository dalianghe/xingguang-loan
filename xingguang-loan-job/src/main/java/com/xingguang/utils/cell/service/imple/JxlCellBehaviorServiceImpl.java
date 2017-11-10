package com.xingguang.utils.cell.service.imple;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xingguang.utils.cell.entity.JxlCellBehaviorEntity;
import com.xingguang.utils.cell.mapper.JxlCellBehaviorMapper;
import com.xingguang.utils.cell.service.IJxlCellBehaviorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  10:14
 * @Version v1.0.0
 */
@Service
public class JxlCellBehaviorServiceImpl implements IJxlCellBehaviorService {

    @Autowired
    private JxlCellBehaviorMapper cellBehaviorMapper;

    @Override
    @Transactional
    public void deleteCellBehaviorByRptId(Long rptId) throws Exception {
        cellBehaviorMapper.deleteCellBehavior(rptId);
    }

    @Override
    @Transactional
    public void insertCellBehavior(List<JxlCellBehaviorEntity> list) throws Exception {
        cellBehaviorMapper.insertCellBehavior(list);
    }

    @Override
    @Transactional
    public List<JxlCellBehaviorEntity> addCellBehavior(Long oldRptId , Long newRptId, JSONArray json) throws Exception {
        // 删除
        this.deleteCellBehaviorByRptId(oldRptId);
        // 插入
        List<JxlCellBehaviorEntity> list = JSON.parseArray(json.getJSONObject(0).getString("behavior") , JxlCellBehaviorEntity.class);
        if(list != null){
            for(JxlCellBehaviorEntity entity : list){
                entity.setRptId(newRptId);
            }
            this.insertCellBehavior(list);
        }
        return list;
    }
}
