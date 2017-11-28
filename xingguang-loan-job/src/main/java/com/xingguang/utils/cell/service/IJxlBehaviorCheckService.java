package com.xingguang.utils.cell.service;

import com.alibaba.fastjson.JSONArray;
import com.xingguang.utils.cell.entity.JxlBehaviorCheckEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/28  10:48
 * @Version v1.0.0
 */
public interface IJxlBehaviorCheckService {

    public void deleteBehaviorCheckByBizId(Long bizId) throws Exception;

    public void insertBehaviorCheck(List<JxlBehaviorCheckEntity> list) throws Exception;

    public List<JxlBehaviorCheckEntity> addBehaviorCheck(Long oldRptId , Long newRptId, String json) throws Exception;


}
