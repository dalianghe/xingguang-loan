package com.xingguang.utils.cell.service;

import com.alibaba.fastjson.JSONArray;
import com.xingguang.utils.cell.entity.JxlCellBehaviorEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  10:12
 * @Version v1.0.0
 */
public interface IJxlCellBehaviorService {

    public void deleteCellBehaviorByRptId(Long rptId) throws Exception;

    public void insertCellBehavior(List<JxlCellBehaviorEntity> list) throws Exception;

    public List<JxlCellBehaviorEntity> addCellBehavior(Long oldRptId , Long newRptId, JSONArray json) throws Exception;

}
