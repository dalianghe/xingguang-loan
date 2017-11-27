package com.xingguang.cell.mapper;

import com.xingguang.cell.entity.JxlApplicationCheckIdCardEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/27  19:14
 * @Version v1.0.0
 */
public interface JxlApplicationCheckIdCardMapper {

    JxlApplicationCheckIdCardEntity findCheckIdCardByBizId(Long bizId) throws Exception;

}
