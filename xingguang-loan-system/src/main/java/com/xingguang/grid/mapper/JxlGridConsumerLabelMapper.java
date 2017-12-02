package com.xingguang.grid.mapper;

import com.xingguang.grid.entity.JxlGridConsumerLabelEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  11:09
 * @Version v1.0.0
 */
public interface JxlGridConsumerLabelMapper {

    void deleteConsumerLabelBizId(Long bizId) throws Exception;

    void insertConsumerLabel(JxlGridConsumerLabelEntity entity) throws Exception;

}
