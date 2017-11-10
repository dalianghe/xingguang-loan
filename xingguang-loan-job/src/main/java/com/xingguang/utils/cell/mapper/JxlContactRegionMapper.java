package com.xingguang.utils.cell.mapper;

import com.xingguang.utils.cell.entity.JxlContactRegionEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  12:15
 * @Version v1.0.0
 */
public interface JxlContactRegionMapper {

    void deleteContactRegionByRptId(Long rptId) throws Exception;

    void insertContactRegion(List<JxlContactRegionEntity> contactRegionEntity) throws Exception;

}
