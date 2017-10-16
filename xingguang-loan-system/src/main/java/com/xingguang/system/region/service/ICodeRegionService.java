package com.xingguang.system.region.service;

import com.xingguang.system.region.entity.CodeRegionEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/16.
 */
public interface ICodeRegionService {

    public List<CodeRegionEntity> findRegionList(Long pId) throws Exception;
}
