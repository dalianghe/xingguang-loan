package com.xingguang.utils.cell.service;

import com.alibaba.fastjson.JSONObject;
import com.xingguang.utils.cell.entity.JxlReportEntity;

/**
 * Created by admin on 2017/11/9.
 */
public interface IJxlReportService {

    public void deleteJxlReport(Long bizId) throws Exception;

    public JxlReportEntity insertJxlReport(JxlReportEntity reportEntity) throws Exception;

    public JxlReportEntity addJxlReport(Long bizId , JSONObject json) throws Exception;

}
