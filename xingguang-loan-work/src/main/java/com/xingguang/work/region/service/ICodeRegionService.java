package com.xingguang.work.region.service;

import com.xingguang.work.region.entity.CodeRegionEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/16.
 */
public interface ICodeRegionService {

    public List<CodeRegionEntity> findRegionList(Long pId) throws Exception;
}
