package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridConsumerLabelEntity;
import com.xingguang.grid.entity.JxlGridUserBasicEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  13:05
 * @Version v1.0.0
 */
public interface IJxlGridConsumerLabelService {

    public void deleteConsumerLabelByBizId(Long bizId) throws Exception;

    public void insertConsumerLabel(JxlGridConsumerLabelEntity entity) throws Exception;

    public JxlGridConsumerLabelEntity addConsumerLabel(Long bizId, JxlGridConsumerLabelEntity entity) throws Exception;

}
