package com.xingguang.utils.cell.service;

import com.alibaba.fastjson.JSONArray;
import com.xingguang.utils.cell.entity.JxlApplicatinoCheckEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/27  16:24
 * @Version v1.0.0
 */
public interface IJxlApplicationCheckService {

    public void deleteApplicationCheckByRptId(Long rptId) throws Exception;

    public void insertApplicationCheck(List<JxlApplicatinoCheckEntity> list) throws Exception;

    public List<JxlApplicatinoCheckEntity> addApplicationCheck(Long oldRptId , Long newRptId, JSONArray json) throws Exception;


}
