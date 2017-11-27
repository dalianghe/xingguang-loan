package com.xingguang.utils.cell.mapper;

import com.xingguang.utils.cell.entity.JxlApplicationCheckCellPhoneEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/27  20:15
 * @Version v1.0.0
 */
public interface JxlApplicationCheckCellPhoneMapper {

    void deleteCheckCellPhoneByRptId(Long rptId) throws Exception;

    void insertCheckCellPhone(JxlApplicationCheckCellPhoneEntity entity) throws Exception;

}
