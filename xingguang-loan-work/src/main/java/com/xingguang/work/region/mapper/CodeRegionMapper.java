package com.xingguang.work.region.mapper;

import com.xingguang.work.region.entity.CodeRegionEntity;

import java.util.List;

/**
 * Created by admin on 2017/10/16.
 */
public interface CodeRegionMapper {

    List<CodeRegionEntity> findRegionList(Long id) throws Exception;

}
