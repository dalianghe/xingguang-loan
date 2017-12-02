package com.xingguang.grid.service;

import com.alibaba.fastjson.JSONObject;
import com.xingguang.grid.entity.JxlGridUserGrayEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  13:41
 * @Version v1.0.0
 */
public interface IJxlGridUserGrayService {

    public void deleteGridUserGrayByBizId(Long bizId) throws Exception;

    public void insertGridUserGray(JxlGridUserGrayEntity entity) throws Exception;

    public void addGridUserGray(Long bizId , Long gridId , String json) throws Exception;

}
