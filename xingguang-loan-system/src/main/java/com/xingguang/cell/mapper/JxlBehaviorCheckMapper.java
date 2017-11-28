package com.xingguang.cell.mapper;

import com.xingguang.cell.entity.JxlBehaviorCheckEntity;

import java.util.List;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/28  11:32
 * @Version v1.0.0
 */
public interface JxlBehaviorCheckMapper {
    List<JxlBehaviorCheckEntity> getBehaviorCheckByBizId(Long bizId) throws Exception;
}
