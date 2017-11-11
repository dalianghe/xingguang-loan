package com.xingguang.cell.mapper;

import com.xingguang.cell.entity.JxlContactRegionEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  12:15
 * @Version v1.0.0
 */
public interface JxlContactRegionMapper {

    List<JxlContactRegionEntity> getContactRegionByBizId(Long bizId) throws Exception;

}
