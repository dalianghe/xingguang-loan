package com.xingguang.utils.cell.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.xingguang.utils.cell.entity.JxlReportEntity;
import com.xingguang.utils.cell.mapper.JxlReportMapper;
import com.xingguang.utils.cell.service.IJxlReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Map;

/**
 * Created by admin on 2017/11/9.
 */
@Service
public class JxlReportServiceImpl implements IJxlReportService {

    @Autowired
    private JxlReportMapper reportMapper;

    @Override
    public JxlReportEntity selectJxlReportByBizId(Long bizId) throws Exception {
        return reportMapper.selectJxlReportByBizId(bizId);
    }

    @Override
    @Transactional
    public void deleteJxlReport(Long bizId) throws Exception {
        reportMapper.deleteJxlReport(bizId);
    }

    @Override
    @Transactional
    public JxlReportEntity insertJxlReport(JxlReportEntity reportEntity) throws Exception {
        reportMapper.insertJxlReport(reportEntity);
        return reportEntity;
    }

    @Override
    @Transactional
    public JxlReportEntity addJxlReport(Long bizId, JSONObject json) throws Exception {
        // step 1: 删除
        this.deleteJxlReport(bizId);
        // step 2:插入
        Map<String, String> params = JSONObject.parseObject(json.toJSONString(), new TypeReference<Map<String, String>>(){});
        JxlReportEntity reportEntity = new JxlReportEntity();
        reportEntity.setBizId(bizId);
        reportEntity.setRptId(params.get("rpt_id"));
        reportEntity.setToken(params.get("token"));
        reportEntity.setVersion(params.get("version"));
        reportEntity.setUpdateTime(params.get("update_time"));
        reportEntity.setCreateTime(new Date());
        this.insertJxlReport(reportEntity);
        return reportEntity;
    }

}
