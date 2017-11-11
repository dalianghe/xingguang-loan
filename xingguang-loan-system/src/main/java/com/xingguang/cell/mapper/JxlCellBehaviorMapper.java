package com.xingguang.cell.mapper;

import com.xingguang.cell.entity.JxlCellBehaviorEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/10  10:07
 * @Version v1.0.0
 */
public interface JxlCellBehaviorMapper {

    List<JxlCellBehaviorEntity> getCellBehaviorByBizId(Long bizId) throws Exception;

}
