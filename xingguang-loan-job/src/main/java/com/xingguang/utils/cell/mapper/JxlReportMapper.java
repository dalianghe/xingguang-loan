package com.xingguang.utils.cell.mapper;

import com.xingguang.utils.cell.entity.JxlReportEntity;

/**
 * Created by admin on 2017/11/9.
 */
public interface JxlReportMapper {

    JxlReportEntity selectJxlReportByBizId(Long bizId) throws Exception;

    void deleteJxlReport(Long bizId) throws Exception;

    void insertJxlReport(JxlReportEntity reportEntity) throws Exception;

}
