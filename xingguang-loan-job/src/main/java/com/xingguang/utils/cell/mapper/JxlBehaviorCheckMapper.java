package com.xingguang.utils.cell.mapper;

import com.xingguang.utils.cell.entity.JxlBehaviorCheckEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/28  10:43
 * @Version v1.0.0
 */
public interface JxlBehaviorCheckMapper {

    void deleteBehaviorCheckByRptId(Long rptId) throws Exception;

    void insertBehaviorCheck(List<JxlBehaviorCheckEntity> entity) throws Exception;

}
