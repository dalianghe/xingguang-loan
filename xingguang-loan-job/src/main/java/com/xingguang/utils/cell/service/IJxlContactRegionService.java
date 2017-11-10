package com.xingguang.utils.cell.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xingguang.utils.cell.entity.JxlContactRegionEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  12:22
 * @Version v1.0.0
 */
public interface IJxlContactRegionService {

    public void deleteContactRegionByRptId(Long rptId) throws Exception;

    public void insertContactRegion(List<JxlContactRegionEntity> list) throws Exception;

    public List<JxlContactRegionEntity> addContactRegion(Long oldRptId , Long newRptId, String json) throws Exception;


}
