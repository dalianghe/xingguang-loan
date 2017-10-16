package com.xingguang.system.region.mapper;

import com.xingguang.system.region.entity.CodeRegionEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/16.
 */
public interface CodeRegionMapper {

    List<CodeRegionEntity> findRegionList(Long id) throws Exception;

}
