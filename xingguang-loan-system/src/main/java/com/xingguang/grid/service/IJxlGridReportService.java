package com.xingguang.grid.service;

import com.xingguang.grid.entity.JxlGridReportEntity;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/12/2  11:17
 * @Version v1.0.0
 */
public interface IJxlGridReportService {

    public boolean resolveGridReport(Long oldBizId,String json) throws Exception;

    public JxlGridReportEntity selectGridReportByBizId(Long bizId) throws Exception;

    public void deleteGridReportByBizId(Long bizId) throws Exception;

    public void insertGridReport(JxlGridReportEntity entity) throws Exception;

    public JxlGridReportEntity addGridReport(Long oldBizId , JxlGridReportEntity entity) throws Exception;

}
