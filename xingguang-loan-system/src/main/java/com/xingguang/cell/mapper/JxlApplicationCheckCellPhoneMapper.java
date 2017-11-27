package com.xingguang.cell.mapper;

import com.xingguang.cell.entity.JxlApplicationCheckCellPhoneEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/27  20:15
 * @Version v1.0.0
 */
public interface JxlApplicationCheckCellPhoneMapper {

    JxlApplicationCheckCellPhoneEntity findCheckCellPhoneByBizId(Long bizId) throws Exception;

}
