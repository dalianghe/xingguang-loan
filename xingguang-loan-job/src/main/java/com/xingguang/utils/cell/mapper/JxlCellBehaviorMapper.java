package com.xingguang.utils.cell.mapper;

import com.xingguang.utils.cell.entity.JxlCellBehaviorEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  10:07
 * @Version v1.0.0
 */
public interface JxlCellBehaviorMapper {

    void deleteCellBehavior(Long rptId) throws Exception;

    void insertCellBehavior(List<JxlCellBehaviorEntity> list) throws Exception;

}
